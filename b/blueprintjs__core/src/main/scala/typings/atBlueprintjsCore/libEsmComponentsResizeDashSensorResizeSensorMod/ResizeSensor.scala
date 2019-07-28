package typings.atBlueprintjsCore.libEsmComponentsResizeDashSensorResizeSensorMod

import typings.react.reactMod.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
@js.native
class ResizeSensor ()
  extends PureComponent[IResizeSensorProps, js.Object, js.Any] {
  var element: js.Any = js.native
  var observer: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizeSensor(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizeSensor(prevProps: IResizeSensorProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizeSensor(): Unit = js.native
  /* private */ def getElement(): js.Any = js.native
  /**
    * Observe the DOM element, if defined and different from the currently
    * observed element. Pass `force` argument to skip element checks and always
    * re-observe.
    */
  /* private */ def observeElement(): js.Any = js.native
  /* private */ def observeElement(force: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
@js.native
object ResizeSensor extends js.Object {
  var displayName: String = js.native
}

