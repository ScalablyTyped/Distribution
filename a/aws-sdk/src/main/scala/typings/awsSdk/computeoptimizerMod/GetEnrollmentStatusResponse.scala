package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnrollmentStatusResponse extends StObject {
  
  /**
    * The Unix epoch timestamp, in seconds, of when the account enrollment status was last updated.
    */
  var lastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Confirms the enrollment status of member accounts of the organization, if the account is a management account of an organization.
    */
  var memberAccountsEnrolled: js.UndefOr[MemberAccountsEnrolled] = js.undefined
  
  /**
    * The count of organization member accounts that are opted in to the service, if your account is an organization management account.
    */
  var numberOfMemberAccountsOptedIn: js.UndefOr[NumberOfMemberAccountsOptedIn] = js.undefined
  
  /**
    * The enrollment status of the account.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The reason for the enrollment status of the account. For example, an account might show a status of Pending because member accounts of an organization require more time to be enrolled in the service.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
}
object GetEnrollmentStatusResponse {
  
  inline def apply(): GetEnrollmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnrollmentStatusResponse]
  }
  
  extension [Self <: GetEnrollmentStatusResponse](x: Self) {
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    inline def setMemberAccountsEnrolled(value: MemberAccountsEnrolled): Self = StObject.set(x, "memberAccountsEnrolled", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountsEnrolledUndefined: Self = StObject.set(x, "memberAccountsEnrolled", js.undefined)
    
    inline def setNumberOfMemberAccountsOptedIn(value: NumberOfMemberAccountsOptedIn): Self = StObject.set(x, "numberOfMemberAccountsOptedIn", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMemberAccountsOptedInUndefined: Self = StObject.set(x, "numberOfMemberAccountsOptedIn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
