package typings.blueprintjsCore.mod

import typings.blueprintjsCore.tagInputMod.ITagInputProps
import typings.blueprintjsCore.tagInputMod.ITagInputState
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "TagInput")
@js.native
class TagInput ()
  extends typings.blueprintjsCore.componentsMod.TagInput

/* static members */
@JSImport("@blueprintjs/core", "TagInput")
@js.native
object TagInput extends js.Object {
  var defaultProps: Partial[ITagInputProps] with js.Object = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: ITagInputProps, state: ITagInputState): Partial[ITagInputState] | Null = js.native
}

