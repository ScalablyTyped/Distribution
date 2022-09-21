package typings.blueprintjsCore.mod

import typings.blueprintjsCore.editableTextMod.EditableTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "EditableText")
@js.native
open class EditableText protected ()
  extends typings.blueprintjsCore.componentsMod.EditableText {
  def this(props: EditableTextProps) = this()
  def this(props: EditableTextProps, context: Any) = this()
}
/* static members */
object EditableText {
  
  @JSImport("@blueprintjs/core", "EditableText")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "EditableText.defaultProps")
  @js.native
  def defaultProps: EditableTextProps = js.native
  inline def defaultProps_=(x: EditableTextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "EditableText.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
