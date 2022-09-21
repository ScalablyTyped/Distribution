package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResponsePlanOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the response plan.
    */
  var arn: Arn
}
object CreateResponsePlanOutput {
  
  inline def apply(arn: Arn): CreateResponsePlanOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResponsePlanOutput]
  }
  
  extension [Self <: CreateResponsePlanOutput](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
