package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlPolicy extends StObject {
  
  /**
    * A list of grants.
    */
  var Grants: js.UndefOr[typings.awsSdk.s3Mod.Grants] = js.native
  
  /**
    * Container for the bucket owner's display name and ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
}
object AccessControlPolicy {
  
  @scala.inline
  def apply(): AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlPolicy]
  }
  
  @scala.inline
  implicit class AccessControlPolicyMutableBuilder[Self <: AccessControlPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrants(value: Grants): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    @scala.inline
    def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "Grants", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
