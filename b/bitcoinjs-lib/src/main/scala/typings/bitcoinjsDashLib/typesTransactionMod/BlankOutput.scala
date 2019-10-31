package typings.bitcoinjsDashLib.typesTransactionMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlankOutput extends OpenOutput {
  var script: Buffer
  var valueBuffer: Buffer
}

object BlankOutput {
  @scala.inline
  def apply(script: Buffer, valueBuffer: Buffer): BlankOutput = {
    val __obj = js.Dynamic.literal(script = script, valueBuffer = valueBuffer)
  
    __obj.asInstanceOf[BlankOutput]
  }
}

