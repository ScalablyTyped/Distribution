package typings.bitcoinjsDashLib.typesTransactionMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends OpenOutput {
  var script: Buffer
  var value: Double
}

object Output {
  @scala.inline
  def apply(script: Buffer, value: Double): Output = {
    val __obj = js.Dynamic.literal(script = script, value = value)
  
    __obj.asInstanceOf[Output]
  }
}

