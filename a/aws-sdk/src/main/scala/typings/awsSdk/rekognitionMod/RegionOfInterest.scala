package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionOfInterest extends StObject {
  
  /**
    * The box representing a region of interest on screen.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
}
object RegionOfInterest {
  
  @scala.inline
  def apply(): RegionOfInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionOfInterest]
  }
  
  @scala.inline
  implicit class RegionOfInterestMutableBuilder[Self <: RegionOfInterest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
  }
}
