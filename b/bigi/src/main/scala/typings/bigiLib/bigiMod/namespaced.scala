package typings
package bigiLib.bigiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bigi", JSImport.Namespace)
@js.native
class namespaced protected () extends bigi {
  def this(a: js.Any, b: js.Any, c: js.Any) = this()
}

/* static members */
@JSImport("bigi", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def fromBuffer(buffer: js.Any): bigiLib.bigiMod.bigi = js.native
  def fromByteArrayUnsigned(): js.Array[scala.Double] = js.native
  def fromByteArrayUnsigned(byteArray: js.Any): js.Array[scala.Double] = js.native
  def fromDERInteger(): scala.Double = js.native
  def fromDERInteger(byteArray: js.Any): scala.Double = js.native
  def fromHex(hex: java.lang.String): bigiLib.bigiMod.bigi = js.native
  def isBigInteger(obj: js.Any, check_ver: js.Any): /* is bigi.bigi.bigi */ scala.Boolean = js.native
  def valueOf(i: js.Any): bigiLib.bigiMod.bigi = js.native
}

