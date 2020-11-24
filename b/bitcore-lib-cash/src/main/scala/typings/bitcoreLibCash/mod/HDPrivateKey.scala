package typings.bitcoreLibCash.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "HDPrivateKey")
@js.native
class HDPrivateKey () extends js.Object {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  
  def derive(arg: String): HDPrivateKey = js.native
  def derive(arg: String, hardened: Boolean): HDPrivateKey = js.native
  def derive(arg: Double): HDPrivateKey = js.native
  def derive(arg: Double, hardened: Boolean): HDPrivateKey = js.native
  
  def deriveChild(arg: String): HDPrivateKey = js.native
  def deriveChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
  def deriveChild(arg: Double): HDPrivateKey = js.native
  def deriveChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
  
  def deriveNonCompliantChild(arg: String): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: Double): HDPrivateKey = js.native
  def deriveNonCompliantChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
  
  val hdPublicKey: HDPublicKey = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
}
