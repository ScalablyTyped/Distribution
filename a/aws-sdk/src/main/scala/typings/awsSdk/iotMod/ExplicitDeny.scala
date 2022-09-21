package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplicitDeny extends StObject {
  
  /**
    * The policies that denied the authorization.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}
object ExplicitDeny {
  
  inline def apply(): ExplicitDeny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplicitDeny]
  }
  
  extension [Self <: ExplicitDeny](x: Self) {
    
    inline def setPolicies(value: Policies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
