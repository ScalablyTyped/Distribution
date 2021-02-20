package typings.c3.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisConfiguration extends StObject {
  
  /**
    * Show the axis inside of the chart.
    */
  var inner: js.UndefOr[Boolean] = js.native
  
  /**
    * Set max value of the axis.
    */
  var max: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * Set min value of the axis.
    */
  var min: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * Set padding for axis.
    * If this option is set, the range of axis will increase/decrease according to the values. If no padding is needed in the range of axis, `0` should be set. On category axis, this option
    * will be ignored.
    */
  var padding: js.UndefOr[Padding] = js.native
  
  /**
    * Show or hide the axis.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object AxisConfiguration {
  
  @scala.inline
  def apply(): AxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisConfiguration]
  }
  
  @scala.inline
  implicit class AxisConfigurationMutableBuilder[Self <: AxisConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInner(value: Boolean): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
    
    @scala.inline
    def setMax(value: String | Double | Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String | Double | Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
