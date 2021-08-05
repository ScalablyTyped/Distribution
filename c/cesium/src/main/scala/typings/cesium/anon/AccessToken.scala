package typings.cesium.anon

import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessToken extends StObject {
  
  var accessToken: String
  
  var server: String | Resource
}
object AccessToken {
  
  inline def apply(accessToken: String, server: String | Resource): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  
  extension [Self <: AccessToken](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String | Resource): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
