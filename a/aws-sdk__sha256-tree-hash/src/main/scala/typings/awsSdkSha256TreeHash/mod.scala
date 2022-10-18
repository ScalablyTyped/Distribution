package typings.awsSdkSha256TreeHash

import typings.awsSdkTypes.distTypesCryptoMod.Hash
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/sha256-tree-hash", "TreeHash")
  @js.native
  open class TreeHash protected ()
    extends StObject
       with Hash {
    /**
      * Initializes a TreeHash.
      * @param Sha256 A Sha256 hash constructor.
      */
    def this(Sha256: HashConstructor, fromUtf8: Decoder) = this()
    
    /* private */ val Sha256: Any = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var collectedHashDigests: Any = js.native
    
    /**
      * Converts source data into a Uint8Array.
      * @param data Data to convert to a Uint8Array.
      */
    /* private */ var convertToBuffer: Any = js.native
    
    /* private */ val fromUtf8: Any = js.native
    
    /**
      * Generates Sha256 hashes from 1 MiB chunks of the
      * internal buffer.
      * Will set the internal buffer to any bytes remaining
      * that is less than 1 MiB.
      */
    /* private */ var hashBuffer: Any = js.native
  }
}
