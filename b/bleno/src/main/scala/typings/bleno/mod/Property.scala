package typings.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bleno.blenoStrings.read
  - typings.bleno.blenoStrings.write
  - typings.bleno.blenoStrings.indicate
  - typings.bleno.blenoStrings.notify
  - typings.bleno.blenoStrings.writeWithoutResponse
*/
trait Property extends js.Object

object Property {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def indicate: typings.bleno.blenoStrings.indicate = this.cast("indicate")
  @scala.inline
  def read: typings.bleno.blenoStrings.read = this.cast("read")
  @scala.inline
  def write: typings.bleno.blenoStrings.write = this.cast("write")
  @scala.inline
  def writeWithoutResponse: typings.bleno.blenoStrings.writeWithoutResponse = this.cast("writeWithoutResponse")
}

