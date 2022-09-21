package typings.cesium

import typings.cesium.mod.Clock
import typings.cesium.mod.ClockViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clockViewModelMod {
  
  @JSImport("cesium/Source/Widgets/ClockViewModel", JSImport.Default)
  @js.native
  open class default () extends ClockViewModel {
    def this(clock: Clock) = this()
  }
}
