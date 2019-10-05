package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UuidStatic extends Instantiable1[/* buffer */ Buffer, Uuid] {
  def fromString(value: String): Uuid = js.native
  def random(): Uuid = js.native
}

