package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tuple extends js.Object {
  var elements: js.Array[_]
  var length: Double
  def get(index: Double): js.Any
  def toJSON(): String
  def values(): js.Array[_]
}

@JSImport("cassandra-driver", "types.Tuple")
@js.native
object Tuple extends TopLevel[TupleStatic]

