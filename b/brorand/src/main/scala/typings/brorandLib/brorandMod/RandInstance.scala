package typings
package brorandLib.brorandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandInstance extends js.Object {
  var rand: brorandLib.brorandMod.rand
  def generate(len: scala.Double): nodeLib.Buffer | stdLib.Uint8Array
}

object RandInstance {
  @scala.inline
  def apply(generate: scala.Double => nodeLib.Buffer | stdLib.Uint8Array, rand: rand): RandInstance = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand)
  
    __obj.asInstanceOf[RandInstance]
  }
}

