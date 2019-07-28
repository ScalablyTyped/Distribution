package typings.atBlueprintjsCore.libEsmComponentsResizeDashSensorResizeSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeSensorProps extends js.Object {
  /**
    * If `true`, all parent DOM elements of the container will also be
    * observed for size changes. The array of entries passed to `onResize`
    * will now contain an entry for each parent element up to the root of the
    * document.
    *
    * Only enable this prop if a parent element resizes in a way that does
    * not also cause the child element to resize.
    * @default false
    */
  var observeParents: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback invoked when the wrapped element resizes.
    *
    * The `entries` array contains an entry for each observed element. In the
    * default case (no `observeParents`), the array will contain only one
    * element: the single child of the `ResizeSensor`.
    *
    * Note that this method is called _asynchronously_ after a resize is
    * detected and typically it will be called no more than once per frame.
    */
  def onResize(entries: js.Array[IResizeEntry]): Unit
}

object IResizeSensorProps {
  @scala.inline
  def apply(onResize: js.Array[IResizeEntry] => Unit, observeParents: js.UndefOr[Boolean] = js.undefined): IResizeSensorProps = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents)
    __obj.asInstanceOf[IResizeSensorProps]
  }
}

