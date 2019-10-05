package typings.datatablesDotNetDashFixedheader.DataTables

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
  var footer: js.UndefOr[Boolean] = js.undefined
  /*
    * Offset the table's fixed footer
    */
  var footerOffset: js.UndefOr[Double] = js.undefined
  /*
    * Enable / disable fixed header
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /*
    * Offset the table's fixed header
    */
  var headerOffset: js.UndefOr[Double] = js.undefined
}

object FixedHeaderSettings {
  @scala.inline
  def apply(
    footer: js.UndefOr[Boolean] = js.undefined,
    footerOffset: Int | Double = null,
    header: js.UndefOr[Boolean] = js.undefined,
    headerOffset: Int | Double = null
  ): FixedHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (footerOffset != null) __obj.updateDynamic("footerOffset")(footerOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (headerOffset != null) __obj.updateDynamic("headerOffset")(headerOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedHeaderSettings]
  }
}

