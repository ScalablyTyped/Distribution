package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable3
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalDateStatic extends Instantiable3[/* year */ Double, /* month */ Double, /* day */ Double, LocalDate] {
  def fromBuffer(buffer: Buffer): LocalDate = js.native
  def fromDate(date: Date): LocalDate = js.native
  def fromString(value: String): LocalDate = js.native
  def now(): LocalDate = js.native
  def utcNow(): LocalDate = js.native
}

