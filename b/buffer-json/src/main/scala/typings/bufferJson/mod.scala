package typings.bufferJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(text: String): js.Any = js.native
  def replacer(key: String, value: String): js.Any = js.native
  def reviver(key: String, value: js.Any): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, space: String): String = js.native
  def stringify(value: js.Any, space: Double): String = js.native
}

