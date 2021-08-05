package typings.awsSdkSha256TreeHash

import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.utilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/sha256-tree-hash", "TreeHash")
  @js.native
  class TreeHash protected ()
    extends StObject
       with Hash {
    /**
      * Initializes a TreeHash.
      * @param Sha256 A Sha256 hash constructor.
      */
    def this(Sha256: HashConstructor, fromUtf8: Decoder) = this()
    
    /* private */ val Sha256: js.Any = js.native
    
    /* private */ var buffer: js.Any = js.native
    
    /* private */ var collectedHashDigests: js.Any = js.native
    
    /**
      * Converts source data into a Uint8Array.
      * @param data Data to convert to a Uint8Array.
      */
    /* private */ var convertToBuffer: js.Any = js.native
    
    /* private */ val fromUtf8: js.Any = js.native
    
    /**
      * Generates Sha256 hashes from 1 MiB chunks of the
      * internal buffer.
      * Will set the internal buffer to any bytes remaining
      * that is less than 1 MiB.
      */
    /* private */ var hashBuffer: js.Any = js.native
  }
}
