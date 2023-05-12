package typings.awsSdkHashStreamNode

import typings.awsSdkTypes.distTypesChecksumMod.Checksum
import typings.awsSdkTypes.distTypesCryptoMod.Hash
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHashCalculatorMod {
  
  @JSImport("@aws-sdk/hash-stream-node/dist-types/HashCalculator", "HashCalculator")
  @js.native
  open class HashCalculator protected () extends Writable {
    def this(hash: Checksum) = this()
    def this(hash: Hash) = this()
    def this(hash: Checksum, options: WritableOptions) = this()
    def this(hash: Hash, options: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val hash: Checksum | Hash = js.native
  }
}
