package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationOverview extends StObject {
  
  /**
    * Returns the number of targets for the association status. For example, if you created an association with two instances, and one of them was successful, this would return the count of instances by status.
    */
  var AssociationStatusAggregatedCount: js.UndefOr[typings.awsSdk.ssmMod.AssociationStatusAggregatedCount] = js.native
  
  /**
    * A detailed status of the association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  
  /**
    * The status of the association. Status can be: Pending, Success, or Failed.
    */
  var Status: js.UndefOr[StatusName] = js.native
}
object AssociationOverview {
  
  @scala.inline
  def apply(): AssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOverview]
  }
  
  @scala.inline
  implicit class AssociationOverviewMutableBuilder[Self <: AssociationOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationStatusAggregatedCount(value: AssociationStatusAggregatedCount): Self = StObject.set(x, "AssociationStatusAggregatedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStatusAggregatedCountUndefined: Self = StObject.set(x, "AssociationStatusAggregatedCount", js.undefined)
    
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
