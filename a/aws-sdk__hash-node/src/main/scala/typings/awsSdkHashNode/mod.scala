package typings.awsSdkHashNode

import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/hash-node", "Hash")
  @js.native
  open class Hash protected ()
    extends StObject
       with typings.awsSdkTypes.cryptoMod.Hash {
    def this(algorithmIdentifier: String) = this()
    def this(algorithmIdentifier: String, secret: SourceData) = this()
    
    /* private */ val hash: Any = js.native
  }
}
