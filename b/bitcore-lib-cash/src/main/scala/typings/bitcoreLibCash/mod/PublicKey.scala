package typings.bitcoreLibCash.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "PublicKey")
@js.native
open class PublicKey protected () extends StObject {
  def this(source: String) = this()
  
  def toBuffer(): Buffer = js.native
  
  def toDER(): Buffer = js.native
}
/* static members */
object PublicKey {
  
  @JSImport("bitcore-lib-cash", "PublicKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPrivateKey(privateKey: PrivateKey): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
}
