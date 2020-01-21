package typings.bootpag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JqueryBootpag {
  /**
    * Event handler on page click.
    * @param event : JQueryEventObject
    * @param pageNumber : number of the clicked page
    */
  type PageEventHandler = js.Function2[/* event */ typings.jquery.JQueryEventObject, /* pageNumber */ scala.Double, js.Any]
}
