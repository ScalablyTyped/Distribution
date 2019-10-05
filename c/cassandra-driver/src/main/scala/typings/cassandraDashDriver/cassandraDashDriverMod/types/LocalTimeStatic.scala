package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable1
import typings.long.longMod.^
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalTimeStatic extends Instantiable1[/* totalNanoseconds */ ^, LocalTime] {
  def fromBuffer(value: Buffer): LocalTime = js.native
  def fromDate(date: Date, nanoseconds: Double): LocalTime = js.native
  def fromMilliseconds(milliseconds: Double): LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): LocalTime = js.native
  def fromString(value: String): LocalTime = js.native
  def now(): LocalTime = js.native
  def now(nanoseconds: Double): LocalTime = js.native
}

