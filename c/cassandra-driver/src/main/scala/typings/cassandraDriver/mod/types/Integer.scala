package typings.cassandraDriver.mod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Integer")
@js.native
class Integer protected ()
  extends typings.cassandraDriver.typesMod.types.Integer {
  def this(bits: js.Array[Double], sign: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Integer")
@js.native
object Integer extends js.Object {
  var ONE: typings.cassandraDriver.typesMod.types.Integer = js.native
  var ZERO: typings.cassandraDriver.typesMod.types.Integer = js.native
  def fromBits(bits: js.Array[Double]): typings.cassandraDriver.typesMod.types.Integer = js.native
  def fromBuffer(bits: Buffer): typings.cassandraDriver.typesMod.types.Integer = js.native
  def fromInt(value: Double): typings.cassandraDriver.typesMod.types.Integer = js.native
  def fromNumber(value: Double): typings.cassandraDriver.typesMod.types.Integer = js.native
  def fromString(str: String): typings.cassandraDriver.typesMod.types.Integer = js.native
  def fromString(str: String, opt_radix: Double): typings.cassandraDriver.typesMod.types.Integer = js.native
  def toBuffer(value: typings.cassandraDriver.typesMod.types.Integer): Buffer = js.native
}

