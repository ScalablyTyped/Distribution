package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightRuleContributor extends StObject {
  
  /**
    * An approximation of the aggregate value that comes from this contributor.
    */
  var ApproximateAggregateValue: InsightRuleUnboundDouble = js.native
  
  /**
    * An array of the data points where this contributor is present. Only the data points when this contributor appeared are included in the array.
    */
  var Datapoints: InsightRuleContributorDatapoints = js.native
  
  /**
    * One of the log entry field keywords that is used to define contributors for this rule.
    */
  var Keys: InsightRuleContributorKeys = js.native
}
object InsightRuleContributor {
  
  @scala.inline
  def apply(
    ApproximateAggregateValue: InsightRuleUnboundDouble,
    Datapoints: InsightRuleContributorDatapoints,
    Keys: InsightRuleContributorKeys
  ): InsightRuleContributor = {
    val __obj = js.Dynamic.literal(ApproximateAggregateValue = ApproximateAggregateValue.asInstanceOf[js.Any], Datapoints = Datapoints.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributor]
  }
  
  @scala.inline
  implicit class InsightRuleContributorMutableBuilder[Self <: InsightRuleContributor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateAggregateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "ApproximateAggregateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapoints(value: InsightRuleContributorDatapoints): Self = StObject.set(x, "Datapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapointsVarargs(value: InsightRuleContributorDatapoint*): Self = StObject.set(x, "Datapoints", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: InsightRuleContributorKeys): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: InsightRuleContributorKey*): Self = StObject.set(x, "Keys", js.Array(value :_*))
  }
}
