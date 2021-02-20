package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberFabricAttributes extends StObject {
  
  /**
    * The user name for the initial administrator user for the member.
    */
  var AdminUsername: js.UndefOr[UsernameString] = js.native
  
  /**
    * The endpoint used to access the member's certificate authority.
    */
  var CaEndpoint: js.UndefOr[String] = js.native
}
object MemberFabricAttributes {
  
  @scala.inline
  def apply(): MemberFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFabricAttributes]
  }
  
  @scala.inline
  implicit class MemberFabricAttributesMutableBuilder[Self <: MemberFabricAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminUsername(value: UsernameString): Self = StObject.set(x, "AdminUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUsernameUndefined: Self = StObject.set(x, "AdminUsername", js.undefined)
    
    @scala.inline
    def setCaEndpoint(value: String): Self = StObject.set(x, "CaEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaEndpointUndefined: Self = StObject.set(x, "CaEndpoint", js.undefined)
  }
}
