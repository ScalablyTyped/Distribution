package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplicitDeny extends StObject {
  
  /**
    * Policies that don't contain a matching allow or deny statement for the specified action on the specified resource. 
    */
  var policies: js.UndefOr[Policies] = js.undefined
}
object ImplicitDeny {
  
  @scala.inline
  def apply(): ImplicitDeny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplicitDeny]
  }
  
  @scala.inline
  implicit class ImplicitDenyMutableBuilder[Self <: ImplicitDeny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: Policies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
