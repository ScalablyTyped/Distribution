package typings.awsSdkTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkTypes.awsSdkTypesStrings.ascii
import typings.awsSdkTypes.awsSdkTypesStrings.latin1
import typings.awsSdkTypes.awsSdkTypesStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @js.native
  trait Hash extends StObject {
    
    /**
      * Finalizes the hash and provides a promise that will be fulfilled with the
      * raw bytes of the calculated hash.
      */
    def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Adds a chunk of data to the hash. If a buffer is provided, the `encoding`
      * argument will be ignored. If a string is provided without a specified
      * encoding, implementations must assume UTF-8 encoding.
      *
      * Not all encodings are supported on all platforms, though all must support
      * UTF-8.
      */
    def update(toHash: SourceData): Unit = js.native
    def update(toHash: SourceData, encoding: utf8 | ascii | latin1): Unit = js.native
  }
  
  @js.native
  trait HashConstructor
    extends StObject
       with Instantiable0[Hash]
       with Instantiable1[/* secret */ SourceData, Hash]
  
  type SourceData = String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  type StreamHasher[StreamType] = js.Function2[
    /* hashCtor */ HashConstructor, 
    /* stream */ StreamType, 
    js.Promise[js.typedarray.Uint8Array]
  ]
  
  type randomValues = js.Function1[/* byteLength */ Double, js.Promise[js.typedarray.Uint8Array]]
}
