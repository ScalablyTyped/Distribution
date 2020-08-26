package typings.blueprintjsCore.multiSliderMod

import typings.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiSliderProps extends ISliderBaseProps {
  /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
  var defaultTrackIntent: js.UndefOr[Intent] = js.native
  /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  /** Callback invoked when a handle is released. Receives handle values in sorted order. */
  var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
}

object IMultiSliderProps {
  @scala.inline
  def apply(): IMultiSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiSliderProps]
  }
  @scala.inline
  implicit class IMultiSliderPropsOps[Self <: IMultiSliderProps] (val x: Self) extends AnyVal {
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
    def setDefaultTrackIntent(value: Intent): Self = this.set("defaultTrackIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTrackIntent: Self = this.set("defaultTrackIntent", js.undefined)
    @scala.inline
    def setOnChange(value: /* values */ js.Array[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnRelease(value: /* values */ js.Array[Double] => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
  }
  
}

