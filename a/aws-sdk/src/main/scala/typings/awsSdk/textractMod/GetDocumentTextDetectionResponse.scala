package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentTextDetectionResponse extends js.Object {
  
  /**
    * The results of the text-detection operation.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  
  /**
    * 
    */
  var DetectDocumentTextModelVersion: js.UndefOr[String] = js.native
  
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.native
  
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.textractMod.JobStatus] = js.native
  
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text-detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Returns if the detection job could not be completed. Contains explanation for what error occured. 
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.textractMod.StatusMessage] = js.native
  
  /**
    * A list of warnings that occurred during the text-detection operation for the document.
    */
  var Warnings: js.UndefOr[typings.awsSdk.textractMod.Warnings] = js.native
}
object GetDocumentTextDetectionResponse {
  
  @scala.inline
  def apply(): GetDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentTextDetectionResponse]
  }
  
  @scala.inline
  implicit class GetDocumentTextDetectionResponseOps[Self <: GetDocumentTextDetectionResponse] (val x: Self) extends AnyVal {
    
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
    def setBlocksVarargs(value: Block*): Self = this.set("Blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: BlockList): Self = this.set("Blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks: Self = this.set("Blocks", js.undefined)
    
    @scala.inline
    def setDetectDocumentTextModelVersion(value: String): Self = this.set("DetectDocumentTextModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectDocumentTextModelVersion: Self = this.set("DetectDocumentTextModelVersion", js.undefined)
    
    @scala.inline
    def setDocumentMetadata(value: DocumentMetadata): Self = this.set("DocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentMetadata: Self = this.set("DocumentMetadata", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = this.set("Warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: Warnings): Self = this.set("Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("Warnings", js.undefined)
  }
}
