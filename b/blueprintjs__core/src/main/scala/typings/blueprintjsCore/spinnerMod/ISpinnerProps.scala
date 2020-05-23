package typings.blueprintjsCore.spinnerMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerProps
  extends IProps
     with IIntentProps {
  /**
    * Width and height of the spinner in pixels. The size cannot be less than
    * 10px.
    *
    * Constants are available for common sizes:
    * - `Spinner.SIZE_SMALL = 20px`
    * - `Spinner.SIZE_STANDARD = 50px`
    * - `Spinner.SIZE_LARGE = 100px`
    *
    * @default Spinner.SIZE_STANDARD = 50
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * HTML tag for the two wrapper elements. If rendering a `<Spinner>` inside
    * an `<svg>`, change this to an SVG element like `"g"`.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1 respectively.
    * Omitting this prop will result in an "indeterminate" spinner where the head spins indefinitely.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ISpinnerProps {
  @scala.inline
  def apply(
    className: String = null,
    intent: Intent = null,
    size: js.UndefOr[Double] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    value: js.UndefOr[Double] = js.undefined
  ): ISpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerProps]
  }
}

