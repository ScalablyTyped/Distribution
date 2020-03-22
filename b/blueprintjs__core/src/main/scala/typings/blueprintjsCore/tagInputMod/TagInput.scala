package typings.blueprintjsCore.tagInputMod

import typings.blueprintjsCore.PartialITagInputProps
import typings.blueprintjsCore.PartialITagInputState
import typings.blueprintjsCore.ReadonlyITagInputProps
import typings.blueprintjsCore.ReadonlyITagInputState
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput")
@js.native
class TagInput ()
  extends AbstractPureComponent2[ITagInputProps, ITagInputState, js.Object] {
  var addTags: js.Any = js.native
  var findNextIndex: js.Any = js.native
  var getNextActiveIndex: js.Any = js.native
  /**
    * Splits inputValue on separator prop,
    * trims whitespace from each new value,
    * and ignores empty values.
    */
  var getValues: js.Any = js.native
  var handleBackspaceToRemove: js.Any = js.native
  var handleContainerBlur: js.Any = js.native
  var handleContainerClick: js.Any = js.native
  var handleInputChange: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleInputKeyDown: js.Any = js.native
  var handleInputKeyUp: js.Any = js.native
  var handleInputPaste: js.Any = js.native
  var handleRemoveTag: js.Any = js.native
  var inputElement: js.Any = js.native
  var invokeKeyPressCallback: js.Any = js.native
  /** Returns whether the given index represents a valid item in `this.props.values`. */
  var isValidIndex: js.Any = js.native
  var maybeRenderTag: js.Any = js.native
  var refHandlers: js.Any = js.native
  /** Remove the item at the given index by invoking `onRemove` and `onChange` accordingly. */
  var removeIndexFromValues: js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tag-input/tagInput", "TagInput")
@js.native
object TagInput extends js.Object {
  var defaultProps: PartialITagInputProps with js.Object = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: ReadonlyITagInputProps, state: ReadonlyITagInputState): PartialITagInputState | Null = js.native
}

