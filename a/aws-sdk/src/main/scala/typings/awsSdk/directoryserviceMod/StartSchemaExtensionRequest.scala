package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSchemaExtensionRequest extends js.Object {
  /**
    * If true, creates a snapshot of the directory before applying the schema extension.
    */
  var CreateSnapshotBeforeSchemaExtension: typings.awsSdk.directoryserviceMod.CreateSnapshotBeforeSchemaExtension = js.native
  /**
    * A description of the schema extension.
    */
  var Description: typings.awsSdk.directoryserviceMod.Description = js.native
  /**
    * The identifier of the directory for which the schema extension will be applied to.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger than 1MB.
    */
  var LdifContent: typings.awsSdk.directoryserviceMod.LdifContent = js.native
}

object StartSchemaExtensionRequest {
  @scala.inline
  def apply(
    CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension,
    Description: Description,
    DirectoryId: DirectoryId,
    LdifContent: LdifContent
  ): StartSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(CreateSnapshotBeforeSchemaExtension = CreateSnapshotBeforeSchemaExtension.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], LdifContent = LdifContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaExtensionRequest]
  }
  @scala.inline
  implicit class StartSchemaExtensionRequestOps[Self <: StartSchemaExtensionRequest] (val x: Self) extends AnyVal {
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
    def setCreateSnapshotBeforeSchemaExtension(value: CreateSnapshotBeforeSchemaExtension): Self = this.set("CreateSnapshotBeforeSchemaExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLdifContent(value: LdifContent): Self = this.set("LdifContent", value.asInstanceOf[js.Any])
  }
  
}

