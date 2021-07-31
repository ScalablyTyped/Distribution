package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInsightResponse extends StObject {
  
  /**
    * The ARN of the insight that was deleted.
    */
  var InsightArn: NonEmptyString
}
object DeleteInsightResponse {
  
  @scala.inline
  def apply(InsightArn: NonEmptyString): DeleteInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightResponse]
  }
  
  @scala.inline
  implicit class DeleteInsightResponseMutableBuilder[Self <: DeleteInsightResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
  }
}
