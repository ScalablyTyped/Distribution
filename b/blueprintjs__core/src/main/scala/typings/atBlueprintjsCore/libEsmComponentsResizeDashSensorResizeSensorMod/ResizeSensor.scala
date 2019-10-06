package typings.atBlueprintjsCore.libEsmComponentsResizeDashSensorResizeSensorMod

import typings.atBlueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
@js.native
class ResizeSensor ()
  extends AbstractPureComponent2[IResizeSensorProps, js.Object, js.Object] {
  var element: js.Any = js.native
  var getElement: js.Any = js.native
  /**
    * Observe the DOM element, if defined and different from the currently
    * observed element. Pass `force` argument to skip element checks and always
    * re-observe.
    */
  var observeElement: js.Any = js.native
  var observer: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizeSensor(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizeSensor(prevProps: IResizeSensorProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizeSensor(): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
@js.native
object ResizeSensor extends js.Object {
  var displayName: String = js.native
}

