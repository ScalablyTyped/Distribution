package typings.blueprintjsCore.mod

import typings.blueprintjsCore.textAreaMod.TextAreaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "TextArea")
@js.native
open class TextArea protected ()
  extends typings.blueprintjsCore.componentsMod.TextArea {
  def this(props: TextAreaProps) = this()
  def this(props: TextAreaProps, context: Any) = this()
}
/* static members */
object TextArea {
  
  @JSImport("@blueprintjs/core", "TextArea")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "TextArea.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
