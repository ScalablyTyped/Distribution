package typings.cbor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibSharedValueEncoderMod {
  
  /**
    * Implement value sharing.
    *
    * @see {@link cbor.schmorp.de/value-sharing}
    */
  @JSImport("cbor/types/lib/sharedValueEncoder", JSImport.Namespace)
  @js.native
  open class ^ protected () extends SharedValueEncoder {
    def this(opts: Any) = this()
  }
  
  /**
    * Implement value sharing.
    *
    * @see {@link cbor.schmorp.de/value-sharing}
    */
  @js.native
  trait SharedValueEncoder
    extends typings.cbor.typesLibEncoderMod.^ {
    
    /**
      * Remove the existing recording and start over.  Do this between encoding
      * pairs.
      */
    def clearRecording(): Unit = js.native
    
    /**
      * Between encoding runs, stop recording, and start outputing correct tags.
      */
    def stopRecording(): Unit = js.native
    
    var valueSharing: typings.cbor.typesLibObjectRecorderMod.^ = js.native
  }
}
