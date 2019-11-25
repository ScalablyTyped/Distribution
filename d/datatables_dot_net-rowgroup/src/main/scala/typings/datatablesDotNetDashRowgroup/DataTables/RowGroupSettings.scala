package typings.datatablesDotNetDashRowgroup.DataTables

import typings.datatablesDotNet.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * RowGroup extension options
	 */
trait RowGroupSettings extends js.Object {
  /**
  		 * Set the class name to be used for the grouping rows
  		 */
  var className: js.UndefOr[String] = js.undefined
  /**
  		 * Set the data point to use as the grouping data source
  		 */
  var dataSrc: js.UndefOr[Double | String] = js.undefined
  /**
  		 * Provides the ability to disable row grouping at initialisation
  		 */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Set the class name to be used for the grouping end rows
  		 */
  var endClassName: js.UndefOr[String] = js.undefined
  /**
  		 * Provide a function that can be used to control the data shown in the end grouping row
  		 */
  var endRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.undefined
  /**
  		 * Provide a function that can be used to control the data shown in the start grouping row
  		 */
  var startRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.undefined
}

object RowGroupSettings {
  @scala.inline
  def apply(
    className: String = null,
    dataSrc: Double | String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    endClassName: String = null,
    endRender: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery = null,
    startRender: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery = null
  ): RowGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSrc != null) __obj.updateDynamic("dataSrc")(dataSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (endClassName != null) __obj.updateDynamic("endClassName")(endClassName.asInstanceOf[js.Any])
    if (endRender != null) __obj.updateDynamic("endRender")(js.Any.fromFunction2(endRender))
    if (startRender != null) __obj.updateDynamic("startRender")(js.Any.fromFunction2(startRender))
    __obj.asInstanceOf[RowGroupSettings]
  }
}

