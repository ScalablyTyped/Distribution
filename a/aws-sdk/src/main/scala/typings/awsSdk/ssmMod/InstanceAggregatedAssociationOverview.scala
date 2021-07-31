package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAggregatedAssociationOverview extends StObject {
  
  /**
    * Detailed status information about the aggregated associations.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The number of associations for the instance(s).
    */
  var InstanceAssociationStatusAggregatedCount: js.UndefOr[typings.awsSdk.ssmMod.InstanceAssociationStatusAggregatedCount] = js.undefined
}
object InstanceAggregatedAssociationOverview {
  
  @scala.inline
  def apply(): InstanceAggregatedAssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
  }
  
  @scala.inline
  implicit class InstanceAggregatedAssociationOverviewMutableBuilder[Self <: InstanceAggregatedAssociationOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    @scala.inline
    def setInstanceAssociationStatusAggregatedCount(value: InstanceAssociationStatusAggregatedCount): Self = StObject.set(x, "InstanceAssociationStatusAggregatedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceAssociationStatusAggregatedCountUndefined: Self = StObject.set(x, "InstanceAssociationStatusAggregatedCount", js.undefined)
  }
}
