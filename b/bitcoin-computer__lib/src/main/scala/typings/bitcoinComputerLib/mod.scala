package typings.bitcoinComputerLib

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.ConstructorParameters
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@bitcoin-computer/lib", "Computer")
  @js.native
  open class Computer ()
    extends StObject
       with Instantiable1[
          (/* constructorOrExport */ Class) | (/* constructorOrExport */ String), 
          js.Promise[InstanceType[Class]]
        ]
       with Instantiable2[
          (/* constructorOrExport */ Class) | (/* constructorOrExport */ String), 
          /* args */ ConstructorParameters[Class], 
          js.Promise[InstanceType[Class]]
        ]
       with Instantiable3[
          (/* constructorOrExport */ Class) | (/* constructorOrExport */ String), 
          (/* args */ ConstructorParameters[Class]) | (/* args */ Unit), 
          /* moduleSpecifier */ String, 
          js.Promise[InstanceType[Class]]
        ] {
    def this(params: Any) = this()
    
    def broadcast(txHex: String): js.Promise[String] = js.native
    
    var db: Any = js.native
    
    def deploy(module: String): js.Promise[String] = js.native
    
    def getAddress(): String = js.native
    
    def getBalance(): js.Promise[Double] = js.native
    
    def getChain(): String = js.native
    
    def getLatestRev(id: String): js.Promise[String] = js.native
    
    def getLatestRevs(ids: js.Array[String]): js.Promise[js.Array[String]] = js.native
    
    def getMnemonic(): String = js.native
    
    def getNetwork(): String = js.native
    
    def getOwnedRevs(): js.Promise[js.Array[String]] = js.native
    def getOwnedRevs(publicKey: Any): js.Promise[js.Array[String]] = js.native
    
    def getPrivateKey(): String = js.native
    
    def getPublicKey(): String = js.native
    
    def getRevs(): js.Promise[js.Array[String]] = js.native
    def getRevs(publicKey: Any): js.Promise[js.Array[String]] = js.native
    
    def getUtxos(): js.Promise[js.Array[Any]] = js.native
    
    def idsToRevs(ids: js.Array[String]): js.Promise[js.Array[String]] = js.native
    
    def `import`(name: String, rev: String): js.Promise[Class] = js.native
    
    def query(hasPublicKeyContract: Any): js.Promise[js.Array[String]] = js.native
    
    def queryRevs(q: Any): js.Promise[js.Array[String]] = js.native
    
    def rpcCall(method: String, params: String): js.Promise[Any] = js.native
    
    def sync(outId: String): js.Promise[InstanceType[Any]] = js.native
  }
  
  type Class = Instantiable1[/* args */ Any, Any]
}
