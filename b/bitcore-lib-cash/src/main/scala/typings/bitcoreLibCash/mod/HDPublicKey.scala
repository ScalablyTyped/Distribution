package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "HDPublicKey")
@js.native
open class HDPublicKey protected () extends StObject {
  def this(arg: String) = this()
  def this(arg: js.Object) = this()
  def this(arg: Buffer) = this()
  
  val depth: Double = js.native
  
  def derive(arg: String): HDPublicKey = js.native
  def derive(arg: String, hardened: Boolean): HDPublicKey = js.native
  def derive(arg: Double): HDPublicKey = js.native
  def derive(arg: Double, hardened: Boolean): HDPublicKey = js.native
  
  def deriveChild(arg: String): HDPublicKey = js.native
  def deriveChild(arg: String, hardened: Boolean): HDPublicKey = js.native
  def deriveChild(arg: Double): HDPublicKey = js.native
  def deriveChild(arg: Double, hardened: Boolean): HDPublicKey = js.native
  
  val fingerPrint: Buffer = js.native
  
  val network: Network = js.native
  
  val publicKey: PublicKey = js.native
  
  val xpubkey: Buffer = js.native
}
