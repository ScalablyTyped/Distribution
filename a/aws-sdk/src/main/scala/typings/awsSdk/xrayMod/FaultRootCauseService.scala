package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaultRootCauseService extends StObject {
  
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.undefined
  
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
object FaultRootCauseService {
  
  inline def apply(): FaultRootCauseService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultRootCauseService]
  }
  
  extension [Self <: FaultRootCauseService](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setEntityPath(value: FaultRootCauseEntityPath): Self = StObject.set(x, "EntityPath", value.asInstanceOf[js.Any])
    
    inline def setEntityPathUndefined: Self = StObject.set(x, "EntityPath", js.undefined)
    
    inline def setEntityPathVarargs(value: FaultRootCauseEntity*): Self = StObject.set(x, "EntityPath", js.Array(value :_*))
    
    inline def setInferred(value: NullableBoolean): Self = StObject.set(x, "Inferred", value.asInstanceOf[js.Any])
    
    inline def setInferredUndefined: Self = StObject.set(x, "Inferred", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNames(value: ServiceNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
