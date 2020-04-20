package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bookmark2 extends js.Object {
  var collapsed: Boolean
  var end: js.Array[Double]
  var endOffset: Double
  var is2: Boolean
  var normalized: Boolean
  var start: js.Array[Double]
  var startOffset: Double
}

object bookmark2 {
  @scala.inline
  def apply(
    collapsed: Boolean,
    end: js.Array[Double],
    endOffset: Double,
    is2: Boolean,
    normalized: Boolean,
    start: js.Array[Double],
    startOffset: Double
  ): bookmark2 = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], is2 = is2.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[bookmark2]
  }
}

