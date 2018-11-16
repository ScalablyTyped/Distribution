package typings
package bloemLib.bloemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloem", "SafeBloem")
@js.native
class SafeBloem protected () extends js.Object {
  def this(capacity: scala.Double, error_rate: scala.Double, buffer: nodeLib.Buffer) = this()
  def add(key: nodeLib.Buffer): scala.Boolean = js.native
  def has(key: nodeLib.Buffer): scala.Boolean = js.native
}

