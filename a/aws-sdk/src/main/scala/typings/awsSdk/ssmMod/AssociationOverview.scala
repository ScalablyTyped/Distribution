package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationOverview extends js.Object {
  
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
  implicit class AssociationOverviewOps[Self <: AssociationOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociationStatusAggregatedCount(value: AssociationStatusAggregatedCount): Self = this.set("AssociationStatusAggregatedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationStatusAggregatedCount: Self = this.set("AssociationStatusAggregatedCount", js.undefined)
    
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = this.set("DetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedStatus: Self = this.set("DetailedStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusName): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
