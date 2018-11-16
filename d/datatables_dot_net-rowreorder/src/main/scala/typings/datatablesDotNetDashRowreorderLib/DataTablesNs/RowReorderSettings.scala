package typings
package datatablesDotNetDashRowreorderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowReorderSettings extends js.Object {
  /**
           * Configure the data point that will be used for the reordering data
           */
  var dataSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Attach an Editor instance for database updating
           */
  var editor: js.UndefOr[js.Any] = js.undefined
  /**
           * Enable / disable RowReorder's user interaction
           */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set the options for the Editor form when submitting data
           */
  var formOptions: js.UndefOr[js.Any] = js.undefined
  /**
           * Define the selector used to pick the elements that will start a drag
           */
  var selector: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Horizontal position control of the row being dragged
           */
  var snapX: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
           * Control automatic of data when a row is dropped
           */
  var update: js.UndefOr[scala.Boolean] = js.undefined
}

