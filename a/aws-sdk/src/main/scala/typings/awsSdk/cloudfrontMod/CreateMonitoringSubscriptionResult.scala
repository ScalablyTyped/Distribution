package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitoringSubscriptionResult extends StObject {
  
  /**
    * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var MonitoringSubscription: js.UndefOr[typings.awsSdk.cloudfrontMod.MonitoringSubscription] = js.undefined
}
object CreateMonitoringSubscriptionResult {
  
  inline def apply(): CreateMonitoringSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMonitoringSubscriptionResult]
  }
  
  extension [Self <: CreateMonitoringSubscriptionResult](x: Self) {
    
    inline def setMonitoringSubscription(value: MonitoringSubscription): Self = StObject.set(x, "MonitoringSubscription", value.asInstanceOf[js.Any])
    
    inline def setMonitoringSubscriptionUndefined: Self = StObject.set(x, "MonitoringSubscription", js.undefined)
  }
}
