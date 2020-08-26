package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyFrame extends Node {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.native
  /** The list of "selectors" of the keyframe rule, split on commas. Each “selector” is trimmed from whitespace. */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object KeyFrame {
  @scala.inline
  def apply(): KeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrame]
  }
  @scala.inline
  implicit class KeyFrameOps[Self <: KeyFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarations(value: js.Array[Declaration | Comment]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

