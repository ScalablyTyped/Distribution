package typings.bigi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bigi", JSImport.Namespace)
@js.native
class ^ protected () extends bigi {
  def this(a: js.Any, b: js.Any, c: js.Any) = this()
}
@JSImport("bigi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def fromBuffer(buffer: js.Any): bigi = js.native
  
  def fromByteArrayUnsigned(): js.Array[Double] = js.native
  def fromByteArrayUnsigned(byteArray: js.Any): js.Array[Double] = js.native
  
  def fromDERInteger(): Double = js.native
  def fromDERInteger(byteArray: js.Any): Double = js.native
  
  def fromHex(hex: String): bigi = js.native
  
  def isBigInteger(obj: js.Any, check_ver: js.Any): /* is bigi.bigi.bigi */ Boolean = js.native
  
  def valueOf(i: js.Any): bigi = js.native
}
