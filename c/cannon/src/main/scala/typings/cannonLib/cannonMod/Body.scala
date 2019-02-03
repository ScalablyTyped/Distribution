package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Body")
@js.native
class Body ()
  extends cannonLib.CANNONNs.Body {
  def this(options: cannonLib.CANNONNs.IBodyOptions) = this()
}

/* static members */
@JSImport("cannon", "Body")
@js.native
object Body extends js.Object {
  var AWAKE: scala.Double = js.native
  var DYNAMIC: scala.Double = js.native
  var KINEMATIC: scala.Double = js.native
  var SLEEPING: scala.Double = js.native
  var SLEEPY: scala.Double = js.native
  var STATIC: scala.Double = js.native
  var sleepEvent: cannonLib.CANNONNs.IEvent = js.native
  var sleepyEvent: cannonLib.CANNONNs.IEvent = js.native
}

