package typings.atAwsDashSdkTypes.buildCryptoMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.ascii
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.latin1
import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.utf8
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

