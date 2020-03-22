package typings.awsSdkTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkTypes.awsSdkTypesStrings.ascii
import typings.awsSdkTypes.awsSdkTypesStrings.latin1
import typings.awsSdkTypes.awsSdkTypesStrings.utf8
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/types/build/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  @js.native
  trait Hash extends js.Object {
    /**
      * Finalizes the hash and provides a promise that will be fulfilled with the
      * raw bytes of the calculated hash.
      */
    def digest(): js.Promise[Uint8Array] = js.native
    /**
      * Adds a chunk of data to the hash. If a buffer is provided, the `encoding`
      * argument will be ignored. If a string is provided without a specified
      * encoding, implementations must assume UTF-8 encoding.
      *
      * Not all encodings are supported on all platforms, though all must support
      * UTF-8.
      */
    def update(toHash: SourceData): Unit = js.native
    @JSName("update")
    def update_ascii(toHash: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(toHash: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(toHash: SourceData, encoding: utf8): Unit = js.native
  }
  
  @js.native
  trait HashConstructor
    extends Instantiable0[Hash]
       with Instantiable1[/* secret */ SourceData, Hash]
  
  type SourceData = String | ArrayBuffer | ArrayBufferView
  type StreamHasher[StreamType] = js.Function2[/* hashCtor */ AnonInstantiable, /* stream */ StreamType, js.Promise[Uint8Array]]
  type randomValues = js.Function1[/* byteLength */ Double, js.Promise[Uint8Array]]
}

