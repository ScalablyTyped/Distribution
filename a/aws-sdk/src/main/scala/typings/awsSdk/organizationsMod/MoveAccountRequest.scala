package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAccountRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the account that you want to move. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId
  
  /**
    * The unique identifier (ID) of the root or organizational unit that you want to move the account to. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var DestinationParentId: ParentId
  
  /**
    * The unique identifier (ID) of the root or organizational unit that you want to move the account from. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var SourceParentId: ParentId
}
object MoveAccountRequest {
  
  inline def apply(AccountId: AccountId, DestinationParentId: ParentId, SourceParentId: ParentId): MoveAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DestinationParentId = DestinationParentId.asInstanceOf[js.Any], SourceParentId = SourceParentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAccountRequest]
  }
  
  extension [Self <: MoveAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentId(value: ParentId): Self = StObject.set(x, "DestinationParentId", value.asInstanceOf[js.Any])
    
    inline def setSourceParentId(value: ParentId): Self = StObject.set(x, "SourceParentId", value.asInstanceOf[js.Any])
  }
}
