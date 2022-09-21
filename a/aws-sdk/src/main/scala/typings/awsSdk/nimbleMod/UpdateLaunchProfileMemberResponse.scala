package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchProfileMemberResponse extends StObject {
  
  /**
    * The updated member. 
    */
  var member: js.UndefOr[LaunchProfileMembership] = js.undefined
}
object UpdateLaunchProfileMemberResponse {
  
  inline def apply(): UpdateLaunchProfileMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLaunchProfileMemberResponse]
  }
  
  extension [Self <: UpdateLaunchProfileMemberResponse](x: Self) {
    
    inline def setMember(value: LaunchProfileMembership): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
  }
}
