package typings.azure.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleInstance extends StObject {
  
  var endpoints: StringDictionary[RoleInstanceEndpoint]
  
  var faultDomain: String
  
  var id: String
  
  var updateDomain: String
}
object RoleInstance {
  
  inline def apply(
    endpoints: StringDictionary[RoleInstanceEndpoint],
    faultDomain: String,
    id: String,
    updateDomain: String
  ): RoleInstance = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], faultDomain = faultDomain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updateDomain = updateDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleInstance]
  }
  
  extension [Self <: RoleInstance](x: Self) {
    
    inline def setEndpoints(value: StringDictionary[RoleInstanceEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setFaultDomain(value: String): Self = StObject.set(x, "faultDomain", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdateDomain(value: String): Self = StObject.set(x, "updateDomain", value.asInstanceOf[js.Any])
  }
}
