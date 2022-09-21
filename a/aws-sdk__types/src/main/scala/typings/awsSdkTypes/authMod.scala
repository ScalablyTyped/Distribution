package typings.awsSdkTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  trait AuthScheme extends StObject {
    
    var name: String
    
    var properties: Record[String, Any]
  }
  object AuthScheme {
    
    inline def apply(name: String, properties: Record[String, Any]): AuthScheme = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthScheme]
    }
    
    extension [Self <: AuthScheme](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
