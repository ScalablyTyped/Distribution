package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes. */
trait SVGUnitTypes extends StObject {
  
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double
  
  val SVG_UNIT_TYPE_UNKNOWN: Double
  
  val SVG_UNIT_TYPE_USERSPACEONUSE: Double
}
object SVGUnitTypes {
  
  inline def apply(
    SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double,
    SVG_UNIT_TYPE_UNKNOWN: Double,
    SVG_UNIT_TYPE_USERSPACEONUSE: Double
  ): SVGUnitTypes = {
    val __obj = js.Dynamic.literal(SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = SVG_UNIT_TYPE_OBJECTBOUNDINGBOX.asInstanceOf[js.Any], SVG_UNIT_TYPE_UNKNOWN = SVG_UNIT_TYPE_UNKNOWN.asInstanceOf[js.Any], SVG_UNIT_TYPE_USERSPACEONUSE = SVG_UNIT_TYPE_USERSPACEONUSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGUnitTypes]
  }
  
  extension [Self <: SVGUnitTypes](x: Self) {
    
    inline def setSVG_UNIT_TYPE_OBJECTBOUNDINGBOX(value: Double): Self = StObject.set(x, "SVG_UNIT_TYPE_OBJECTBOUNDINGBOX", value.asInstanceOf[js.Any])
    
    inline def setSVG_UNIT_TYPE_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_UNIT_TYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setSVG_UNIT_TYPE_USERSPACEONUSE(value: Double): Self = StObject.set(x, "SVG_UNIT_TYPE_USERSPACEONUSE", value.asInstanceOf[js.Any])
  }
}
