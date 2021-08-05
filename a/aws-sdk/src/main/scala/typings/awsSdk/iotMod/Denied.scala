package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Denied extends StObject {
  
  /**
    * Information that explicitly denies the authorization. 
    */
  var explicitDeny: js.UndefOr[ExplicitDeny] = js.undefined
  
  /**
    * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
    */
  var implicitDeny: js.UndefOr[ImplicitDeny] = js.undefined
}
object Denied {
  
  inline def apply(): Denied = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Denied]
  }
  
  extension [Self <: Denied](x: Self) {
    
    inline def setExplicitDeny(value: ExplicitDeny): Self = StObject.set(x, "explicitDeny", value.asInstanceOf[js.Any])
    
    inline def setExplicitDenyUndefined: Self = StObject.set(x, "explicitDeny", js.undefined)
    
    inline def setImplicitDeny(value: ImplicitDeny): Self = StObject.set(x, "implicitDeny", value.asInstanceOf[js.Any])
    
    inline def setImplicitDenyUndefined: Self = StObject.set(x, "implicitDeny", js.undefined)
  }
}
