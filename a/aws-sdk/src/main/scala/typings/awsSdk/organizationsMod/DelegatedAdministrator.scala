package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegatedAdministrator extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delegated administrator's account.
    */
  var Arn: js.UndefOr[AccountArn] = js.native
  
  /**
    * The date when the account was made a delegated administrator.
    */
  var DelegationEnabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The email address that is associated with the delegated administrator's AWS account.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.native
  
  /**
    * The unique identifier (ID) of the delegated administrator's account.
    */
  var Id: js.UndefOr[AccountId] = js.native
  
  /**
    * The method by which the delegated administrator's account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.native
  
  /**
    * The date when the delegated administrator's account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The friendly name of the delegated administrator's account.
    */
  var Name: js.UndefOr[AccountName] = js.native
  
  /**
    * The status of the delegated administrator's account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.native
}
object DelegatedAdministrator {
  
  @scala.inline
  def apply(): DelegatedAdministrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdministrator]
  }
  
  @scala.inline
  implicit class DelegatedAdministratorMutableBuilder[Self <: DelegatedAdministrator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AccountArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDelegationEnabledDate(value: Timestamp): Self = StObject.set(x, "DelegationEnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegationEnabledDateUndefined: Self = StObject.set(x, "DelegationEnabledDate", js.undefined)
    
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
