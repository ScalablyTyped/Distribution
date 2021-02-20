package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeReviewRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: Arn = js.native
}
object DescribeCodeReviewRequest {
  
  @scala.inline
  def apply(CodeReviewArn: Arn): DescribeCodeReviewRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeReviewRequest]
  }
  
  @scala.inline
  implicit class DescribeCodeReviewRequestMutableBuilder[Self <: DescribeCodeReviewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
  }
}
