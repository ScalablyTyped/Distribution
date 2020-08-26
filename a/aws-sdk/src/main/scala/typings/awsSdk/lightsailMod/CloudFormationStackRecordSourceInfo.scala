package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationStackRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the record.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.native
}

object CloudFormationStackRecordSourceInfo {
  @scala.inline
  def apply(): CloudFormationStackRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
  }
  @scala.inline
  implicit class CloudFormationStackRecordSourceInfoOps[Self <: CloudFormationStackRecordSourceInfo] (val x: Self) extends AnyVal {
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceType(value: CloudFormationStackRecordSourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

