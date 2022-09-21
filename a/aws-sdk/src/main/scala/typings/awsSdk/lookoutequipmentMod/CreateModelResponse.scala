package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model being created. 
    */
  var ModelArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelArn] = js.undefined
  
  /**
    * Indicates the status of the CreateModel operation. 
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
}
object CreateModelResponse {
  
  inline def apply(): CreateModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModelResponse]
  }
  
  extension [Self <: CreateModelResponse](x: Self) {
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
