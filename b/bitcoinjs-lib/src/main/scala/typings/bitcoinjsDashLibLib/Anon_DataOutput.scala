package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataOutput extends js.Object {
  var data: js.Array[nodeLib.Buffer]
  var output: nodeLib.Buffer
}

object Anon_DataOutput {
  @scala.inline
  def apply(data: js.Array[nodeLib.Buffer], output: nodeLib.Buffer): Anon_DataOutput = {
    val __obj = js.Dynamic.literal(data = data, output = output)
  
    __obj.asInstanceOf[Anon_DataOutput]
  }
}

