package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingStatisticsDocument extends StObject {
  
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typings.awsSdk.xrayMod.BorrowCount] = js.undefined
  
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typings.awsSdk.xrayMod.ClientID
  
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typings.awsSdk.xrayMod.RequestCount
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: typings.awsSdk.xrayMod.RuleName
  
  /**
    * The number of requests recorded.
    */
  var SampledCount: typings.awsSdk.xrayMod.SampledCount
  
  /**
    * The current time.
    */
  var Timestamp: typings.awsSdk.xrayMod.Timestamp
}
object SamplingStatisticsDocument {
  
  inline def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: Timestamp
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
  
  extension [Self <: SamplingStatisticsDocument](x: Self) {
    
    inline def setBorrowCount(value: BorrowCount): Self = StObject.set(x, "BorrowCount", value.asInstanceOf[js.Any])
    
    inline def setBorrowCountUndefined: Self = StObject.set(x, "BorrowCount", js.undefined)
    
    inline def setClientID(value: ClientID): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    inline def setRequestCount(value: RequestCount): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setSampledCount(value: SampledCount): Self = StObject.set(x, "SampledCount", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
