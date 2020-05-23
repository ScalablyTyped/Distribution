package typings.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime

import typings.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 'left', 'right', or 'center'
    */
  var align: js.UndefOr[AlignType] = js.undefined
  /**
    *  If true then will display a cross to close the popup.
    */
  var allow_dismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Time while the message will be displayed. It's not equivalent to the *demo* timeOut!
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Which element to append to
    */
  var ele: js.UndefOr[String] = js.undefined
  /**
    * Offset Options
    */
  var offset: js.UndefOr[OffsetOption] = js.undefined
  /**
    * Spacing between consecutively stacked growls.
    */
  var stackup_spacing: js.UndefOr[Double] = js.undefined
  /**
    * Values of (null, 'info', 'danger', 'success', 'warning') or another value
    */
  var `type`: js.UndefOr[AlertType] = js.undefined
  /**
    * Integer or 'auto'
    */
  var width: js.UndefOr[Double | auto] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: AlignType = null,
    allow_dismiss: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    ele: String = null,
    offset: OffsetOption = null,
    stackup_spacing: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Null | AlertType] = js.undefined,
    width: Double | auto = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_dismiss)) __obj.updateDynamic("allow_dismiss")(allow_dismiss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (ele != null) __obj.updateDynamic("ele")(ele.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(stackup_spacing)) __obj.updateDynamic("stackup_spacing")(stackup_spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

