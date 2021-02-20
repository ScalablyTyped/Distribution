package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarOptions extends BoxOptions {
  
  /**
    * the amount filled (0 - 100).
    */
  var filled: js.UndefOr[Double] = js.native
  
  /**
    * enable key support.
    */
  @JSName("keys")
  var keys_ProgressBarOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * enable mouse support.
    */
  @JSName("mouse")
  var mouse_ProgressBarOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * can be `horizontal` or `vertical`.
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * the character to fill the bar with (default is space).
    */
  var pch: js.UndefOr[String] = js.native
  
  /**
    * same as `filled`.
    */
  var value: js.UndefOr[Double] = js.native
}
object ProgressBarOptions {
  
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilled(value: Double): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    @scala.inline
    def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setMouse(value: Boolean): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPch(value: String): Self = StObject.set(x, "pch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPchUndefined: Self = StObject.set(x, "pch", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
