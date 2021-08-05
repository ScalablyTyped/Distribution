package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  /**
    * The Unix epoch timestamp in seconds for when the update was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Any errors associated with a Failed update.
    */
  var errors: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * A UUID that is used to track the update.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A key-value map that contains the parameters associated with the update.
    */
  var params: js.UndefOr[UpdateParams] = js.undefined
  
  /**
    * The current status of the update.
    */
  var status: js.UndefOr[UpdateStatus] = js.undefined
  
  /**
    * The type of the update.
    */
  var `type`: js.UndefOr[UpdateType] = js.undefined
}
object Update {
  
  inline def apply(): Update = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setErrors(value: ErrorDetails): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorDetail*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParams(value: UpdateParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: UpdateParam*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    inline def setStatus(value: UpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: UpdateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
