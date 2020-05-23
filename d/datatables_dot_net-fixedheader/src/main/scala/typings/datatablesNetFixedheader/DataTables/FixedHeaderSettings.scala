package typings.datatablesNetFixedheader.DataTables

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
    footerOffset: js.UndefOr[Double] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    headerOffset: js.UndefOr[Double] = js.undefined
  ): FixedHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(footerOffset)) __obj.updateDynamic("footerOffset")(footerOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerOffset)) __obj.updateDynamic("headerOffset")(headerOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedHeaderSettings]
  }
}

