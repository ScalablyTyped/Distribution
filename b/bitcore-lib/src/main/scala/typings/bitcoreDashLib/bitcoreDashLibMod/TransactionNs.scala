package typings.bitcoreDashLib.bitcoreDashLibMod

import typings.bitcoreDashLib.bitcoreDashLibMod.TransactionNs.Output
import typings.bitcoreDashLib.bitcoreDashLibMod.TransactionNs.UnspentOutput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Transaction")
@js.native
object TransactionNs extends js.Object {
  @js.native
  class Input () extends js.Object {
    val output: js.UndefOr[Output] = js.native
    val outputIndex: Double = js.native
    val prevTxId: Buffer = js.native
    val script: Script = js.native
    val sequenceNumber: Double = js.native
  }
  
  @js.native
  class Output protected () extends js.Object {
    def this(data: js.Object) = this()
    val satoshis: Double = js.native
    val script: Script = js.native
    def inspect(): String = js.native
    def setScript(script: String): this.type = js.native
    def setScript(script: Script): this.type = js.native
    def setScript(script: Buffer): this.type = js.native
    def toObject(): js.Object = js.native
  }
  
  @js.native
  class UnspentOutput protected () extends js.Object {
    def this(data: js.Object) = this()
    val address: Address = js.native
    val outputIndex: Double = js.native
    val satoshis: Double = js.native
    val script: Script = js.native
    val txId: String = js.native
    def inspect(): String = js.native
    def toObject(): this.type = js.native
  }
  
  /* static members */
  @js.native
  object UnspentOutput extends js.Object {
    def fromObject(o: js.Object): UnspentOutput = js.native
  }
  
}

