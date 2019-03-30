package typings
package atBlueprintjsCoreLib.libEsmComponentsSpinnerSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
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
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * HTML tag for the two wrapper elements. If rendering a `<Spinner>` inside
    * an `<svg>`, change this to an SVG element like `"g"`.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 173 */ js.Any
  ] = js.undefined
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1 respectively.
    * Omitting this prop will result in an "indeterminate" spinner where the head spins indefinitely.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ISpinnerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    size: scala.Int | scala.Double = null,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 173 */ js.Any = null,
    value: scala.Int | scala.Double = null
  ): ISpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerProps]
  }
}

