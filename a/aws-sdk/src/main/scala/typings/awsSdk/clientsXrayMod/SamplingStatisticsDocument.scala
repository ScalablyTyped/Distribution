package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingStatisticsDocument extends StObject {
  
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typings.awsSdk.clientsXrayMod.BorrowCount] = js.undefined
  
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typings.awsSdk.clientsXrayMod.ClientID
  
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typings.awsSdk.clientsXrayMod.RequestCount
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: typings.awsSdk.clientsXrayMod.RuleName
  
  /**
    * The number of requests recorded.
    */
  var SampledCount: typings.awsSdk.clientsXrayMod.SampledCount
  
  /**
    * The current time.
    */
  var Timestamp: js.Date
}
object SamplingStatisticsDocument {
  
  inline def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: js.Date
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
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
