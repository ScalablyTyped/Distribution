package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStepsOutput extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
  
  /**
    * The filtered list of steps for the cluster.
    */
  var Steps: js.UndefOr[StepSummaryList] = js.undefined
}
object ListStepsOutput {
  
  @scala.inline
  def apply(): ListStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepsOutput]
  }
  
  @scala.inline
  implicit class ListStepsOutputMutableBuilder[Self <: ListStepsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSteps(value: StepSummaryList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: StepSummary*): Self = StObject.set(x, "Steps", js.Array(value :_*))
  }
}
