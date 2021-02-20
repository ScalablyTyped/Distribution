package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the organization.
    */
  var ARN: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The alias for an organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.native
  
  /**
    * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
    */
  var CompletedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The default mail domain associated with the organization.
    */
  var DefaultMailDomain: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the directory associated with an Amazon WorkMail organization.
    */
  var DirectoryId: js.UndefOr[String] = js.native
  
  /**
    * The type of directory associated with the WorkMail organization.
    */
  var DirectoryType: js.UndefOr[String] = js.native
  
  /**
    * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.workmailMod.OrganizationId] = js.native
  
  /**
    * The state of an organization.
    */
  var State: js.UndefOr[String] = js.native
}
object DescribeOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationResponseMutableBuilder[Self <: DescribeOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: AmazonResourceName): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setAlias(value: OrganizationName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    @scala.inline
    def setCompletedDate(value: Timestamp): Self = StObject.set(x, "CompletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateUndefined: Self = StObject.set(x, "CompletedDate", js.undefined)
    
    @scala.inline
    def setDefaultMailDomain(value: String): Self = StObject.set(x, "DefaultMailDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMailDomainUndefined: Self = StObject.set(x, "DefaultMailDomain", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: String): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setDirectoryType(value: String): Self = StObject.set(x, "DirectoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryTypeUndefined: Self = StObject.set(x, "DirectoryType", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
