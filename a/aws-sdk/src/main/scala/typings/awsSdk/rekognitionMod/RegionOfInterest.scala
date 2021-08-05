package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionOfInterest extends StObject {
  
  /**
    * The box representing a region of interest on screen.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
}
object RegionOfInterest {
  
  inline def apply(): RegionOfInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionOfInterest]
  }
  
  extension [Self <: RegionOfInterest](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
  }
}
