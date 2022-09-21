package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextMetrics extends StObject {
  
  /**
    * distance (in pixels) parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign
    * property to the left side of the bounding rectangle of the given text
    */
  val actualBoundingBoxLeft: Double
  
  /**
    * distance (in pixels) parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign
    * property to the right side of the bounding rectangle of the given text
    */
  val actualBoundingBoxRight: Double
  
  /**
    * Text width.
    */
  val width: Double
}
object ITextMetrics {
  
  inline def apply(actualBoundingBoxLeft: Double, actualBoundingBoxRight: Double, width: Double): ITextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextMetrics]
  }
  
  extension [Self <: ITextMetrics](x: Self) {
    
    inline def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
    
    inline def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
