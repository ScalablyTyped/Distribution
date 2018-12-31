package typings
package brorandLib.brorandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandInstance extends js.Object {
  var rand: brorandLib.rand
  def generate(len: scala.Double): nodeLib.Buffer | stdLib.Uint8Array
}

