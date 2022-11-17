package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TRBLCorners extends StObject {
  
  var bottomLeft: Double
  
  var bottomRight: Double
  
  var topLeft: Double
  
  var topRight: Double
}
object TRBLCorners {
  
  inline def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TRBLCorners = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRBLCorners]
  }
  
  extension [Self <: TRBLCorners](x: Self) {
    
    inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
    
    inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
  }
}
