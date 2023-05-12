package typings.awsSdkSha256TreeHash

import typings.awsSdkTypes.distTypesChecksumMod.Checksum
import typings.awsSdkTypes.distTypesChecksumMod.ChecksumConstructor
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/sha256-tree-hash", "TreeHash")
  @js.native
  open class TreeHash protected ()
    extends StObject
       with Checksum {
    /**
      * Initializes a TreeHash.
      * @param Sha256 A Sha256 hash constructor.
      */
    def this(Sha256: ChecksumConstructor, fromUtf8: Decoder) = this()
    def this(Sha256: HashConstructor, fromUtf8: Decoder) = this()
    
    /* private */ val Sha256: Any = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var collectedHashDigests: Any = js.native
    
    /**
      * Converts source data into a Uint8Array.
      * @param data Data to convert to a Uint8Array.
      */
    /* private */ var convertToBuffer: Any = js.native
    
    /**
      * Returns the digest of all of the data passed.
      */
    /* CompleteClass */
    override def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ val fromUtf8: Any = js.native
    
    /**
      * Generates Sha256 hashes from 1 MiB chunks of the
      * internal buffer.
      * Will set the internal buffer to any bytes remaining
      * that is less than 1 MiB.
      */
    /* private */ var hashBuffer: Any = js.native
    
    /**
      * Resets the checksum to its initial value.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * Adds a chunk of data for which checksum needs to be computed.
      * This can be called many times with new data as it is streamed.
      *
      * Implementations may override this method which passes second param
      * which makes Checksum object stateless.
      *
      * @param chunk - The buffer to update checksum with.
      */
    /* CompleteClass */
    override def update(chunk: js.typedarray.Uint8Array): Unit = js.native
    /**
      * Updates the tree hash with byte data.
      * @param data Byte data to apply to the tree hash.
      */
    def update(data: SourceData): Unit = js.native
  }
}
