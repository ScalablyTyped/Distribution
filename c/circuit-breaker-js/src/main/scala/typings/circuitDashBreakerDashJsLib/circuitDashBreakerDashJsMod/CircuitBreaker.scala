package typings
package circuitDashBreakerDashJsLib.circuitDashBreakerDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircuitBreaker extends js.Object {
  def forceClose(): scala.Unit = js.native
  def forceOpen(): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def run(
    command: js.Function2[
      /* success */ js.Function0[scala.Unit], 
      /* failure */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def run(
    command: js.Function2[
      /* success */ js.Function0[scala.Unit], 
      /* failure */ js.Function0[scala.Unit], 
      scala.Unit
    ],
    fallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def unforce(): scala.Unit = js.native
}

