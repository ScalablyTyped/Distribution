package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[AccountArn] = js.native
  
  /**
    * The email address associated with the AWS account. The regex pattern for this parameter is a string of characters that represents a standard internet email address.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.native
  
  /**
    * The unique identifier (ID) of the account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var Id: js.UndefOr[AccountId] = js.native
  
  /**
    * The method by which the account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.native
  
  /**
    * The date the account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The friendly name of the account. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[AccountName] = js.native
  
  /**
    * The status of the account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AccountArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setId(value: AccountId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setJoinedMethod(value: AccountJoinedMethod): Self = StObject.set(x, "JoinedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedMethodUndefined: Self = StObject.set(x, "JoinedMethod", js.undefined)
    
    @scala.inline
    def setJoinedTimestamp(value: Timestamp): Self = StObject.set(x, "JoinedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedTimestampUndefined: Self = StObject.set(x, "JoinedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: AccountStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
