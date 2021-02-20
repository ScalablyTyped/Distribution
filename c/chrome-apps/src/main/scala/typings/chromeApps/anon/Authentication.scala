package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authentication extends StObject {
  
  var Authentication: String = js.native
}
object Authentication {
  
  @scala.inline
  def apply(Authentication: String): Authentication = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationMutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: String): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
  }
}
