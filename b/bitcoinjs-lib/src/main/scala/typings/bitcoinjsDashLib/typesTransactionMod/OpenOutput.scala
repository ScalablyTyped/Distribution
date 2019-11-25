package typings.bitcoinjsDashLib.typesTransactionMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bitcoinjsDashLib.typesTransactionMod.Output
  - typings.bitcoinjsDashLib.typesTransactionMod.BlankOutput
*/
trait OpenOutput extends js.Object

object OpenOutput {
  @scala.inline
  def Output(script: Buffer, value: Double): OpenOutput = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenOutput]
  }
  @scala.inline
  def BlankOutput(script: Buffer, valueBuffer: Buffer): OpenOutput = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], valueBuffer = valueBuffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenOutput]
  }
}

