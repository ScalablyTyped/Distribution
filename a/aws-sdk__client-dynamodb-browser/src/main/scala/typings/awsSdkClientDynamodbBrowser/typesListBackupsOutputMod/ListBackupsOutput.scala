package typings.awsSdkClientDynamodbBrowser.typesListBackupsOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBackupSummaryMod.UnmarshalledBackupSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupsOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>List of <code>BackupSummary</code> objects.</p>
    */
  var BackupSummaries: js.UndefOr[js.Array[UnmarshalledBackupSummary]] = js.native
  
  /**
    * <p> The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p> <p> If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are no more results to be retrieved. </p> <p> If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for <code>LastEvaluatedBackupArn</code> is returned. </p>
    */
  var LastEvaluatedBackupArn: js.UndefOr[String] = js.native
}
object ListBackupsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBackupsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupsOutput]
  }
  
  @scala.inline
  implicit class ListBackupsOutputOps[Self <: ListBackupsOutput] (val x: Self) extends AnyVal {
    
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
    def setBackupSummariesVarargs(value: UnmarshalledBackupSummary*): Self = this.set("BackupSummaries", js.Array(value :_*))
    
    @scala.inline
    def setBackupSummaries(value: js.Array[UnmarshalledBackupSummary]): Self = this.set("BackupSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupSummaries: Self = this.set("BackupSummaries", js.undefined)
    
    @scala.inline
    def setLastEvaluatedBackupArn(value: String): Self = this.set("LastEvaluatedBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedBackupArn: Self = this.set("LastEvaluatedBackupArn", js.undefined)
  }
}
