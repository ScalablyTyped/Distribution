package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the organization.
    */
  var ARN: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The alias for an organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.undefined
  
  /**
    * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
    */
  var CompletedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default mail domain associated with the organization.
    */
  var DefaultMailDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the directory associated with an Amazon WorkMail organization.
    */
  var DirectoryId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of directory associated with the WorkMail organization.
    */
  var DirectoryType: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of an organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.workmailMod.OrganizationId] = js.undefined
  
  /**
    * The state of an organization.
    */
  var State: js.UndefOr[String] = js.undefined
}
object DescribeOrganizationResponse {
  
  inline def apply(): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
  
  extension [Self <: DescribeOrganizationResponse](x: Self) {
    
    inline def setARN(value: AmazonResourceName): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAlias(value: OrganizationName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setCompletedDate(value: js.Date): Self = StObject.set(x, "CompletedDate", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateUndefined: Self = StObject.set(x, "CompletedDate", js.undefined)
    
    inline def setDefaultMailDomain(value: String): Self = StObject.set(x, "DefaultMailDomain", value.asInstanceOf[js.Any])
    
    inline def setDefaultMailDomainUndefined: Self = StObject.set(x, "DefaultMailDomain", js.undefined)
    
    inline def setDirectoryId(value: String): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setDirectoryType(value: String): Self = StObject.set(x, "DirectoryType", value.asInstanceOf[js.Any])
    
    inline def setDirectoryTypeUndefined: Self = StObject.set(x, "DirectoryType", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
