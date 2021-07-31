package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationRange extends StObject {
  
  /**
    * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
    */
  var maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
  
  /**
    * The minimum value of the duration range. Must be greater than zero.
    */
  var minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
}
object DurationRange {
  
  @scala.inline
  def apply(): DurationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationRange]
  }
  
  @scala.inline
  implicit class DurationRangeMutableBuilder[Self <: DurationRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSeconds(value: AssessmentRunDuration): Self = StObject.set(x, "maxSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSecondsUndefined: Self = StObject.set(x, "maxSeconds", js.undefined)
    
    @scala.inline
    def setMinSeconds(value: AssessmentRunDuration): Self = StObject.set(x, "minSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSecondsUndefined: Self = StObject.set(x, "minSeconds", js.undefined)
  }
}
