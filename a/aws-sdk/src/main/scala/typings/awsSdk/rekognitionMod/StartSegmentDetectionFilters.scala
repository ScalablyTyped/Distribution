package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSegmentDetectionFilters extends StObject {
  
  /**
    * Filters that are specific to shot detections.
    */
  var ShotFilter: js.UndefOr[StartShotDetectionFilter] = js.native
  
  /**
    * Filters that are specific to technical cues.
    */
  var TechnicalCueFilter: js.UndefOr[StartTechnicalCueDetectionFilter] = js.native
}
object StartSegmentDetectionFilters {
  
  @scala.inline
  def apply(): StartSegmentDetectionFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSegmentDetectionFilters]
  }
  
  @scala.inline
  implicit class StartSegmentDetectionFiltersMutableBuilder[Self <: StartSegmentDetectionFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShotFilter(value: StartShotDetectionFilter): Self = StObject.set(x, "ShotFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotFilterUndefined: Self = StObject.set(x, "ShotFilter", js.undefined)
    
    @scala.inline
    def setTechnicalCueFilter(value: StartTechnicalCueDetectionFilter): Self = StObject.set(x, "TechnicalCueFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnicalCueFilterUndefined: Self = StObject.set(x, "TechnicalCueFilter", js.undefined)
  }
}
