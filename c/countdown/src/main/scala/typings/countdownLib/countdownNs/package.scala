package typings
package countdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object countdownNs {
  type DateFunction = js.Function1[/* timespan */ Timespan, scala.Unit]
  type DateTime = scala.Double | stdLib.Date | DateFunction
}
