package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderCodeCursor extends js.Object {
  var _lines: js.Any
  var lineIndex: Double
  def canRead: Boolean
  def currentLine: String
  def lines(value: js.Array[String]): js.Any
}

object ShaderCodeCursor {
  @scala.inline
  def apply(
    _lines: js.Any,
    canRead: () => Boolean,
    currentLine: () => String,
    lineIndex: Double,
    lines: js.Array[String] => js.Any
  ): ShaderCodeCursor = {
    val __obj = js.Dynamic.literal(_lines = _lines.asInstanceOf[js.Any], canRead = js.Any.fromFunction0(canRead), currentLine = js.Any.fromFunction0(currentLine), lineIndex = lineIndex.asInstanceOf[js.Any], lines = js.Any.fromFunction1(lines))
    __obj.asInstanceOf[ShaderCodeCursor]
  }
}

