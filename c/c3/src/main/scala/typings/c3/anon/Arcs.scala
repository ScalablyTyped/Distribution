package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arcs extends StObject {
  
  var arcs: js.UndefOr[MinWidth] = js.undefined
  
  /**
    * Enable or disable expanding gauge.
    */
  var expand: js.UndefOr[ExpandOptions] = js.undefined
  
  /**
    * Whether this should be displayed
    * as a full circle instead of a
    * half circle.
    * Defaults to `false`.
    */
  var fullCircle: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[LabelOptions] = js.undefined
  
  var labelLine: js.UndefOr[Show] = js.undefined
  
  /**
    * Set max value of the gauge.
    * Defaults to `100`.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Set min value of the gauge.
    * Defaults to `0`.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Set units of the gauge.
    */
  var units: js.UndefOr[String] = js.undefined
  
  /**
    * Set width of gauge chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Arcs {
  
  inline def apply(): Arcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arcs]
  }
  
  extension [Self <: Arcs](x: Self) {
    
    inline def setArcs(value: MinWidth): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
    
    inline def setArcsUndefined: Self = StObject.set(x, "arcs", js.undefined)
    
    inline def setExpand(value: ExpandOptions): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFullCircle(value: Boolean): Self = StObject.set(x, "fullCircle", value.asInstanceOf[js.Any])
    
    inline def setFullCircleUndefined: Self = StObject.set(x, "fullCircle", js.undefined)
    
    inline def setLabel(value: LabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelLine(value: Show): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
