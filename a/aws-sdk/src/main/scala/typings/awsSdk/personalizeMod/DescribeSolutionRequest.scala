package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSolutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution to describe.
    */
  var solutionArn: Arn
}
object DescribeSolutionRequest {
  
  @scala.inline
  def apply(solutionArn: Arn): DescribeSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSolutionRequest]
  }
  
  @scala.inline
  implicit class DescribeSolutionRequestMutableBuilder[Self <: DescribeSolutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
  }
}
