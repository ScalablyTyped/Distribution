package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "Decimal128")
@js.native
class Decimal128 protected () extends js.Object {
  /**
    * @param bytes A buffer containing the raw Decimal128 bytes.
    */
  def this(bytes: nodeLib.Buffer) = this()
  /** A buffer containing the raw Decimal128 bytes. */
  val bytes: nodeLib.Buffer = js.native
  def toJSON(): java.lang.String = js.native
}

@JSImport("bson", "Decimal128")
@js.native
object Decimal128 extends js.Object {
  /** Create a Decimal128 instance from a string representation. */
  def fromString(s: java.lang.String): bsonLib.bsonMod.Decimal128 = js.native
}

