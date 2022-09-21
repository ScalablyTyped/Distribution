package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticated
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Rejection counts for all authenticated end points
    */
  var authenticated: Dictk
  
  /**
    * Rejection counts for all uauthenticated end points
    */
  var unauthenticated: Dictk
}
object Authenticated {
  
  inline def apply(authenticated: Dictk, unauthenticated: Dictk): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], unauthenticated = unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
  
  extension [Self <: Authenticated](x: Self) {
    
    inline def setAuthenticated(value: Dictk): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
    
    inline def setUnauthenticated(value: Dictk): Self = StObject.set(x, "unauthenticated", value.asInstanceOf[js.Any])
  }
}
