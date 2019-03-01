package typings
package atBlueprintjsCoreLib.libEsmComponentsProgressDashBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressBarProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * Whether the background should animate.
    * @default true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the background should be striped.
    * @default true
    */
  var stripes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1, respectively.
    * Omitting this prop will result in an "indeterminate" progress meter that fills the entire bar.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object IProgressBarProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    stripes: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null
  ): IProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (className != null) __obj.updateDynamic("className")(className)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(stripes)) __obj.updateDynamic("stripes")(stripes)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressBarProps]
  }
}

