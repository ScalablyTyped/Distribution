package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSolutionResponse extends StObject {
  
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
}
object CreateSolutionResponse {
  
  @scala.inline
  def apply(): CreateSolutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolutionResponse]
  }
  
  @scala.inline
  implicit class CreateSolutionResponseMutableBuilder[Self <: CreateSolutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionArnUndefined: Self = StObject.set(x, "solutionArn", js.undefined)
  }
}
