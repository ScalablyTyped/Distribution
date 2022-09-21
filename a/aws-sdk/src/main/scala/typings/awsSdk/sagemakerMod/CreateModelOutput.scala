package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelOutput extends StObject {
  
  /**
    * The ARN of the model created in SageMaker.
    */
  var ModelArn: typings.awsSdk.sagemakerMod.ModelArn
}
object CreateModelOutput {
  
  inline def apply(ModelArn: ModelArn): CreateModelOutput = {
    val __obj = js.Dynamic.literal(ModelArn = ModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelOutput]
  }
  
  extension [Self <: CreateModelOutput](x: Self) {
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
  }
}
