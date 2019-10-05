package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeUuidStatic
  extends Instantiable1[/* value */ Date, TimeUuid]
     with Instantiable4[
      /* value */ Date, 
      /* ticks */ Double, 
      (/* nodeId */ Buffer) | (/* nodeId */ String), 
      (/* clockId */ Buffer) | (/* clockId */ String), 
      TimeUuid
    ]
     with Instantiable3[
      /* value */ Date, 
      /* ticks */ Double, 
      (/* nodeId */ Buffer) | (/* nodeId */ String), 
      TimeUuid
    ]
     with Instantiable2[/* value */ Date, /* ticks */ Double, TimeUuid]
     with Instantiable0[TimeUuid] {
  def fromDate(date: Date): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String): TimeUuid = js.native
  def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  def fromString(value: String): TimeUuid = js.native
  def max(date: Date): TimeUuid = js.native
  def max(date: Date, ticks: Double): TimeUuid = js.native
  def min(date: Date): TimeUuid = js.native
  def min(date: Date, ticks: Double): TimeUuid = js.native
  def now(): TimeUuid = js.native
  def now(nodeId: String): TimeUuid = js.native
  def now(nodeId: String, clockId: String): TimeUuid = js.native
  def now(nodeId: String, clockId: Buffer): TimeUuid = js.native
  def now(nodeId: Buffer): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
}

