package typings.awsSdkHashStreamNode

import typings.awsSdkTypes.cryptoMod.Hash
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashCalculatorMod {
  
  @JSImport("@aws-sdk/hash-stream-node/dist/cjs/hash-calculator", "HashCalculator")
  @js.native
  class HashCalculator protected () extends Writable {
    def this(hash: Hash) = this()
    def this(hash: Hash, options: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    val hash: Hash = js.native
  }
}
