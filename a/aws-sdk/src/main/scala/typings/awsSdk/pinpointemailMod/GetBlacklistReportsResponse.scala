package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlacklistReportsResponse extends StObject {
  
  /**
    * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
    */
  var BlacklistReport: typings.awsSdk.pinpointemailMod.BlacklistReport
}
object GetBlacklistReportsResponse {
  
  inline def apply(BlacklistReport: BlacklistReport): GetBlacklistReportsResponse = {
    val __obj = js.Dynamic.literal(BlacklistReport = BlacklistReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlacklistReportsResponse]
  }
  
  extension [Self <: GetBlacklistReportsResponse](x: Self) {
    
    inline def setBlacklistReport(value: BlacklistReport): Self = StObject.set(x, "BlacklistReport", value.asInstanceOf[js.Any])
  }
}
