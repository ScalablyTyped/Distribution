package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberFabricAttributes extends StObject {
  
  /**
    * The user name for the initial administrator user for the member.
    */
  var AdminUsername: js.UndefOr[UsernameString] = js.undefined
  
  /**
    * The endpoint used to access the member's certificate authority.
    */
  var CaEndpoint: js.UndefOr[String] = js.undefined
}
object MemberFabricAttributes {
  
  inline def apply(): MemberFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFabricAttributes]
  }
  
  extension [Self <: MemberFabricAttributes](x: Self) {
    
    inline def setAdminUsername(value: UsernameString): Self = StObject.set(x, "AdminUsername", value.asInstanceOf[js.Any])
    
    inline def setAdminUsernameUndefined: Self = StObject.set(x, "AdminUsername", js.undefined)
    
    inline def setCaEndpoint(value: String): Self = StObject.set(x, "CaEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCaEndpointUndefined: Self = StObject.set(x, "CaEndpoint", js.undefined)
  }
}
