package typings.consumerDataStandards.adminMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectionMetricsV2
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
object RejectionMetricsV2 {
  
  inline def apply(authenticated: Dictk, unauthenticated: Dictk): RejectionMetricsV2 = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], unauthenticated = unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectionMetricsV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectionMetricsV2] (val x: Self) extends AnyVal {
    
    inline def setAuthenticated(value: Dictk): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
    
    inline def setUnauthenticated(value: Dictk): Self = StObject.set(x, "unauthenticated", value.asInstanceOf[js.Any])
  }
}
