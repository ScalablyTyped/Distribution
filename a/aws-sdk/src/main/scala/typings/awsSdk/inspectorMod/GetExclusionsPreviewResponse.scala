package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExclusionsPreviewResponse extends js.Object {
  
  /**
    * Information about the exclusions included in the preview.
    */
  var exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.native
  
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Specifies the status of the request to generate an exclusions preview.
    */
  var previewStatus: PreviewStatus = js.native
}
object GetExclusionsPreviewResponse {
  
  @scala.inline
  def apply(previewStatus: PreviewStatus): GetExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewStatus = previewStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExclusionsPreviewResponse]
  }
  
  @scala.inline
  implicit class GetExclusionsPreviewResponseOps[Self <: GetExclusionsPreviewResponse] (val x: Self) extends AnyVal {
    
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
    def setPreviewStatus(value: PreviewStatus): Self = this.set("previewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionPreviewsVarargs(value: ExclusionPreview*): Self = this.set("exclusionPreviews", js.Array(value :_*))
    
    @scala.inline
    def setExclusionPreviews(value: ExclusionPreviewList): Self = this.set("exclusionPreviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusionPreviews: Self = this.set("exclusionPreviews", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
