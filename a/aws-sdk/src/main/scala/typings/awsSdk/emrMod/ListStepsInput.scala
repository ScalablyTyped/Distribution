package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStepsInput extends js.Object {
  
  /**
    * The identifier of the cluster for which to list the steps.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
  
  /**
    * The filter to limit the step list based on the identifier of the steps. You can specify a maximum of ten Step IDs. The character constraint applies to the overall length of the array.
    */
  var StepIds: js.UndefOr[XmlStringList] = js.native
  
  /**
    * The filter to limit the step list based on certain states.
    */
  var StepStates: js.UndefOr[StepStateList] = js.native
}
object ListStepsInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): ListStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStepsInput]
  }
  
  @scala.inline
  implicit class ListStepsInputOps[Self <: ListStepsInput] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setStepIdsVarargs(value: XmlString*): Self = this.set("StepIds", js.Array(value :_*))
    
    @scala.inline
    def setStepIds(value: XmlStringList): Self = this.set("StepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepIds: Self = this.set("StepIds", js.undefined)
    
    @scala.inline
    def setStepStatesVarargs(value: StepState*): Self = this.set("StepStates", js.Array(value :_*))
    
    @scala.inline
    def setStepStates(value: StepStateList): Self = this.set("StepStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepStates: Self = this.set("StepStates", js.undefined)
  }
}
