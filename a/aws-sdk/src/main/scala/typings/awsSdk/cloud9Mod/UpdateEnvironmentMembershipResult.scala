package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEnvironmentMembershipResult extends StObject {
  
  /**
    * Information about the environment member whose settings were changed.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.native
}
object UpdateEnvironmentMembershipResult {
  
  @scala.inline
  def apply(): UpdateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnvironmentMembershipResult]
  }
  
  @scala.inline
  implicit class UpdateEnvironmentMembershipResultMutableBuilder[Self <: UpdateEnvironmentMembershipResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembership(value: EnvironmentMember): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
