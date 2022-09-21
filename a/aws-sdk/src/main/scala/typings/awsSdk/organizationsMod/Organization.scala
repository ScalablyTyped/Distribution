package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the Amazon Web Services Service Authorization Reference.
    */
  var Arn: js.UndefOr[OrganizationArn] = js.undefined
  
  /**
    *  Do not use. This field is deprecated and doesn't provide complete information about the policies in your organization.  To determine the policies that are enabled and available for use in your organization, use the ListRoots operation instead.
    */
  var AvailablePolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
  
  /**
    * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information, see Enabling All Features in Your Organization in the Organizations User Guide.
    */
  var FeatureSet: js.UndefOr[OrganizationFeatureSet] = js.undefined
  
  /**
    * The unique identifier (ID) of an organization. The regex pattern for an organization ID string requires "o-" followed by from 10 to 32 lowercase letters or digits.
    */
  var Id: js.UndefOr[OrganizationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the account that is designated as the management account for the organization. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the Amazon Web Services Service Authorization Reference.
    */
  var MasterAccountArn: js.UndefOr[AccountArn] = js.undefined
  
  /**
    * The email address that is associated with the Amazon Web Services account that is designated as the management account for the organization.
    */
  var MasterAccountEmail: js.UndefOr[Email] = js.undefined
  
  /**
    * The unique identifier (ID) of the management account of an organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var MasterAccountId: js.UndefOr[AccountId] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setArn(value: OrganizationArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAvailablePolicyTypes(value: PolicyTypes): Self = StObject.set(x, "AvailablePolicyTypes", value.asInstanceOf[js.Any])
    
    inline def setAvailablePolicyTypesUndefined: Self = StObject.set(x, "AvailablePolicyTypes", js.undefined)
    
    inline def setAvailablePolicyTypesVarargs(value: PolicyTypeSummary*): Self = StObject.set(x, "AvailablePolicyTypes", js.Array(value*))
    
    inline def setFeatureSet(value: OrganizationFeatureSet): Self = StObject.set(x, "FeatureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "FeatureSet", js.undefined)
    
    inline def setId(value: OrganizationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMasterAccountArn(value: AccountArn): Self = StObject.set(x, "MasterAccountArn", value.asInstanceOf[js.Any])
    
    inline def setMasterAccountArnUndefined: Self = StObject.set(x, "MasterAccountArn", js.undefined)
    
    inline def setMasterAccountEmail(value: Email): Self = StObject.set(x, "MasterAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setMasterAccountEmailUndefined: Self = StObject.set(x, "MasterAccountEmail", js.undefined)
    
    inline def setMasterAccountId(value: AccountId): Self = StObject.set(x, "MasterAccountId", value.asInstanceOf[js.Any])
    
    inline def setMasterAccountIdUndefined: Self = StObject.set(x, "MasterAccountId", js.undefined)
  }
}
