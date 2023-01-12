package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsForIdentityInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were
    *          received in the token from the identity provider. For example, a SAML-based identity
    *          provider. This parameter is optional for identity providers that do not support role
    *          customization.</p>
    */
  var CustomRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. The
    *          name-value pair will follow the syntax "provider_name":
    *          "provider_user_identifier".</p>
    *          <p>Logins should not be specified when trying to get credentials for an unauthenticated
    *          identity.</p>
    *          <p>The Logins parameter is required when using identities associated with external
    *          identity providers such as Facebook. For examples of <code>Logins</code> maps, see the code
    *          examples in the <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External Identity Providers</a> section of the Amazon Cognito Developer
    *          Guide.</p>
    */
  var Logins: js.UndefOr[Record[String, String]] = js.undefined
}
object GetCredentialsForIdentityInput {
  
  inline def apply(): GetCredentialsForIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsForIdentityInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCredentialsForIdentityInput] (val x: Self) extends AnyVal {
    
    inline def setCustomRoleArn(value: String): Self = StObject.set(x, "CustomRoleArn", value.asInstanceOf[js.Any])
    
    inline def setCustomRoleArnUndefined: Self = StObject.set(x, "CustomRoleArn", js.undefined)
    
    inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setLogins(value: Record[String, String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    inline def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
