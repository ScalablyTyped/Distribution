package typings.cesium

import typings.cesium.anon.Toggled
import typings.cesium.mod.Command
import typings.cesium.mod.ToggleButtonViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonViewModelMod {
  
  @JSImport("cesium/Source/Widgets/ToggleButtonViewModel", JSImport.Default)
  @js.native
  open class default protected () extends ToggleButtonViewModel {
    def this(command: Command) = this()
    def this(command: Command, options: Toggled) = this()
  }
}
