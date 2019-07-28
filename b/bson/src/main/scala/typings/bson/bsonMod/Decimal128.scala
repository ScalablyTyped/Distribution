package typings.bson.bsonMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "Decimal128")
@js.native
class Decimal128 protected () extends js.Object {
  /**
    * @param bytes A buffer containing the raw Decimal128 bytes.
    */
  def this(bytes: Buffer) = this()
  /** A buffer containing the raw Decimal128 bytes. */
  val bytes: Buffer = js.native
  def toJSON(): String = js.native
}

/* static members */
@JSImport("bson", "Decimal128")
@js.native
object Decimal128 extends js.Object {
  /** Create a Decimal128 instance from a string representation. */
  def fromString(s: String): Decimal128 = js.native
}

