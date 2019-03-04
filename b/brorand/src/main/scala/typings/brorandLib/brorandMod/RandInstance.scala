package typings
package brorandLib.brorandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandInstance extends js.Object {
  var rand: brorandLib.rand
  def generate(len: scala.Double): nodeLib.Buffer | stdLib.Uint8Array
}

object RandInstance {
  @scala.inline
  def apply(generate: js.Function1[scala.Double, nodeLib.Buffer | stdLib.Uint8Array], rand: brorandLib.rand): RandInstance = {
    val __obj = js.Dynamic.literal(generate = generate, rand = rand)
  
    __obj.asInstanceOf[RandInstance]
  }
}

