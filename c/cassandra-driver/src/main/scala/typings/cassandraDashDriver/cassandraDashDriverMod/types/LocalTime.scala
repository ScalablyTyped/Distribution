package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import typings.long.longMod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalTime extends js.Object {
  var hour: Double
  var minute: Double
  var nanosecond: Double
  var second: Double
  def compare(other: LocalTime): Boolean
  def equals(other: LocalTime): Boolean
  def getTotalNanoseconds(): ^
  def inspect(): String
  def toBuffer(): Buffer
  def toJSON(): String
}

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
object LocalTime extends TopLevel[LocalTimeStatic]

