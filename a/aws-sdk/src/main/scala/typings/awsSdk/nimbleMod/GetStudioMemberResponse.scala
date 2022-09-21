package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStudioMemberResponse extends StObject {
  
  /**
    * The member.
    */
  var member: js.UndefOr[StudioMembership] = js.undefined
}
object GetStudioMemberResponse {
  
  inline def apply(): GetStudioMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStudioMemberResponse]
  }
  
  extension [Self <: GetStudioMemberResponse](x: Self) {
    
    inline def setMember(value: StudioMembership): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
  }
}
