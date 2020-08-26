package typings.baseui.textareaMod

import typings.baseui.inputMod.BaseInputProps
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaProps extends BaseInputProps[HTMLTextAreaElement]

object TextareaProps {
  @scala.inline
  def apply(): TextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaProps]
  }
}

