package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorRootCauseService extends StObject {
  
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[ErrorRootCauseEntityPath] = js.undefined
  
  /**
    * A Boolean value indicating if the service is inferred from the trace.
    */
  var Inferred: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The service name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of associated service names.
    */
  var Names: js.UndefOr[ServiceNames] = js.undefined
  
  /**
    * The type associated to the service.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object ErrorRootCauseService {
  
  inline def apply(): ErrorRootCauseService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorRootCauseService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorRootCauseService] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setEntityPath(value: ErrorRootCauseEntityPath): Self = StObject.set(x, "EntityPath", value.asInstanceOf[js.Any])
    
    inline def setEntityPathUndefined: Self = StObject.set(x, "EntityPath", js.undefined)
    
    inline def setEntityPathVarargs(value: ErrorRootCauseEntity*): Self = StObject.set(x, "EntityPath", js.Array(value*))
    
    inline def setInferred(value: NullableBoolean): Self = StObject.set(x, "Inferred", value.asInstanceOf[js.Any])
    
    inline def setInferredUndefined: Self = StObject.set(x, "Inferred", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNames(value: ServiceNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
