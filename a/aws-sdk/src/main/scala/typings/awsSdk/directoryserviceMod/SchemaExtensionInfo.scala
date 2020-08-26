package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtensionInfo extends js.Object {
  /**
    * A description of the schema extension.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The identifier of the directory to which the schema extension is applied.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The date and time that the schema extension was completed.
    */
  var EndDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.EndDateTime] = js.native
  /**
    * The identifier of the schema extension.
    */
  var SchemaExtensionId: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionId] = js.native
  /**
    * The current status of the schema extension.
    */
  var SchemaExtensionStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionStatus] = js.native
  /**
    * The reason for the SchemaExtensionStatus.
    */
  var SchemaExtensionStatusReason: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionStatusReason] = js.native
  /**
    * The date and time that the schema extension started being applied to the directory.
    */
  var StartDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.StartDateTime] = js.native
}

object SchemaExtensionInfo {
  @scala.inline
  def apply(): SchemaExtensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtensionInfo]
  }
  @scala.inline
  implicit class SchemaExtensionInfoOps[Self <: SchemaExtensionInfo] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setEndDateTime(value: EndDateTime): Self = this.set("EndDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("EndDateTime", js.undefined)
    @scala.inline
    def setSchemaExtensionId(value: SchemaExtensionId): Self = this.set("SchemaExtensionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaExtensionId: Self = this.set("SchemaExtensionId", js.undefined)
    @scala.inline
    def setSchemaExtensionStatus(value: SchemaExtensionStatus): Self = this.set("SchemaExtensionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaExtensionStatus: Self = this.set("SchemaExtensionStatus", js.undefined)
    @scala.inline
    def setSchemaExtensionStatusReason(value: SchemaExtensionStatusReason): Self = this.set("SchemaExtensionStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaExtensionStatusReason: Self = this.set("SchemaExtensionStatusReason", js.undefined)
    @scala.inline
    def setStartDateTime(value: StartDateTime): Self = this.set("StartDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("StartDateTime", js.undefined)
  }
  
}

