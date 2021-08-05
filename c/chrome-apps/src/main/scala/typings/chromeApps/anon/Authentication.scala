package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authentication extends StObject {
  
  var Authentication: String
}
object Authentication {
  
  inline def apply(Authentication: String): Authentication = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  
  extension [Self <: Authentication](x: Self) {
    
    inline def setAuthentication(value: String): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
  }
}
