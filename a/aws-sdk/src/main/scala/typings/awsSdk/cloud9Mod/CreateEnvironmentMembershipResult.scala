package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEnvironmentMembershipResult extends StObject {
  
  /**
    * Information about the environment member that was added.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.native
}
object CreateEnvironmentMembershipResult {
  
  @scala.inline
  def apply(): CreateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentMembershipResult]
  }
  
  @scala.inline
  implicit class CreateEnvironmentMembershipResultMutableBuilder[Self <: CreateEnvironmentMembershipResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembership(value: EnvironmentMember): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
