package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPrincipalTagAttributeMapInput extends StObject {
  
  /**
    * The ID of the Identity Pool you want to set attribute mappings for.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId
  
  /**
    * The provider name you want to use for attribute mappings.
    */
  var IdentityProviderName: typings.awsSdk.cognitoidentityMod.IdentityProviderName
  
  /**
    * You can use this operation to add principal tags.
    */
  var PrincipalTags: js.UndefOr[typings.awsSdk.cognitoidentityMod.PrincipalTags] = js.undefined
  
  /**
    * You can use this operation to use default (username and clientID) attribute mappings.
    */
  var UseDefaults: js.UndefOr[typings.awsSdk.cognitoidentityMod.UseDefaults] = js.undefined
}
object SetPrincipalTagAttributeMapInput {
  
  inline def apply(IdentityPoolId: IdentityPoolId, IdentityProviderName: IdentityProviderName): SetPrincipalTagAttributeMapInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityProviderName = IdentityProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPrincipalTagAttributeMapInput]
  }
  
  extension [Self <: SetPrincipalTagAttributeMapInput](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderName(value: IdentityProviderName): Self = StObject.set(x, "IdentityProviderName", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTags(value: PrincipalTags): Self = StObject.set(x, "PrincipalTags", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTagsUndefined: Self = StObject.set(x, "PrincipalTags", js.undefined)
    
    inline def setUseDefaults(value: UseDefaults): Self = StObject.set(x, "UseDefaults", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultsUndefined: Self = StObject.set(x, "UseDefaults", js.undefined)
  }
}
