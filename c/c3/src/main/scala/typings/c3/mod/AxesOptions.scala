package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxesOptions extends StObject {
  
  /**
    * Switch x and y axis position.
    */
  var rotated: js.UndefOr[Boolean] = js.undefined
  
  /** x axis configuration. */
  var x: js.UndefOr[XAxisConfiguration] = js.undefined
  
  /** y axis configuration. */
  var y: js.UndefOr[YAxisConfigurationWithTime] = js.undefined
  
  /** y2 axis configuration. */
  var y2: js.UndefOr[YAxisConfiguration] = js.undefined
}
object AxesOptions {
  
  @scala.inline
  def apply(): AxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesOptions]
  }
  
  @scala.inline
  implicit class AxesOptionsMutableBuilder[Self <: AxesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
    
    @scala.inline
    def setX(value: XAxisConfiguration): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: YAxisConfigurationWithTime): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: YAxisConfiguration): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
