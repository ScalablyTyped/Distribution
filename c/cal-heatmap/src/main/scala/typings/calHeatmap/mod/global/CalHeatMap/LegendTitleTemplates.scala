package typings.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendTitleTemplates extends js.Object {
  
  /** Formatting of all the value but the first and the last. Default value: "between {down} and {up} {name}" */
  var inner: js.UndefOr[String] = js.native
  
  /** Formatting of the smallest (leftmost) value of the legend. Default value: "less than {min} {name}" */
  var lower: js.UndefOr[String] = js.native
  
  /** Formatting of the biggest (rightmost) value of the legend. Default value: "more than {max} {name}" */
  var upper: js.UndefOr[String] = js.native
}
object LegendTitleTemplates {
  
  @scala.inline
  def apply(): LegendTitleTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendTitleTemplates]
  }
  
  @scala.inline
  implicit class LegendTitleTemplatesOps[Self <: LegendTitleTemplates] (val x: Self) extends AnyVal {
    
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
    def setInner(value: String): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    
    @scala.inline
    def setLower(value: String): Self = this.set("lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLower: Self = this.set("lower", js.undefined)
    
    @scala.inline
    def setUpper(value: String): Self = this.set("upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpper: Self = this.set("upper", js.undefined)
  }
}
