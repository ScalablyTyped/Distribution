package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSolutionVersionCreationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution version you want to stop creating.
    */
  var solutionVersionArn: Arn
}
object StopSolutionVersionCreationRequest {
  
  inline def apply(solutionVersionArn: Arn): StopSolutionVersionCreationRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSolutionVersionCreationRequest]
  }
  
  extension [Self <: StopSolutionVersionCreationRequest](x: Self) {
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
