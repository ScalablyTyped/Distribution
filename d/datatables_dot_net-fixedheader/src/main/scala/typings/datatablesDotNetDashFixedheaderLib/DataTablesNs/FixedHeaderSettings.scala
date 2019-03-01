package typings
package datatablesDotNetDashFixedheaderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * FixedHeader extension options
  */
trait FixedHeaderSettings extends js.Object {
  /*
    * Enable / disable fixed footer
    */
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Offset the table's fixed footer
    */
  var footerOffset: js.UndefOr[scala.Double] = js.undefined
  /*
    * Enable / disable fixed header
    */
  var header: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Offset the table's fixed header
    */
  var headerOffset: js.UndefOr[scala.Double] = js.undefined
}

object FixedHeaderSettings {
  @scala.inline
  def apply(
    footer: js.UndefOr[scala.Boolean] = js.undefined,
    footerOffset: scala.Int | scala.Double = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    headerOffset: scala.Int | scala.Double = null
  ): FixedHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (footerOffset != null) __obj.updateDynamic("footerOffset")(footerOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (headerOffset != null) __obj.updateDynamic("headerOffset")(headerOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedHeaderSettings]
  }
}

