package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExclusionsPreviewRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment template for which the exclusions preview was requested.
    */
  var assessmentTemplateArn: Arn = js.native
  
  /**
    * The locale into which you want to translate the exclusion's title, description, and recommendation.
    */
  var locale: js.UndefOr[Locale] = js.native
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 100. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.native
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The unique identifier associated of the exclusions preview.
    */
  var previewToken: UUID = js.native
}
object GetExclusionsPreviewRequest {
  
  @scala.inline
  def apply(assessmentTemplateArn: Arn, previewToken: UUID): GetExclusionsPreviewRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any], previewToken = previewToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExclusionsPreviewRequest]
  }
  
  @scala.inline
  implicit class GetExclusionsPreviewRequestMutableBuilder[Self <: GetExclusionsPreviewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPreviewToken(value: UUID): Self = StObject.set(x, "previewToken", value.asInstanceOf[js.Any])
  }
}
