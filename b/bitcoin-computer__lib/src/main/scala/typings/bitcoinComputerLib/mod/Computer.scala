package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.bitcoinComputerLib.anon.Constructor
import typings.bitcoinComputerLib.anon.Hex
import typings.bitcoinComputerLib.anon.Mod
import typings.bitcoinComputerLib.anon.PartialSelectUtxos
import typings.bitcoinComputerLib.anon.PartialTransitionJSON
import typings.std.ConstructorParameters
import typings.std.InstanceType
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bitcoin-computer/lib", "Computer")
@js.native
open class Computer ()
  extends StObject
     with Instantiable1[/* constructor */ Class, js.Promise[InstanceType[Class] & Location]]
     with Instantiable2[
      /* constructor */ Class, 
      /* args */ ConstructorParameters[Class], 
      js.Promise[InstanceType[Class] & Location]
    ]
     with Instantiable3[
      /* constructor */ Class, 
      (/* args */ ConstructorParameters[Class]) | (/* args */ Unit), 
      /* mod */ String, 
      js.Promise[InstanceType[Class] & Location]
    ] {
  def this(params: ComputerOptions) = this()
  
  def broadcast(tx: Any): js.Promise[String] = js.native
  
  def decode(transaction: Any): js.Promise[TransitionJSON] = js.native
  
  def encode(param0: PartialTransitionJSON): js.Promise[Any] = js.native
  
  def encodeCall[T /* <: Class */, K /* <: /* keyof std.InstanceType<T> */ String */](param0: Mod[T, K]): js.Promise[Any] = js.native
  
  def encodeNew[T /* <: Class */](param0: Constructor[T]): js.Promise[Any] = js.native
  
  def `export`(module: String): js.Promise[String] = js.native
  
  def fund(tx: Any): js.Promise[Unit] = js.native
  def fund(tx: Any, selectUtxos: PartialSelectUtxos): js.Promise[Unit] = js.native
  
  def getAddress(): String = js.native
  
  def getBalance(): js.Promise[Double] = js.native
  
  def getChain(): String = js.native
  
  def getLatestRev(id: String): js.Promise[String] = js.native
  
  def getLatestRevs(ids: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  def getMnemonic(): String = js.native
  
  def getNetwork(): String = js.native
  
  def getOwnedRevs(): js.Promise[js.Array[String]] = js.native
  def getOwnedRevs(publicKey: Any): js.Promise[js.Array[String]] = js.native
  
  def getPassphrase(): String = js.native
  
  def getPrivateKey(): String = js.native
  
  def getPublicKey(): String = js.native
  
  def getRevs(): js.Promise[js.Array[String]] = js.native
  def getRevs(publicKey: Any): js.Promise[js.Array[String]] = js.native
  
  def getUtxos(): js.Promise[js.Array[String]] = js.native
  def getUtxos(tx: Any): js.Promise[js.Array[String]] = js.native
  
  def idsToRevs(ids: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  def `import`(rev: String): js.Promise[Any] = js.native
  
  def query[T /* <: Class */](q: Partial[UserQuery[T]]): js.Promise[js.Array[String]] = js.native
  
  def queryRevs(q: Query): js.Promise[js.Array[String]] = js.native
  
  def read(rev: String): js.Promise[Any] = js.native
  
  def rpcCall(method: String, params: String): js.Promise[Any] = js.native
  
  def send(amount: Double, address: String): js.Promise[String] = js.native
  
  def sign(tx: Any): Unit = js.native
  
  def sync(rev: String): js.Promise[Any] = js.native
  
  def txFromHex(param0: Hex): js.Promise[Tx] = js.native
  
  def txFromJSON(param0: typings.bitcoinComputerLib.anon.Json): js.Promise[Tx] = js.native
  
  var wallet: Wallet = js.native
  
  def write(exp: String, env: Record[String, String], mod: String): js.Promise[Any] = js.native
}
object Computer {
  
  @JSImport("@bitcoin-computer/lib", "Computer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getExp(constructor: Class): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExp")(constructor.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getExp(constructor: Class, argString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExp")(constructor.asInstanceOf[js.Any], argString.asInstanceOf[js.Any])).asInstanceOf[String]
}
