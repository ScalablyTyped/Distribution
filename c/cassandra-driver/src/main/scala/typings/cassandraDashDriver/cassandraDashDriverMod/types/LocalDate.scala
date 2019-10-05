package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalDate extends js.Object {
  var _value: Double
  var day: Double
  var month: Double
  var year: Double
  def equals(other: LocalDate): Boolean
  def inspect(): String
  def toBuffer(): Buffer
  def toJSON(): String
}

@JSImport("cassandra-driver", "types.LocalDate")
@js.native
object LocalDate extends TopLevel[LocalDateStatic]

