package typings.awsSdkTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChecksumMod {
  
  trait Checksum extends StObject {
    
    /**
      * Creates a new checksum object that contains a deep copy of the internal
      * state of the current `Checksum` object.
      */
    var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /**
      * Returns the digest of all of the data passed.
      */
    def digest(): js.Promise[js.typedarray.Uint8Array]
    
    /**
      * Constant length of the digest created by the algorithm in bytes.
      */
    var digestLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows marking a checksum for checksums that support the ability
      * to mark and reset.
      *
      * @param readLimit - The maximum limit of bytes that can be read
      *   before the mark position becomes invalid.
      */
    var mark: js.UndefOr[js.Function1[/* readLimit */ Double, Unit]] = js.undefined
    
    /**
      * Resets the checksum to its initial value.
      */
    def reset(): Unit
    
    /**
      * Adds a chunk of data for which checksum needs to be computed.
      * This can be called many times with new data as it is streamed.
      *
      * Implementations may override this method which passes second param
      * which makes Checksum object stateless.
      *
      * @param chunk - The buffer to update checksum with.
      */
    def update(chunk: js.typedarray.Uint8Array): Unit
  }
  object Checksum {
    
    inline def apply(
      digest: () => js.Promise[js.typedarray.Uint8Array],
      reset: () => Unit,
      update: js.typedarray.Uint8Array => Unit
    ): Checksum = {
      val __obj = js.Dynamic.literal(digest = js.Any.fromFunction0(digest), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Checksum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Checksum] (val x: Self) extends AnyVal {
      
      inline def setCopy(value: () => Checksum): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setDigest(value: () => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      inline def setDigestLength(value: Double): Self = StObject.set(x, "digestLength", value.asInstanceOf[js.Any])
      
      inline def setDigestLengthUndefined: Self = StObject.set(x, "digestLength", js.undefined)
      
      inline def setMark(value: /* readLimit */ Double => Unit): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ChecksumConstructor
    extends StObject
       with Instantiable0[Checksum]
       with Instantiable1[/* secret */ SourceData, Checksum]
}
