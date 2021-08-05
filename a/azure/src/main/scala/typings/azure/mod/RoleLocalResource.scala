package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleLocalResource extends StObject {
  
  var maximumSizeInMegabytes: Double
  
  var name: String
  
  var path: String
}
object RoleLocalResource {
  
  inline def apply(maximumSizeInMegabytes: Double, name: String, path: String): RoleLocalResource = {
    val __obj = js.Dynamic.literal(maximumSizeInMegabytes = maximumSizeInMegabytes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleLocalResource]
  }
  
  extension [Self <: RoleLocalResource](x: Self) {
    
    inline def setMaximumSizeInMegabytes(value: Double): Self = StObject.set(x, "maximumSizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
