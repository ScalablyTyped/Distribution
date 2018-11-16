package typings
package axonLib.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "SubSocket")
@js.native
class SubSocket () extends Socket {
  def clearSubscriptions(): scala.Unit = js.native
  def hasSubscriptions(): scala.Boolean = js.native
  def matches(topic: java.lang.String): scala.Boolean = js.native
  /**
       * @throws {Error}
       */
  def send(): scala.Unit = js.native
  def subscribe(re: java.lang.String): stdLib.RegExp = js.native
  def subscribe(re: stdLib.RegExp): stdLib.RegExp = js.native
  def unsubscribe(re: java.lang.String): scala.Unit = js.native
  def unsubscribe(re: stdLib.RegExp): scala.Unit = js.native
}

