package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkDeveloperIdentityInput extends StObject {
  
  /**
    * <p>The "domain" by which Cognito will refer to your users.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A unique ID used by your backend authentication process to identify a user.</p>
    */
  var DeveloperUserIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
}
object UnlinkDeveloperIdentityInput {
  
  @scala.inline
  def apply(): UnlinkDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlinkDeveloperIdentityInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UnlinkDeveloperIdentityInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: UnlinkDeveloperIdentityInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class UnlinkDeveloperIdentityInputMutableBuilder[Self <: UnlinkDeveloperIdentityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperProviderName(value: String): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
    
    @scala.inline
    def setDeveloperUserIdentifier(value: String): Self = StObject.set(x, "DeveloperUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperUserIdentifierUndefined: Self = StObject.set(x, "DeveloperUserIdentifier", js.undefined)
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
  }
}
