package typings.awsSdkHashStreamNode

import typings.awsSdkTypes.cryptoMod.Hash
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/hash-stream-node/build/hash-calculator", JSImport.Namespace)
@js.native
object hashCalculatorMod extends js.Object {
  @js.native
  class HashCalculator protected () extends Writable {
    def this(hash: Hash) = this()
    def this(hash: Hash, options: WritableOptions) = this()
    val hash: Hash = js.native
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
  
}

