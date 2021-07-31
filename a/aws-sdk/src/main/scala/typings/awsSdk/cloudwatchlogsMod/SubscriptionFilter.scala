package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionFilter extends StObject {
  
  /**
    * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var destinationArn: js.UndefOr[DestinationArn] = js.undefined
  
  var distribution: js.UndefOr[Distribution] = js.undefined
  
  /**
    * The name of the subscription filter.
    */
  var filterName: js.UndefOr[FilterName] = js.undefined
  
  var filterPattern: js.UndefOr[FilterPattern] = js.undefined
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * 
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object SubscriptionFilter {
  
  @scala.inline
  def apply(): SubscriptionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionFilter]
  }
  
  @scala.inline
  implicit class SubscriptionFilterMutableBuilder[Self <: SubscriptionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationArnUndefined: Self = StObject.set(x, "destinationArn", js.undefined)
    
    @scala.inline
    def setDistribution(value: Distribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNameUndefined: Self = StObject.set(x, "filterName", js.undefined)
    
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
