package typings.awsSdkMd5Js

import typings.awsSdkTypes.distTypesChecksumMod.Checksum
import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/md5-js", "Md5")
  @js.native
  open class Md5 ()
    extends StObject
       with Checksum {
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var bufferLength: Any = js.native
    
    /* private */ var bytesHashed: Any = js.native
    
    /**
      * Returns the digest of all of the data passed.
      */
    /* CompleteClass */
    override def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /* private */ var finished: Any = js.native
    
    /* private */ var hashBuffer: Any = js.native
    
    /**
      * Resets the checksum to its initial value.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ var state: Any = js.native
    
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
    def update(sourceData: SourceData): Unit = js.native
  }
}
