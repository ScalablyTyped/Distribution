package typings.blueprintjsCore

import typings.blueprintjsCore.constructorMod.IConstructor
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTarget", JSImport.Namespace)
@js.native
object hotkeysTargetMod extends js.Object {
  @js.native
  trait IHotkeysTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    /**
      * Components decorated with the `@HotkeysTarget` decorator must implement
      * this method, and it must return a `Hotkeys` React element.
      */
    def renderHotkeys(): ReactElement = js.native
  }
  
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): AnonDisplayName with T = js.native
}

