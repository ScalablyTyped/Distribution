package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlinkDeveloperIdentityInput extends StObject {
  
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: typings.awsSdk.cognitoidentityMod.DeveloperProviderName = js.native
  
  /**
    * A unique ID used by your backend authentication process to identify a user.
    */
  var DeveloperUserIdentifier: typings.awsSdk.cognitoidentityMod.DeveloperUserIdentifier = js.native
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsSdk.cognitoidentityMod.IdentityId = js.native
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
}
object UnlinkDeveloperIdentityInput {
  
  @scala.inline
  def apply(
    DeveloperProviderName: DeveloperProviderName,
    DeveloperUserIdentifier: DeveloperUserIdentifier,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): UnlinkDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], DeveloperUserIdentifier = DeveloperUserIdentifier.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkDeveloperIdentityInput]
  }
  
  @scala.inline
  implicit class UnlinkDeveloperIdentityInputMutableBuilder[Self <: UnlinkDeveloperIdentityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperProviderName(value: DeveloperProviderName): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperUserIdentifier(value: DeveloperUserIdentifier): Self = StObject.set(x, "DeveloperUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
