package typings.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendColor extends js.Object {
  
  /** Base color of the date cells */
  var base: js.UndefOr[String] = js.native
  
  /** Color for the dates with value == 0 */
  var empty: js.UndefOr[String] = js.native
  
  /** Color of the highest value on the legend */
  var max: String = js.native
  
  /** Color of the smallest value on the legend */
  var min: String = js.native
  
  /** Color for the special value */
  var overflow: js.UndefOr[String] = js.native
}
object LegendColor {
  
  @scala.inline
  def apply(max: String, min: String): LegendColor = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendColor]
  }
  
  @scala.inline
  implicit class LegendColorOps[Self <: LegendColor] (val x: Self) extends AnyVal {
    
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
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
  }
}
