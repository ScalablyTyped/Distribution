package typings.c3.mod

import typings.c3.c3Strings.dashed
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionOptions extends js.Object {
  
  /**
    * The axis on which `start` and `end` values lie.
    */
  var axis: js.UndefOr[AxisName] = js.native
  
  /**
    * An optional class to apply to the region, which can be used for styling
    * or targeting.
    */
  var `class`: js.UndefOr[String] = js.native
  
  /**
    * The point on the axis at which to end the region. If not provided, will
    * use the end edge of the axis.
    */
  var end: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * An optional label property can be provided to display a label for the region.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Control the opacity of the region area.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Control the position of the label horizontally.
    */
  var paddingX: js.UndefOr[Double] = js.native
  
  /**
    * Control the position of the label vertically.
    */
  var paddingY: js.UndefOr[Double] = js.native
  
  /**
    * The point on the axis at which to start the region. If not provided, will
    * use the start edge of the axis.
    */
  var start: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * If `'dashed'`, renders the line as dashed in this range instead of showing a region block.
    */
  var style: js.UndefOr[dashed] = js.native
  
  /**
    * Used to identify whether or not the label text should be rotated 90 degrees
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object RegionOptions {
  
  @scala.inline
  def apply(): RegionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionOptions]
  }
  
  @scala.inline
  implicit class RegionOptionsOps[Self <: RegionOptions] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: AxisName): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setEnd(value: String | Double | Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPaddingX(value: Double): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: Double): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    
    @scala.inline
    def setStart(value: String | Double | Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStyle(value: dashed): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
