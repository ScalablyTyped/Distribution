package typings.awsSdkHashNode

import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/hash-node", "Hash")
  @js.native
  open class Hash protected ()
    extends StObject
       with typings.awsSdkTypes.distTypesCryptoMod.Hash {
    def this(algorithmIdentifier: String) = this()
    def this(algorithmIdentifier: String, secret: SourceData) = this()
    
    /* private */ val hash: Any = js.native
  }
}
