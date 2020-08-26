package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.`1`
import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [aws-sdk](https://github.com/aws/aws-sdk-js) module.
  */
@js.native
trait awsSdk
  extends Integration
     with Analyzable {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[`1`] = js.native
}

object awsSdk {
  @scala.inline
  def apply(): awsSdk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[awsSdk]
  }
  @scala.inline
  implicit class awsSdkOps[Self <: awsSdk] (val x: Self) extends AnyVal {
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
    def setHooks(value: `1`): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
  }
  
}

