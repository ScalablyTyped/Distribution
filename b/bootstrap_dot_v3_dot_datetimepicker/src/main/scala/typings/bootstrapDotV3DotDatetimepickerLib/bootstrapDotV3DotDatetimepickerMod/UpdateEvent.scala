package typings
package bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvent
  extends jqueryLib.JQueryEventObject {
  /** Change type as a momentjs format token. e.g. yyyy on year change */
  var change: java.lang.String = js.native
  /** New viewDate. */
  var viewDate: momentLib.momentMod.momentNs.Moment = js.native
}

