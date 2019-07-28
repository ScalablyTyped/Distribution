package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotkeysTargetComponent
  extends Component[js.Object, js.Object, js.Any] {
  /**
    * Components decorated with the `@HotkeysTarget` decorator must implement
    * this method, and it must return a `Hotkeys` React element.
    */
  def renderHotkeys(): ReactElement = js.native
}

