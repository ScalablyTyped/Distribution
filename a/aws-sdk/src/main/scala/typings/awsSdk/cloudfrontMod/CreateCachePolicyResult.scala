package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCachePolicyResult extends js.Object {
  /**
    * A cache policy.
    */
  var CachePolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicy] = js.native
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the cache policy just created.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateCachePolicyResult {
  @scala.inline
  def apply(): CreateCachePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCachePolicyResult]
  }
  @scala.inline
  implicit class CreateCachePolicyResultOps[Self <: CreateCachePolicyResult] (val x: Self) extends AnyVal {
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
    def setCachePolicy(value: CachePolicy): Self = this.set("CachePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePolicy: Self = this.set("CachePolicy", js.undefined)
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
  
}

