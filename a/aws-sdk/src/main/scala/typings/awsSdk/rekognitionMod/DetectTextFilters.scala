package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectTextFilters extends StObject {
  
  /**
    *  A Filter focusing on a certain area of the image. Uses a BoundingBox object to set the region of the image.
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.rekognitionMod.RegionsOfInterest] = js.undefined
  
  var WordFilter: js.UndefOr[DetectionFilter] = js.undefined
}
object DetectTextFilters {
  
  inline def apply(): DetectTextFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTextFilters]
  }
  
  extension [Self <: DetectTextFilters](x: Self) {
    
    inline def setRegionsOfInterest(value: RegionsOfInterest): Self = StObject.set(x, "RegionsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterestUndefined: Self = StObject.set(x, "RegionsOfInterest", js.undefined)
    
    inline def setRegionsOfInterestVarargs(value: RegionOfInterest*): Self = StObject.set(x, "RegionsOfInterest", js.Array(value :_*))
    
    inline def setWordFilter(value: DetectionFilter): Self = StObject.set(x, "WordFilter", value.asInstanceOf[js.Any])
    
    inline def setWordFilterUndefined: Self = StObject.set(x, "WordFilter", js.undefined)
  }
}
