package typings
package datatablesDotNetDashAutofillLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillSettings extends js.Object {
  /*
    * Always ask the end user if an action should be taken or not
    */
  var alwaysAsk: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Select the columns that can be auto filled
    */
  var columns: java.lang.String | js.Array[scala.Double]
  /*
    *
    * Initial enablement state of AutoFill
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
}

