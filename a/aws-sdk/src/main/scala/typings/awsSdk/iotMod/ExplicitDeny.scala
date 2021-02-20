package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitDeny extends StObject {
  
  /**
    * The policies that denied the authorization.
    */
  var policies: js.UndefOr[Policies] = js.native
}
object ExplicitDeny {
  
  @scala.inline
  def apply(): ExplicitDeny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplicitDeny]
  }
  
  @scala.inline
  implicit class ExplicitDenyMutableBuilder[Self <: ExplicitDeny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: Policies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
