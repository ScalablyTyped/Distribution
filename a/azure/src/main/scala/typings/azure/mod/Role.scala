package typings.azure.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  var instances: StringDictionary[RoleInstance]
  
  var name: String
}
object Role {
  
  inline def apply(instances: StringDictionary[RoleInstance], name: String): Role = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  extension [Self <: Role](x: Self) {
    
    inline def setInstances(value: StringDictionary[RoleInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
