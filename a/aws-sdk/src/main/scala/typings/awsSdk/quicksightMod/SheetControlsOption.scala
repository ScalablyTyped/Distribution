package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetControlsOption extends StObject {
  
  /**
    * Visibility state.
    */
  var VisibilityState: js.UndefOr[DashboardUIState] = js.undefined
}
object SheetControlsOption {
  
  @scala.inline
  def apply(): SheetControlsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetControlsOption]
  }
  
  @scala.inline
  implicit class SheetControlsOptionMutableBuilder[Self <: SheetControlsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibilityState(value: DashboardUIState): Self = StObject.set(x, "VisibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityStateUndefined: Self = StObject.set(x, "VisibilityState", js.undefined)
  }
}
