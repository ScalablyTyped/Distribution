package typings.awsSdkHashNode

import typings.awsSdkHashNode.awsSdkHashNodeStrings.ascii
import typings.awsSdkHashNode.awsSdkHashNodeStrings.latin1
import typings.awsSdkHashNode.awsSdkHashNodeStrings.utf8
import typings.awsSdkTypes.distTypesChecksumMod.Checksum
import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/hash-node", "Hash")
  @js.native
  open class Hash protected ()
    extends StObject
       with Checksum {
    def this(algorithmIdentifier: String) = this()
    def this(algorithmIdentifier: String, secret: SourceData) = this()
    
    /* private */ val algorithmIdentifier: Any = js.native
    
    /**
      * Returns the digest of all of the data passed.
      */
    /* CompleteClass */
    override def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ var hash: Any = js.native
    
    /**
      * Resets the checksum to its initial value.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ val secret: Any = js.native
    
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
    def update(toHash: SourceData): Unit = js.native
    def update(toHash: SourceData, encoding: utf8 | ascii | latin1): Unit = js.native
  }
}
