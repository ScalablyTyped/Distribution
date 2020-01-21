package typings.blueprintjsCore.progressBarMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressBarProps
  extends IProps
     with IIntentProps {
  /**
    * Whether the background should animate.
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the background should be striped.
    * @default true
    */
  var stripes: js.UndefOr[Boolean] = js.undefined
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1, respectively.
    * Omitting this prop will result in an "indeterminate" progress meter that fills the entire bar.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IProgressBarProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    intent: Intent = null,
    stripes: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null
  ): IProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(stripes)) __obj.updateDynamic("stripes")(stripes.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressBarProps]
  }
}

