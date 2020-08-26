package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheBehavior extends js.Object {
  /**
    * The cache behavior of the distribution. The following cache behaviors can be specified:     cache  - This option is best for static sites. When specified, your distribution caches and serves your entire website as static content. This behavior is ideal for websites with static content that doesn't change depending on who views it, or for websites that don't use cookies, headers, or query strings to personalize content.     dont-cache  - This option is best for sites that serve a mix of static and dynamic content. When specified, your distribution caches and serve only the content that is specified in the distribution's CacheBehaviorPerPath parameter. This behavior is ideal for websites or web applications that use cookies, headers, and query strings to personalize content for individual users.  
    */
  var behavior: js.UndefOr[BehaviorEnum] = js.native
}

object CacheBehavior {
  @scala.inline
  def apply(): CacheBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheBehavior]
  }
  @scala.inline
  implicit class CacheBehaviorOps[Self <: CacheBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBehavior(value: BehaviorEnum): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
  }
  
}

