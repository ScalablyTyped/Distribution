package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOptions
  extends StObject
     with ScrollableTextOptions {
  
  /**
    * scroll to bottom on input even if the user has scrolled up. default: false.
    */
  var scrollOnInput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * amount of scrollback allowed. default: Infinity.
    */
  var scrollback: js.UndefOr[Double] = js.undefined
}
object LogOptions {
  
  @scala.inline
  def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  
  @scala.inline
  implicit class LogOptionsMutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollOnInput(value: Boolean): Self = StObject.set(x, "scrollOnInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOnInputUndefined: Self = StObject.set(x, "scrollOnInput", js.undefined)
    
    @scala.inline
    def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
  }
}
