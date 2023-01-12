package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrincipalTagAttributeMapResponse extends StObject {
  
  /**
    * <p>You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>You can use this operation to get the provider name.</p>
    */
  var IdentityProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>You can use this operation to add principal tags. The <code>PrincipalTags</code>operation enables you to reference user attributes in your IAM permissions policy.</p>
    */
  var PrincipalTags: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>You can use this operation to list </p>
    */
  var UseDefaults: js.UndefOr[Boolean] = js.undefined
}
object GetPrincipalTagAttributeMapResponse {
  
  inline def apply(): GetPrincipalTagAttributeMapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPrincipalTagAttributeMapResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPrincipalTagAttributeMapResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setIdentityProviderName(value: String): Self = StObject.set(x, "IdentityProviderName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNameUndefined: Self = StObject.set(x, "IdentityProviderName", js.undefined)
    
    inline def setPrincipalTags(value: Record[String, String]): Self = StObject.set(x, "PrincipalTags", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTagsUndefined: Self = StObject.set(x, "PrincipalTags", js.undefined)
    
    inline def setUseDefaults(value: Boolean): Self = StObject.set(x, "UseDefaults", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultsUndefined: Self = StObject.set(x, "UseDefaults", js.undefined)
  }
}
