package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformVersionResult extends js.Object {
  /**
    * The builder used to create the custom platform.
    */
  var Builder: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Builder] = js.native
  /**
    * Detailed information about the new version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.native
}

object CreatePlatformVersionResult {
  @scala.inline
  def apply(): CreatePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformVersionResult]
  }
  @scala.inline
  implicit class CreatePlatformVersionResultOps[Self <: CreatePlatformVersionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuilder(value: Builder): Self = this.set("Builder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilder: Self = this.set("Builder", js.undefined)
    @scala.inline
    def setPlatformSummary(value: PlatformSummary): Self = this.set("PlatformSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformSummary: Self = this.set("PlatformSummary", js.undefined)
  }
  
}

