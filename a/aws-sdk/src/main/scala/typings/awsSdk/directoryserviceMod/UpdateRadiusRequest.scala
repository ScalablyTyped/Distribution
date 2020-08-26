package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to update the RADIUS server information.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: typings.awsSdk.directoryserviceMod.RadiusSettings = js.native
}

object UpdateRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): UpdateRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RadiusSettings = RadiusSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRadiusRequest]
  }
  @scala.inline
  implicit class UpdateRadiusRequestOps[Self <: UpdateRadiusRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusSettings(value: RadiusSettings): Self = this.set("RadiusSettings", value.asInstanceOf[js.Any])
  }
  
}

