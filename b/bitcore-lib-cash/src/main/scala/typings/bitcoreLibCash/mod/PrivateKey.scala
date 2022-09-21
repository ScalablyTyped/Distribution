package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "PrivateKey")
@js.native
open class PrivateKey () extends StObject {
  def this(key: String) = this()
  def this(key: String, network: String) = this()
  def this(key: String, network: Network) = this()
  def this(key: scala.Unit, network: String) = this()
  def this(key: scala.Unit, network: Network) = this()
  
  def getValidationError(data: Any): Null | js.Error = js.native
  def getValidationError(data: Any, network: String): Null | js.Error = js.native
  def getValidationError(data: Any, network: Network): Null | js.Error = js.native
  
  def inspect(): String = js.native
  
  def isValid(data: Any): Boolean = js.native
  def isValid(data: Any, network: String): Boolean = js.native
  def isValid(data: Any, network: Network): Boolean = js.native
  
  val network: Network = js.native
  
  val publicKey: PublicKey = js.native
  
  def toAddress(): Address = js.native
  def toAddress(network: String): Address = js.native
  def toAddress(network: Network): Address = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
  
  def toPublicKey(): PublicKey = js.native
  
  def toWIF(): String = js.native
}
/* static members */
object PrivateKey {
  
  @JSImport("bitcore-lib-cash", "PrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObject(obj: js.Object): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  
  inline def fromRandom(): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")().asInstanceOf[PrivateKey]
  inline def fromRandom(network: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(network.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  inline def fromRandom(network: Network): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(network.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  
  inline def fromString(str: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  
  inline def fromWIF(str: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWIF")(str.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
}
