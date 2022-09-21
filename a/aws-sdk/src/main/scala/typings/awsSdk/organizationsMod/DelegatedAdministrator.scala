package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdministrator extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delegated administrator's account.
    */
  var Arn: js.UndefOr[AccountArn] = js.undefined
  
  /**
    * The date when the account was made a delegated administrator.
    */
  var DelegationEnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The email address that is associated with the delegated administrator's Amazon Web Services account.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.undefined
  
  /**
    * The unique identifier (ID) of the delegated administrator's account.
    */
  var Id: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The method by which the delegated administrator's account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.undefined
  
  /**
    * The date when the delegated administrator's account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The friendly name of the delegated administrator's account.
    */
  var Name: js.UndefOr[AccountName] = js.undefined
  
  /**
    * The status of the delegated administrator's account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.undefined
}
object DelegatedAdministrator {
  
  inline def apply(): DelegatedAdministrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdministrator]
  }
  
  extension [Self <: DelegatedAdministrator](x: Self) {
    
    inline def setArn(value: AccountArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDelegationEnabledDate(value: js.Date): Self = StObject.set(x, "DelegationEnabledDate", value.asInstanceOf[js.Any])
    
    inline def setDelegationEnabledDateUndefined: Self = StObject.set(x, "DelegationEnabledDate", js.undefined)
    
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
