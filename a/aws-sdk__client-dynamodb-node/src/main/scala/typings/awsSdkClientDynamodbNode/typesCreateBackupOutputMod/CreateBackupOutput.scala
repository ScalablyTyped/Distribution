package typings.awsSdkClientDynamodbNode.typesCreateBackupOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Contains the details of the backup created for the table.</p>
    */
  var BackupDetails: js.UndefOr[UnmarshalledBackupDetails] = js.native
}

object CreateBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CreateBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupOutput]
  }
  @scala.inline
  implicit class CreateBackupOutputOps[Self <: CreateBackupOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupDetails(value: UnmarshalledBackupDetails): Self = this.set("BackupDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupDetails: Self = this.set("BackupDetails", js.undefined)
  }
  
}

