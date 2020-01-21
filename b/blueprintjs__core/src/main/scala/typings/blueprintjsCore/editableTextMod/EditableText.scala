package typings.blueprintjsCore.editableTextMod

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
@js.native
class EditableText ()
  extends AbstractPureComponent2[IEditableTextProps, IEditableTextState, js.Object] {
  def this(props: IEditableTextProps) = this()
  def this(props: IEditableTextProps, context: js.Any) = this()
  var handleFocus: js.Any = js.native
  var handleKeyEvent: js.Any = js.native
  var handleTextChange: js.Any = js.native
  var inputElement: js.UndefOr[js.Any] = js.native
  var refHandlers: js.Any = js.native
  var renderInput: js.Any = js.native
  var updateInputDimensions: js.Any = js.native
  var valueElement: js.Any = js.native
  def cancelEditing(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MEditableText(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEditableText(prevProps: IEditableTextProps, prevState: IEditableTextState): Unit = js.native
  def toggleEditing(): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
@js.native
object EditableText extends js.Object {
  var defaultProps: IEditableTextProps = js.native
  var displayName: String = js.native
}

