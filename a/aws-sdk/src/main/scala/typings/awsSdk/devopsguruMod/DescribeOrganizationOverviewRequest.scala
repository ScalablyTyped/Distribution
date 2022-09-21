package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationOverviewRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    *  The start of the time range passed in. The start time granularity is at the day level. The floor of the start time is used. Returned information occurred after this day. 
    */
  var FromTime: js.Date
  
  /**
    * The ID of the organizational unit.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
  
  /**
    *  The end of the time range passed in. The start time granularity is at the day level. The floor of the start time is used. Returned information occurred before this day. If this is not specified, then the current day is used. 
    */
  var ToTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeOrganizationOverviewRequest {
  
  inline def apply(FromTime: js.Date): DescribeOrganizationOverviewRequest = {
    val __obj = js.Dynamic.literal(FromTime = FromTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationOverviewRequest]
  }
  
  extension [Self <: DescribeOrganizationOverviewRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "AccountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setFromTime(value: js.Date): Self = StObject.set(x, "FromTime", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value*))
    
    inline def setToTime(value: js.Date): Self = StObject.set(x, "ToTime", value.asInstanceOf[js.Any])
    
    inline def setToTimeUndefined: Self = StObject.set(x, "ToTime", js.undefined)
  }
}
