package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable3
import typings.long.longMod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationStatic extends Instantiable3[
      /* month */ Double, 
      /* days */ Double, 
      (/* nanoseconds */ Double) | (/* nanoseconds */ ^), 
      Duration
    ] {
  def fromBuffer(buffer: Buffer): Duration = js.native
  def fromString(input: String): Duration = js.native
}

