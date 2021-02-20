package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arcs extends StObject {
  
  var arcs: js.UndefOr[MinWidth] = js.native
  
  /**
    * Enable or disable expanding gauge.
    */
  var expand: js.UndefOr[ExpandOptions] = js.native
  
  /**
    * Whether this should be displayed
    * as a full circle instead of a
    * half circle.
    * Defaults to `false`.
    */
  var fullCircle: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[LabelOptions] = js.native
  
  var labelLine: js.UndefOr[Show] = js.native
  
  /**
    * Set max value of the gauge.
    * Defaults to `100`.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Set min value of the gauge.
    * Defaults to `0`.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Set units of the gauge.
    */
  var units: js.UndefOr[String] = js.native
  
  /**
    * Set width of gauge chart.
    */
  var width: js.UndefOr[Double] = js.native
}
object Arcs {
  
  @scala.inline
  def apply(): Arcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arcs]
  }
  
  @scala.inline
  implicit class ArcsMutableBuilder[Self <: Arcs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcs(value: MinWidth): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcsUndefined: Self = StObject.set(x, "arcs", js.undefined)
    
    @scala.inline
    def setExpand(value: ExpandOptions): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFullCircle(value: Boolean): Self = StObject.set(x, "fullCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullCircleUndefined: Self = StObject.set(x, "fullCircle", js.undefined)
    
    @scala.inline
    def setLabel(value: LabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLine(value: Show): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
