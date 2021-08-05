package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JwtTokenTypeConfiguration extends StObject {
  
  /**
    * The regular expression that identifies the claim.
    */
  var ClaimRegex: js.UndefOr[typings.awsSdk.kendraMod.ClaimRegex] = js.undefined
  
  /**
    * The group attribute field.
    */
  var GroupAttributeField: js.UndefOr[typings.awsSdk.kendraMod.GroupAttributeField] = js.undefined
  
  /**
    * The issuer of the token.
    */
  var Issuer: js.UndefOr[typings.awsSdk.kendraMod.Issuer] = js.undefined
  
  /**
    * The location of the key.
    */
  var KeyLocation: typings.awsSdk.kendraMod.KeyLocation
  
  /**
    * The Amazon Resource Name (arn) of the secret.
    */
  var SecretManagerArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The signing key URL.
    */
  var URL: js.UndefOr[Url] = js.undefined
  
  /**
    * The user name attribute field.
    */
  var UserNameAttributeField: js.UndefOr[typings.awsSdk.kendraMod.UserNameAttributeField] = js.undefined
}
object JwtTokenTypeConfiguration {
  
  inline def apply(KeyLocation: KeyLocation): JwtTokenTypeConfiguration = {
    val __obj = js.Dynamic.literal(KeyLocation = KeyLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtTokenTypeConfiguration]
  }
  
  extension [Self <: JwtTokenTypeConfiguration](x: Self) {
    
    inline def setClaimRegex(value: ClaimRegex): Self = StObject.set(x, "ClaimRegex", value.asInstanceOf[js.Any])
    
    inline def setClaimRegexUndefined: Self = StObject.set(x, "ClaimRegex", js.undefined)
    
    inline def setGroupAttributeField(value: GroupAttributeField): Self = StObject.set(x, "GroupAttributeField", value.asInstanceOf[js.Any])
    
    inline def setGroupAttributeFieldUndefined: Self = StObject.set(x, "GroupAttributeField", js.undefined)
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    inline def setKeyLocation(value: KeyLocation): Self = StObject.set(x, "KeyLocation", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerArn(value: RoleArn): Self = StObject.set(x, "SecretManagerArn", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerArnUndefined: Self = StObject.set(x, "SecretManagerArn", js.undefined)
    
    inline def setURL(value: Url): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    
    inline def setUserNameAttributeField(value: UserNameAttributeField): Self = StObject.set(x, "UserNameAttributeField", value.asInstanceOf[js.Any])
    
    inline def setUserNameAttributeFieldUndefined: Self = StObject.set(x, "UserNameAttributeField", js.undefined)
  }
}
