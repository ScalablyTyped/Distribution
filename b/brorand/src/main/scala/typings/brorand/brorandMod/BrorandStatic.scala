package typings.brorand.brorandMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrorandStatic extends js.Object {
  var Rand: RandStatic = js.native
  def apply(len: Double): Buffer | Uint8Array = js.native
}

