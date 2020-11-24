package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCounters extends js.Object {
  
  /**
    * The total number of objects that could not be labeled due to an error.
    */
  var FailedNonRetryableError: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of objects labeled by automated data labeling.
    */
  var MachineLabeled: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of objects labeled.
    */
  var TotalLabeled: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of objects not yet labeled.
    */
  var Unlabeled: js.UndefOr[LabelCounter] = js.native
}
object LabelCounters {
  
  @scala.inline
  def apply(): LabelCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCounters]
  }
  
  @scala.inline
  implicit class LabelCountersOps[Self <: LabelCounters] (val x: Self) extends AnyVal {
    
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
    def setFailedNonRetryableError(value: LabelCounter): Self = this.set("FailedNonRetryableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedNonRetryableError: Self = this.set("FailedNonRetryableError", js.undefined)
    
    @scala.inline
    def setHumanLabeled(value: LabelCounter): Self = this.set("HumanLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLabeled: Self = this.set("HumanLabeled", js.undefined)
    
    @scala.inline
    def setMachineLabeled(value: LabelCounter): Self = this.set("MachineLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineLabeled: Self = this.set("MachineLabeled", js.undefined)
    
    @scala.inline
    def setTotalLabeled(value: LabelCounter): Self = this.set("TotalLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalLabeled: Self = this.set("TotalLabeled", js.undefined)
    
    @scala.inline
    def setUnlabeled(value: LabelCounter): Self = this.set("Unlabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlabeled: Self = this.set("Unlabeled", js.undefined)
  }
}
