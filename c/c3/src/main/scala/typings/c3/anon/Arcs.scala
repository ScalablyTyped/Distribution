package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arcs extends js.Object {
  
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
  implicit class ArcsOps[Self <: Arcs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArcs(value: MinWidth): Self = this.set("arcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArcs: Self = this.set("arcs", js.undefined)
    
    @scala.inline
    def setExpand(value: ExpandOptions): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFullCircle(value: Boolean): Self = this.set("fullCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullCircle: Self = this.set("fullCircle", js.undefined)
    
    @scala.inline
    def setLabel(value: LabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelLine(value: Show): Self = this.set("labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLine: Self = this.set("labelLine", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
