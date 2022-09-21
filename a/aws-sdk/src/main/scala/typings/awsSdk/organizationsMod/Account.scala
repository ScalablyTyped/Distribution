package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the Amazon Web Services Service Authorization Reference.
    */
  var Arn: js.UndefOr[AccountArn] = js.undefined
  
  /**
    * The email address associated with the Amazon Web Services account. The regex pattern for this parameter is a string of characters that represents a standard internet email address.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.undefined
  
  /**
    * The unique identifier (ID) of the account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var Id: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The method by which the account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined
  
  /**
    * The date the account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The friendly name of the account. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[AccountName] = js.undefined
  
  /**
    * The status of the account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setArn(value: AccountArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setId(value: AccountId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setJoinedMethod(value: AccountJoinedMethod): Self = StObject.set(x, "JoinedMethod", value.asInstanceOf[js.Any])
    
    inline def setJoinedMethodUndefined: Self = StObject.set(x, "JoinedMethod", js.undefined)
    
    inline def setJoinedTimestamp(value: js.Date): Self = StObject.set(x, "JoinedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setJoinedTimestampUndefined: Self = StObject.set(x, "JoinedTimestamp", js.undefined)
    
    inline def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: AccountStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
