package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrganizationRequest extends StObject {
  
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
  implicit class CreateOrganizationRequestMutableBuilder[Self <: CreateOrganizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: OrganizationName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setDomains(value: Domains): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    @scala.inline
    def setEnableInteroperability(value: Boolean): Self = StObject.set(x, "EnableInteroperability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInteroperabilityUndefined: Self = StObject.set(x, "EnableInteroperability", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
