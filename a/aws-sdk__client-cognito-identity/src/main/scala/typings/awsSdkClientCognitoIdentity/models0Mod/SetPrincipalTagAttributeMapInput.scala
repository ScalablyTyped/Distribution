package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPrincipalTagAttributeMapInput extends StObject {
  
  /**
    * <p>The ID of the Identity Pool you want to set attribute mappings for.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The provider name you want to use for attribute mappings.</p>
    */
  var IdentityProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>You can use this operation to add principal tags.</p>
    */
  var PrincipalTags: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>You can use this operation to use default (username and clientID) attribute mappings.</p>
    */
  var UseDefaults: js.UndefOr[Boolean] = js.undefined
}
object SetPrincipalTagAttributeMapInput {
  
  inline def apply(): SetPrincipalTagAttributeMapInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetPrincipalTagAttributeMapInput]
  }
  
  extension [Self <: SetPrincipalTagAttributeMapInput](x: Self) {
    
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
