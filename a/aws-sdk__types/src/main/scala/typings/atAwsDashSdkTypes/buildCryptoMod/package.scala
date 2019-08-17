package typings.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildCryptoMod {
  import typings.atAwsDashSdkTypes.Anon_Hash
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView
  import typings.std.Uint8Array

  type SourceData = String | ArrayBuffer | ArrayBufferView
  type StreamHasher[StreamType] = js.Function2[/* hashCtor */ Anon_Hash, /* stream */ StreamType, js.Promise[Uint8Array]]
  type randomValues = js.Function1[/* byteLength */ Double, js.Promise[Uint8Array]]
}
