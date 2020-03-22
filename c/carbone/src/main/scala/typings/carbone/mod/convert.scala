package typings.carbone.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbone", "convert")
@js.native
object convert extends js.Object {
  def apply(data: Buffer, convertTo: String, callback: ConvertCallback): Unit = js.native
  def apply(data: Buffer, convertTo: String, options: js.Object, callback: ConvertCallback): Unit = js.native
}

