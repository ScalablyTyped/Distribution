package typings.bootstrapDashGrowlDashIfightcrime.BootstrapGrowlIfightcrimeNs

import typings.bootstrapDashGrowlDashIfightcrime.bootstrapDashGrowlDashIfightcrimeStrings.auto
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
    delay: Int | Double = null,
    ele: String = null,
    offset: OffsetOption = null,
    stackup_spacing: Int | Double = null,
    `type`: AlertType = null,
    width: Double | auto = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allow_dismiss)) __obj.updateDynamic("allow_dismiss")(allow_dismiss)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (ele != null) __obj.updateDynamic("ele")(ele)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (stackup_spacing != null) __obj.updateDynamic("stackup_spacing")(stackup_spacing.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

