package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountSettingsResponse extends StObject {
  
  /**
    * The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight that you subscribed to (Standard or Enterprise) and the notification email for the QuickSight subscription. In the QuickSight console, the QuickSight subscription is sometimes referred to as a QuickSight "account" even though it's technically not an account by itself. Instead, it's a subscription to the QuickSight service for your AWS account. The edition that you subscribe to applies to QuickSight in every AWS Region where you use it.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.quicksightMod.AccountSettings] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeAccountSettingsResponse {
  
  inline def apply(): DescribeAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountSettingsResponse]
  }
  
  extension [Self <: DescribeAccountSettingsResponse](x: Self) {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "AccountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "AccountSettings", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
