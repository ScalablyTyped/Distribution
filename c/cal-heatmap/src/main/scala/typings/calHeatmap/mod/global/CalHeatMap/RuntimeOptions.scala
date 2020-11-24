package typings.calHeatmap.mod.global.CalHeatMap

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeOptions extends InitOptions {
  
  /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("domainMargin")
  var domainMargin_RuntimeOptions: js.Array[Double] = js.native
  
  /** List of dates to highlight */
  @JSName("highlight")
  var highlight_RuntimeOptions: js.Array[Date] = js.native
  
  /**
    * Name of the items to represent in the calendar.
    * First index is singular form, and the second index, the plural form.
    */
  @JSName("itemName")
  var itemName_RuntimeOptions: js.Array[String] = js.native
  
  /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("legendMargin")
  var legendMargin_RuntimeOptions: js.Array[Double] = js.native
}
object RuntimeOptions {
  
  @scala.inline
  def apply(
    domainMargin: js.Array[Double],
    highlight: js.Array[Date],
    itemName: js.Array[String],
    legendMargin: js.Array[Double]
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal(domainMargin = domainMargin.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], legendMargin = legendMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeOptions]
  }
  
  @scala.inline
  implicit class RuntimeOptionsOps[Self <: RuntimeOptions] (val x: Self) extends AnyVal {
    
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
    def setDomainMarginVarargs(value: Double*): Self = this.set("domainMargin", js.Array(value :_*))
    
    @scala.inline
    def setDomainMargin(value: js.Array[Double]): Self = this.set("domainMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightVarargs(value: Date*): Self = this.set("highlight", js.Array(value :_*))
    
    @scala.inline
    def setHighlight(value: js.Array[Date]): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNameVarargs(value: String*): Self = this.set("itemName", js.Array(value :_*))
    
    @scala.inline
    def setItemName(value: js.Array[String]): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendMarginVarargs(value: Double*): Self = this.set("legendMargin", js.Array(value :_*))
    
    @scala.inline
    def setLegendMargin(value: js.Array[Double]): Self = this.set("legendMargin", value.asInstanceOf[js.Any])
  }
}
