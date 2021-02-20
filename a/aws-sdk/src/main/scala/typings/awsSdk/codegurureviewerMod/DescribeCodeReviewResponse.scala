package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeReviewResponse extends StObject {
  
  /**
    *  Information about the code review. 
    */
  var CodeReview: js.UndefOr[typings.awsSdk.codegurureviewerMod.CodeReview] = js.native
}
object DescribeCodeReviewResponse {
  
  @scala.inline
  def apply(): DescribeCodeReviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCodeReviewResponse]
  }
  
  @scala.inline
  implicit class DescribeCodeReviewResponseMutableBuilder[Self <: DescribeCodeReviewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeReview(value: CodeReview): Self = StObject.set(x, "CodeReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeReviewUndefined: Self = StObject.set(x, "CodeReview", js.undefined)
  }
}
