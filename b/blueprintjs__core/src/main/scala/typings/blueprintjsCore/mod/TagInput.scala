package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.PartialITagInputProps
import typings.blueprintjsCore.anon.PartialITagInputState
import typings.blueprintjsCore.anon.ReadonlyITagInputProps
import typings.blueprintjsCore.anon.ReadonlyITagInputState
import typings.blueprintjsCore.tagInputMod.ITagInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "TagInput")
@js.native
class TagInput protected ()
  extends typings.blueprintjsCore.componentsMod.TagInput {
  def this(props: ITagInputProps) = this()
  def this(props: ITagInputProps, context: js.Any) = this()
}
/* static members */
object TagInput {
  
  @JSImport("@blueprintjs/core", "TagInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "TagInput.defaultProps")
  @js.native
  def defaultProps: PartialITagInputProps = js.native
  inline def defaultProps_=(x: PartialITagInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "TagInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: ReadonlyITagInputProps, state: ReadonlyITagInputState): PartialITagInputState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialITagInputState | Null]
}
