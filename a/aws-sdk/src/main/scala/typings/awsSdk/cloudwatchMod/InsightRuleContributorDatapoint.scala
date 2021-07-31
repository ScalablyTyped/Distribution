package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightRuleContributorDatapoint extends StObject {
  
  /**
    * The approximate value that this contributor added during this timestamp.
    */
  var ApproximateValue: InsightRuleUnboundDouble
  
  /**
    * The timestamp of the data point.
    */
  var Timestamp: typings.awsSdk.cloudwatchMod.Timestamp
}
object InsightRuleContributorDatapoint {
  
  @scala.inline
  def apply(ApproximateValue: InsightRuleUnboundDouble, Timestamp: Timestamp): InsightRuleContributorDatapoint = {
    val __obj = js.Dynamic.literal(ApproximateValue = ApproximateValue.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributorDatapoint]
  }
  
  @scala.inline
  implicit class InsightRuleContributorDatapointMutableBuilder[Self <: InsightRuleContributorDatapoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "ApproximateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
