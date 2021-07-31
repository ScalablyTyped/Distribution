package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStepsInput extends StObject {
  
  /**
    * The identifier of the cluster for which to list the steps.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
  
  /**
    * The filter to limit the step list based on the identifier of the steps. You can specify a maximum of ten Step IDs. The character constraint applies to the overall length of the array.
    */
  var StepIds: js.UndefOr[XmlStringList] = js.undefined
  
  /**
    * The filter to limit the step list based on certain states.
    */
  var StepStates: js.UndefOr[StepStateList] = js.undefined
}
object ListStepsInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): ListStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStepsInput]
  }
  
  @scala.inline
  implicit class ListStepsInputMutableBuilder[Self <: ListStepsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setStepIds(value: XmlStringList): Self = StObject.set(x, "StepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdsUndefined: Self = StObject.set(x, "StepIds", js.undefined)
    
    @scala.inline
    def setStepIdsVarargs(value: XmlString*): Self = StObject.set(x, "StepIds", js.Array(value :_*))
    
    @scala.inline
    def setStepStates(value: StepStateList): Self = StObject.set(x, "StepStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepStatesUndefined: Self = StObject.set(x, "StepStates", js.undefined)
    
    @scala.inline
    def setStepStatesVarargs(value: StepState*): Self = StObject.set(x, "StepStates", js.Array(value :_*))
  }
}
