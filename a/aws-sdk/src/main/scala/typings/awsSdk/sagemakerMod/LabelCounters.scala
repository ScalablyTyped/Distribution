package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCounters extends StObject {
  
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
  implicit class LabelCountersMutableBuilder[Self <: LabelCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedNonRetryableError(value: LabelCounter): Self = StObject.set(x, "FailedNonRetryableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedNonRetryableErrorUndefined: Self = StObject.set(x, "FailedNonRetryableError", js.undefined)
    
    @scala.inline
    def setHumanLabeled(value: LabelCounter): Self = StObject.set(x, "HumanLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLabeledUndefined: Self = StObject.set(x, "HumanLabeled", js.undefined)
    
    @scala.inline
    def setMachineLabeled(value: LabelCounter): Self = StObject.set(x, "MachineLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineLabeledUndefined: Self = StObject.set(x, "MachineLabeled", js.undefined)
    
    @scala.inline
    def setTotalLabeled(value: LabelCounter): Self = StObject.set(x, "TotalLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLabeledUndefined: Self = StObject.set(x, "TotalLabeled", js.undefined)
    
    @scala.inline
    def setUnlabeled(value: LabelCounter): Self = StObject.set(x, "Unlabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlabeledUndefined: Self = StObject.set(x, "Unlabeled", js.undefined)
  }
}
