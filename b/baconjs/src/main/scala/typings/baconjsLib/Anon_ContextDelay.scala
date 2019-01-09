package typings
package baconjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDelay[E, A] extends js.Object {
  var delay: js.UndefOr[js.Function1[/* context */ Anon_Error[E], scala.Double]] = js.undefined
  var isRetryable: js.UndefOr[js.Function1[/* error */ E, scala.Boolean]] = js.undefined
  var retries: scala.Double
  def source(): baconjsLib.BaconNs.Property[E, A]
}

