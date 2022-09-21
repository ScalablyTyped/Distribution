package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.always
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onHover
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMode extends StObject {
  
  /**
    * Specifies whether a tooltip is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a tooltip&apos;s display format.
    */
  var format: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Specifies whether a tooltip is over or under the slider.
    */
  var position: js.UndefOr[bottom | top] = js.undefined
  
  /**
    * Specifies when the UI component shows a tooltip.
    */
  var showMode: js.UndefOr[always | onHover] = js.undefined
}
object ShowMode {
  
  inline def apply(): ShowMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMode]
  }
  
  extension [Self <: ShowMode](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormat(value: typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPosition(value: bottom | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowMode(value: always | onHover): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
    
    inline def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
  }
}
