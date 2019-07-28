package typings.brorand.brorandMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandInstance extends js.Object {
  var rand: typings.brorand.brorandMod.rand
  def generate(len: Double): Buffer | Uint8Array
}

object RandInstance {
  @scala.inline
  def apply(generate: Double => Buffer | Uint8Array, rand: rand): RandInstance = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand)
  
    __obj.asInstanceOf[RandInstance]
  }
}

