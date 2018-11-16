package typings
package bufferDashFromLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-from", JSImport.Namespace)
@js.native
object bufferDashFromMod extends js.Object {
  def apply(arrayBuffer: stdLib.ArrayBuffer): nodeLib.Buffer = js.native
  def apply(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double): nodeLib.Buffer = js.native
  def apply(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
  def apply(data: js.Array[_] | nodeLib.Buffer): nodeLib.Buffer = js.native
  def apply(str: java.lang.String): nodeLib.Buffer = js.native
  def apply(str: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
}

