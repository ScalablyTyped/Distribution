package typings.blueprintjsCore.resizeSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var observeParents: js.UndefOr[Boolean] = js.native
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
  def onResize(entries: js.Array[IResizeEntry]): Unit = js.native
}

object IResizeSensorProps {
  @scala.inline
  def apply(onResize: js.Array[IResizeEntry] => Unit): IResizeSensorProps = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[IResizeSensorProps]
  }
  @scala.inline
  implicit class IResizeSensorPropsOps[Self <: IResizeSensorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnResize(value: js.Array[IResizeEntry] => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def setObserveParents(value: Boolean): Self = this.set("observeParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveParents: Self = this.set("observeParents", js.undefined)
  }
  
}

