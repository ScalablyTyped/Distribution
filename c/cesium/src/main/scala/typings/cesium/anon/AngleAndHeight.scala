package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngleAndHeight extends StObject {
  
  var angleAndHeight: EndPosition
  
  var distance: EndPosition
}
object AngleAndHeight {
  
  inline def apply(angleAndHeight: EndPosition, distance: EndPosition): AngleAndHeight = {
    val __obj = js.Dynamic.literal(angleAndHeight = angleAndHeight.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleAndHeight]
  }
  
  extension [Self <: AngleAndHeight](x: Self) {
    
    inline def setAngleAndHeight(value: EndPosition): Self = StObject.set(x, "angleAndHeight", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: EndPosition): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
  }
}
