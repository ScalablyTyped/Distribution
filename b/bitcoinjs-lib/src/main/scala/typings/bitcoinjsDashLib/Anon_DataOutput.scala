package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataOutput extends js.Object {
  var data: js.Array[Buffer]
  var output: Buffer
}

object Anon_DataOutput {
  @scala.inline
  def apply(data: js.Array[Buffer], output: Buffer): Anon_DataOutput = {
    val __obj = js.Dynamic.literal(data = data, output = output)
  
    __obj.asInstanceOf[Anon_DataOutput]
  }
}

