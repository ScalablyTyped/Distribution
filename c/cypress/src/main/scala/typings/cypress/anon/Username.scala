package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Username[S] extends StObject {
  
  var password: S
  
  var username: S
}
object Username {
  
  inline def apply[S](password: S, username: S): Username[S] = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Username[S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Username[?], S] (val x: Self & Username[S]) extends AnyVal {
    
    inline def setPassword(value: S): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: S): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
