package typings.cassandraDashDriver.cassandraDashDriverMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Integer")
@js.native
class Integer protected ()
  extends typings.cassandraDashDriver.libTypesMod.types.Integer {
  def this(bits: js.Array[Double], sign: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Integer")
@js.native
object Integer extends js.Object {
  var ONE: typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  var ZERO: typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromBits(bits: js.Array[Double]): typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromBuffer(bits: Buffer): typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromInt(value: Double): typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromNumber(value: Double): typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromString(str: String): typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def fromString(str: String, opt_radix: Double): typings.cassandraDashDriver.libTypesMod.types.Integer = js.native
  def toBuffer(value: typings.cassandraDashDriver.libTypesMod.types.Integer): Buffer = js.native
}

