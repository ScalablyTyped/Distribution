package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolutionResponse extends StObject {
  
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
}
object CreateSolutionResponse {
  
  inline def apply(): CreateSolutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolutionResponse]
  }
  
  extension [Self <: CreateSolutionResponse](x: Self) {
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionArnUndefined: Self = StObject.set(x, "solutionArn", js.undefined)
  }
}
