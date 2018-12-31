package typings
package bootpagLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JqueryBootpagNs {
  /**
    * Event handler on page click.
    * @param event : JQueryEventObject
    * @param pageNumber : number of the clicked page
    */
  type PageEventHandler = js.Function2[/* event */ jqueryLib.JQueryEventObject, /* pageNumber */ scala.Double, js.Any]
}
