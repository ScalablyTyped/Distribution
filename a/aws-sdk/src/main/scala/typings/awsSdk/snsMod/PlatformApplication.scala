package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformApplication extends js.Object {
  /**
    * Attributes for platform application object.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * PlatformApplicationArn for platform application object.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}

object PlatformApplication {
  @scala.inline
  def apply(): PlatformApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformApplication]
  }
  @scala.inline
  implicit class PlatformApplicationOps[Self <: PlatformApplication] (val x: Self) extends AnyVal {
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
    def setAttributes(value: MapStringToString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = this.set("PlatformApplicationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformApplicationArn: Self = this.set("PlatformApplicationArn", js.undefined)
  }
  
}

