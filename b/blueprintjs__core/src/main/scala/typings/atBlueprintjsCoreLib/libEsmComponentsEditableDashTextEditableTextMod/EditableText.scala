package typings
package atBlueprintjsCoreLib.libEsmComponentsEditableDashTextEditableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
@js.native
class EditableText ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[IEditableTextProps, IEditableTextState] {
  def this(props: IEditableTextProps) = this()
  def this(props: IEditableTextProps, context: js.Any) = this()
  var handleFocus: js.Any = js.native
  var handleKeyEvent: js.Any = js.native
  var handleTextChange: js.Any = js.native
  var refHandlers: js.Any = js.native
  var valueElement: js.Any = js.native
  def cancelEditing(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MEditableText(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEditableText(`_`: IEditableTextProps, prevState: IEditableTextState): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MEditableText(nextProps: IEditableTextProps): scala.Unit = js.native
  /* private */ def maybeRenderInput(value: js.Any): js.Any = js.native
  def toggleEditing(): scala.Unit = js.native
  /* private */ def updateInputDimensions(): js.Any = js.native
}

@JSImport("@blueprintjs/core/lib/esm/components/editable-text/editableText", "EditableText")
@js.native
object EditableText extends js.Object {
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsEditableDashTextEditableTextMod.IEditableTextProps = js.native
  var displayName: java.lang.String = js.native
}

