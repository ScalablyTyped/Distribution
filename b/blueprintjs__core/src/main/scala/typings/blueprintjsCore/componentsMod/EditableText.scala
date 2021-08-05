package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.editableTextMod.IEditableTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "EditableText")
@js.native
class EditableText protected ()
  extends typings.blueprintjsCore.editableTextMod.EditableText {
  def this(props: IEditableTextProps) = this()
  def this(props: IEditableTextProps, context: js.Any) = this()
}
/* static members */
object EditableText {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "EditableText")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "EditableText.defaultProps")
  @js.native
  def defaultProps: IEditableTextProps = js.native
  inline def defaultProps_=(x: IEditableTextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "EditableText.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
