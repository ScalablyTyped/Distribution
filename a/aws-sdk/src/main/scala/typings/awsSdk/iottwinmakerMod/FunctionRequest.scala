package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionRequest extends StObject {
  
  /**
    * The data connector.
    */
  var implementedBy: js.UndefOr[DataConnector] = js.undefined
  
  /**
    * The required properties of the function.
    */
  var requiredProperties: js.UndefOr[RequiredProperties] = js.undefined
  
  /**
    * The scope of the function.
    */
  var scope: js.UndefOr[Scope] = js.undefined
}
object FunctionRequest {
  
  inline def apply(): FunctionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionRequest]
  }
  
  extension [Self <: FunctionRequest](x: Self) {
    
    inline def setImplementedBy(value: DataConnector): Self = StObject.set(x, "implementedBy", value.asInstanceOf[js.Any])
    
    inline def setImplementedByUndefined: Self = StObject.set(x, "implementedBy", js.undefined)
    
    inline def setRequiredProperties(value: RequiredProperties): Self = StObject.set(x, "requiredProperties", value.asInstanceOf[js.Any])
    
    inline def setRequiredPropertiesUndefined: Self = StObject.set(x, "requiredProperties", js.undefined)
    
    inline def setRequiredPropertiesVarargs(value: Name*): Self = StObject.set(x, "requiredProperties", js.Array(value*))
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
