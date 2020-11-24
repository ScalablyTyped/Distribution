package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTitleOptions extends js.Object {
  
  /**
    * Sets the background color of Chart Title. Values can be "HTML Color Name" or "hex" code.
    * Default: null
    * Example: "red", "#FF0000" ..
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the color of border around Chart Title. Values of borderColor can be "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FF0000" ..
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the thickness of border around the Title in pixels. To display border around title, set the borderThickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[Double] = js.native
  
  /**
    * To display rounded borders around the title, set the cornerRadius of title. Higher the value, more rounded are the corners.
    * Default: 0
    * Options: 5,8 ..
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  
  /**
    * When dockInsidePlotArea is set to true, title renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: false, true.
    */
  var dockInsidePlotArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the font color of Chart Title. The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Family of Chart Title.
    * Default: "calibri, Optima, Candara, verdana, Geneva, sans-serif"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Sets the font Size of Chart Title in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the fontStyle of Chart Title. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Weight used in the Chart Title.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /**
    * This property lets you align the Chart Title horizontally.
    * Default: "center"
    * Options: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[String] = js.native
  
  /**
    * This property lets you set margin around the Chart Title in pixels.
    * Default: 5
    * Example: 4,12 ..
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether wrap is set to true (default) or false.
    * Default: Automatically calculated based on the chart size.
    * Example: 200, 400 ..
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * This property allows you to set the padding for Chart Title
    * Default: 0
    * Example: 5, 8 ..
    */
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Title’s text.
    * Default: null
    * Example: "Chart title"
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * This property lets you align the Chart Title vertically.
    * Default: "top"
    * Options: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[String] = js.native
  
  /**
    * Wrap specifies whether to wrap the title once its width crosses maxWidth or not. If it is set to false, title gets clipped after reaching maxWidth.
    * Default: true;
    * Example : true, false
    */
  var wrap: js.UndefOr[Boolean] = js.native
}
object ChartTitleOptions {
  
  @scala.inline
  def apply(): ChartTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleOptions]
  }
  
  @scala.inline
  implicit class ChartTitleOptionsOps[Self <: ChartTitleOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderThickness(value: Double): Self = this.set("borderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderThickness: Self = this.set("borderThickness", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setDockInsidePlotArea(value: Boolean): Self = this.set("dockInsidePlotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockInsidePlotArea: Self = this.set("dockInsidePlotArea", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setHorizontalAlign(value: String): Self = this.set("horizontalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlign: Self = this.set("horizontalAlign", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
