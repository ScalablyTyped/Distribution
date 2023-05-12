package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointOptions
  extends StObject
     with CommonElementOptions {
  
  /**
    * Draw the active elements over the other elements of the dataset,
    * @default true
    */
  var drawActiveElementsOnTop: Boolean
  
  /**
    * Extra radius added to point radius for hit detection.
    * @default 1
    */
  var hitRadius: Double
  
  /**
    * Point style
    * @default 'circle;
    */
  var pointStyle: PointStyle
  
  /**
    * Point radius
    * @default 3
    */
  var radius: Double
  
  /**
    * Point rotation (in degrees).
    * @default 0
    */
  var rotation: Double
}
object PointOptions {
  
  inline def apply(
    backgroundColor: Color,
    borderColor: Color,
    borderWidth: Double,
    drawActiveElementsOnTop: Boolean,
    hitRadius: Double,
    pointStyle: PointStyle,
    radius: Double,
    rotation: Double
  ): PointOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], drawActiveElementsOnTop = drawActiveElementsOnTop.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointOptions] (val x: Self) extends AnyVal {
    
    inline def setDrawActiveElementsOnTop(value: Boolean): Self = StObject.set(x, "drawActiveElementsOnTop", value.asInstanceOf[js.Any])
    
    inline def setHitRadius(value: Double): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
