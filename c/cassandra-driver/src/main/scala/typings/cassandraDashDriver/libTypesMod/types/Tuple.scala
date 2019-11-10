package typings.cassandraDashDriver.libTypesMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.Tuple")
@js.native
class Tuple protected () extends js.Object {
  def this(args: js.Any*) = this()
  var elements: js.Array[_] = js.native
  var length: Double = js.native
  def get(index: Double): js.Any = js.native
  def toJSON(): String = js.native
  def values(): js.Array[_] = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.Tuple")
@js.native
object Tuple extends js.Object {
  def fromArray(elements: js.Array[_]): Tuple = js.native
}

