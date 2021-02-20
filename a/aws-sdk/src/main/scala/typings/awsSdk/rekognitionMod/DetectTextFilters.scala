package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectTextFilters extends StObject {
  
  /**
    *  A Filter focusing on a certain area of the image. Uses a BoundingBox object to set the region of the image.
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.rekognitionMod.RegionsOfInterest] = js.native
  
  var WordFilter: js.UndefOr[DetectionFilter] = js.native
}
object DetectTextFilters {
  
  @scala.inline
  def apply(): DetectTextFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTextFilters]
  }
  
  @scala.inline
  implicit class DetectTextFiltersMutableBuilder[Self <: DetectTextFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionsOfInterest(value: RegionsOfInterest): Self = StObject.set(x, "RegionsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsOfInterestUndefined: Self = StObject.set(x, "RegionsOfInterest", js.undefined)
    
    @scala.inline
    def setRegionsOfInterestVarargs(value: RegionOfInterest*): Self = StObject.set(x, "RegionsOfInterest", js.Array(value :_*))
    
    @scala.inline
    def setWordFilter(value: DetectionFilter): Self = StObject.set(x, "WordFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordFilterUndefined: Self = StObject.set(x, "WordFilter", js.undefined)
  }
}
