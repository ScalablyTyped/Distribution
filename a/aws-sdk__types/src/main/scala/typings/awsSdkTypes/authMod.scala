package typings.awsSdkTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  trait AuthScheme extends StObject {
    
    /**
      * @example "v4" for SigV4
      */
    var name: String
    
    var properties: Record[String, Any]
    
    /**
      * @example "s3"
      */
    var signingName: String
    
    /**
      * @example "us-east-1"
      */
    var signingScope: String
  }
  object AuthScheme {
    
    inline def apply(name: String, properties: Record[String, Any], signingName: String, signingScope: String): AuthScheme = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingScope = signingScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthScheme]
    }
    
    extension [Self <: AuthScheme](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningScope(value: String): Self = StObject.set(x, "signingScope", value.asInstanceOf[js.Any])
    }
  }
}
