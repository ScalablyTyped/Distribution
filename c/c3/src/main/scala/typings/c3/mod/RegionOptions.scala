package typings.c3.mod

import typings.c3.c3Strings.dashed
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionOptions extends StObject {
  
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
  implicit class RegionOptionsMutableBuilder[Self <: RegionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: AxisName): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setEnd(value: String | Double | Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    @scala.inline
    def setStart(value: String | Double | Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStyle(value: dashed): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
