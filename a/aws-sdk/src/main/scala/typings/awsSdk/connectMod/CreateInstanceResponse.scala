package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the instance.
    */
  var Id: js.UndefOr[InstanceId] = js.undefined
}
object CreateInstanceResponse {
  
  inline def apply(): CreateInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceResponse]
  }
  
  extension [Self <: CreateInstanceResponse](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: InstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
