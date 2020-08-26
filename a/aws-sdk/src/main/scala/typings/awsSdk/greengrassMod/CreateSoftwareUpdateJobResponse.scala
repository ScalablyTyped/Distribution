package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSoftwareUpdateJobResponse extends js.Object {
  /**
    * The IoT Job ARN corresponding to this update.
    */
  var IotJobArn: js.UndefOr[string] = js.native
  /**
    * The IoT Job Id corresponding to this update.
    */
  var IotJobId: js.UndefOr[string] = js.native
  /**
    * The software version installed on the device or devices after the update.
    */
  var PlatformSoftwareVersion: js.UndefOr[string] = js.native
}

object CreateSoftwareUpdateJobResponse {
  @scala.inline
  def apply(): CreateSoftwareUpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
  }
  @scala.inline
  implicit class CreateSoftwareUpdateJobResponseOps[Self <: CreateSoftwareUpdateJobResponse] (val x: Self) extends AnyVal {
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
    def setIotJobArn(value: string): Self = this.set("IotJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotJobArn: Self = this.set("IotJobArn", js.undefined)
    @scala.inline
    def setIotJobId(value: string): Self = this.set("IotJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotJobId: Self = this.set("IotJobId", js.undefined)
    @scala.inline
    def setPlatformSoftwareVersion(value: string): Self = this.set("PlatformSoftwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformSoftwareVersion: Self = this.set("PlatformSoftwareVersion", js.undefined)
  }
  
}

