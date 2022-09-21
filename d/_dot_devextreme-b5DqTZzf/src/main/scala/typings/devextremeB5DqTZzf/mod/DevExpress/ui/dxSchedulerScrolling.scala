package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.standard
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSchedulerScrolling extends StObject {
  
  /**
    * Specifies the scrolling mode.
    */
  var mode: js.UndefOr[standard | virtual] = js.undefined
}
object dxSchedulerScrolling {
  
  inline def apply(): dxSchedulerScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerScrolling]
  }
  
  extension [Self <: dxSchedulerScrolling](x: Self) {
    
    inline def setMode(value: standard | virtual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
