package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountRequest extends StObject {
  
  /**
    * The friendly name of the member account.
    */
  var AccountName: CreateAccountName
  
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another Amazon Web Services account. You must use a valid email address to complete account creation. The rules for a valid email address:   The address must be a minimum of 6 and a maximum of 64 characters long.   All characters must be 7-bit ASCII characters.   There must be one and only one @ symbol, which separates the local name from the domain name.   The local name can't contain any of the following characters: whitespace, " ' ( ) &lt; &gt; [ ] : ; , \ | % &amp;   The local name can't begin with a dot (.)   The domain name can consist of only the characters [a-z],[A-Z],[0-9], hyphen (-), or dot (.)   The domain name can't begin or end with a hyphen (-) or dot (.)   The domain name must contain at least one dot   You can't access the root user of the account or remove an account that was created with an invalid email address.
    */
  var Email: typings.awsSdk.organizationsMod.Email
  
  /**
    * If set to ALLOW, the new account enables IAM users to access account billing information if they have the required permissions. If set to DENY, only the root user of the new account can access account billing information. For more information, see Activating Access to the Billing and Cost Management Console in the Amazon Web Services Billing and Cost Management User Guide. If you don't specify this parameter, the value defaults to ALLOW, and IAM users and roles with the required permissions can access billing information for the new account.
    */
  var IamUserAccessToBilling: js.UndefOr[IAMUserAccessToBilling] = js.undefined
  
  /**
    * (Optional) The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the management account, allowing users in the management account to assume the role, as permitted by the management account administrator. The role has administrator permissions in the new member account. If you don't specify this parameter, the role name defaults to OrganizationAccountAccessRole. For more information about how to use this role to access the member account, see the following links:    Accessing and Administering the Member Accounts in Your Organization in the Organizations User Guide    Steps 2 and 3 in Tutorial: Delegate Access Across Amazon Web Services accounts Using IAM Roles in the IAM User Guide    The regex pattern that is used to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits with no spaces, and any of the following characters: =,.@-
    */
  var RoleName: js.UndefOr[typings.awsSdk.organizationsMod.RoleName] = js.undefined
  
  /**
    * A list of tags that you want to attach to the newly created account. For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null. For more information about tagging, see Tagging Organizations resources in the Organizations User Guide.  If any one of the tags is invalid or if you exceed the maximum allowed number of tags for an account, then the entire request fails and the account is not created. 
    */
  var Tags: js.UndefOr[typings.awsSdk.organizationsMod.Tags] = js.undefined
}
object CreateAccountRequest {
  
  inline def apply(AccountName: CreateAccountName, Email: Email): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountRequest]
  }
  
  extension [Self <: CreateAccountRequest](x: Self) {
    
    inline def setAccountName(value: CreateAccountName): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setIamUserAccessToBilling(value: IAMUserAccessToBilling): Self = StObject.set(x, "IamUserAccessToBilling", value.asInstanceOf[js.Any])
    
    inline def setIamUserAccessToBillingUndefined: Self = StObject.set(x, "IamUserAccessToBilling", js.undefined)
    
    inline def setRoleName(value: RoleName): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
