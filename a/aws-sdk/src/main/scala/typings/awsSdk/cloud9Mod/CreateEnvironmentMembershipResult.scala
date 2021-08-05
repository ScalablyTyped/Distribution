package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentMembershipResult extends StObject {
  
  /**
    * Information about the environment member that was added.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.undefined
}
object CreateEnvironmentMembershipResult {
  
  inline def apply(): CreateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentMembershipResult]
  }
  
  extension [Self <: CreateEnvironmentMembershipResult](x: Self) {
    
    inline def setMembership(value: EnvironmentMember): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
