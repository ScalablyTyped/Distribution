package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrganizationRequest extends js.Object {
  
  /**
    * The organization alias.
    */
  var Alias: OrganizationName = js.native
  
  /**
    * The idempotency token associated with the request.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.native
  
  /**
    * The AWS Directory Service directory ID.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.workmailMod.DirectoryId] = js.native
  
  /**
    * The email domains to associate with the organization.
    */
  var Domains: js.UndefOr[typings.awsSdk.workmailMod.Domains] = js.native
  
  /**
    * When true, allows organization interoperability between Amazon WorkMail and Microsoft Exchange. Can only be set to true if an AD Connector directory ID is included in the request.
    */
  var EnableInteroperability: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a customer managed master key from AWS KMS.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.workmailMod.KmsKeyArn] = js.native
}
object CreateOrganizationRequest {
  
  @scala.inline
  def apply(Alias: OrganizationName): CreateOrganizationRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationRequest]
  }
  
  @scala.inline
  implicit class CreateOrganizationRequestOps[Self <: CreateOrganizationRequest] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: OrganizationName): Self = this.set("Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: IdempotencyClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = this.set("Domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: Domains): Self = this.set("Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("Domains", js.undefined)
    
    @scala.inline
    def setEnableInteroperability(value: Boolean): Self = this.set("EnableInteroperability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInteroperability: Self = this.set("EnableInteroperability", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
  }
}
