package typings.blueprintjsCore

import typings.blueprintjsCore.anon.DisplayName
import typings.blueprintjsCore.constructorMod.IConstructor
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysTargetMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTarget", "HotkeysTarget")
  @js.native
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName with T = js.native
  
  @js.native
  trait IHotkeysTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    
    /**
      * Components decorated with the `@HotkeysTarget` decorator must implement
      * this method, and it must return a `Hotkeys` React element.
      */
    def renderHotkeys(): ReactElement = js.native
  }
}
