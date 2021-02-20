package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JwtTokenTypeConfiguration extends StObject {
  
  /**
    * The regular expression that identifies the claim.
    */
  var ClaimRegex: js.UndefOr[typings.awsSdk.kendraMod.ClaimRegex] = js.native
  
  /**
    * The group attribute field.
    */
  var GroupAttributeField: js.UndefOr[typings.awsSdk.kendraMod.GroupAttributeField] = js.native
  
  /**
    * The issuer of the token.
    */
  var Issuer: js.UndefOr[typings.awsSdk.kendraMod.Issuer] = js.native
  
  /**
    * The location of the key.
    */
  var KeyLocation: typings.awsSdk.kendraMod.KeyLocation = js.native
  
  /**
    * The Amazon Resource Name (arn) of the secret.
    */
  var SecretManagerArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The signing key URL.
    */
  var URL: js.UndefOr[Url] = js.native
  
  /**
    * The user name attribute field.
    */
  var UserNameAttributeField: js.UndefOr[typings.awsSdk.kendraMod.UserNameAttributeField] = js.native
}
object JwtTokenTypeConfiguration {
  
  @scala.inline
  def apply(KeyLocation: KeyLocation): JwtTokenTypeConfiguration = {
    val __obj = js.Dynamic.literal(KeyLocation = KeyLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtTokenTypeConfiguration]
  }
  
  @scala.inline
  implicit class JwtTokenTypeConfigurationMutableBuilder[Self <: JwtTokenTypeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimRegex(value: ClaimRegex): Self = StObject.set(x, "ClaimRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimRegexUndefined: Self = StObject.set(x, "ClaimRegex", js.undefined)
    
    @scala.inline
    def setGroupAttributeField(value: GroupAttributeField): Self = StObject.set(x, "GroupAttributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupAttributeFieldUndefined: Self = StObject.set(x, "GroupAttributeField", js.undefined)
    
    @scala.inline
    def setIssuer(value: Issuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    @scala.inline
    def setKeyLocation(value: KeyLocation): Self = StObject.set(x, "KeyLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretManagerArn(value: RoleArn): Self = StObject.set(x, "SecretManagerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretManagerArnUndefined: Self = StObject.set(x, "SecretManagerArn", js.undefined)
    
    @scala.inline
    def setURL(value: Url): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    
    @scala.inline
    def setUserNameAttributeField(value: UserNameAttributeField): Self = StObject.set(x, "UserNameAttributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameAttributeFieldUndefined: Self = StObject.set(x, "UserNameAttributeField", js.undefined)
  }
}
