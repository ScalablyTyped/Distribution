package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JwtTokenTypeConfiguration extends js.Object {
  
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
  implicit class JwtTokenTypeConfigurationOps[Self <: JwtTokenTypeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyLocation(value: KeyLocation): Self = this.set("KeyLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimRegex(value: ClaimRegex): Self = this.set("ClaimRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimRegex: Self = this.set("ClaimRegex", js.undefined)
    
    @scala.inline
    def setGroupAttributeField(value: GroupAttributeField): Self = this.set("GroupAttributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupAttributeField: Self = this.set("GroupAttributeField", js.undefined)
    
    @scala.inline
    def setIssuer(value: Issuer): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
    
    @scala.inline
    def setSecretManagerArn(value: RoleArn): Self = this.set("SecretManagerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretManagerArn: Self = this.set("SecretManagerArn", js.undefined)
    
    @scala.inline
    def setURL(value: Url): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
    
    @scala.inline
    def setUserNameAttributeField(value: UserNameAttributeField): Self = this.set("UserNameAttributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNameAttributeField: Self = this.set("UserNameAttributeField", js.undefined)
  }
}
