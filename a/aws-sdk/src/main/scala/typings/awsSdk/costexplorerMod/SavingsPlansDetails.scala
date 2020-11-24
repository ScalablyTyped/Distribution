package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansDetails extends js.Object {
  
  /**
    * A group of instance types that Savings Plans applies to.
    */
  var InstanceFamily: js.UndefOr[GenericString] = js.native
  
  /**
    * The unique ID used to distinguish Savings Plans from one another.
    */
  var OfferingId: js.UndefOr[GenericString] = js.native
  
  /**
    * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other Regions.
    */
  var Region: js.UndefOr[GenericString] = js.native
}
object SavingsPlansDetails {
  
  @scala.inline
  def apply(): SavingsPlansDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansDetails]
  }
  
  @scala.inline
  implicit class SavingsPlansDetailsOps[Self <: SavingsPlansDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceFamily(value: GenericString): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    
    @scala.inline
    def setOfferingId(value: GenericString): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingId: Self = this.set("OfferingId", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
  }
}
