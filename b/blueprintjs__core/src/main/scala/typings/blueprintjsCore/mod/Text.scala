package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.PartialITextProps
import typings.blueprintjsCore.textMod.ITextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Text")
@js.native
class Text protected ()
  extends typings.blueprintjsCore.componentsMod.Text {
  def this(props: ITextProps) = this()
  def this(props: ITextProps, context: js.Any) = this()
}
/* static members */
object Text {
  
  @JSImport("@blueprintjs/core", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Text.defaultProps")
  @js.native
  def defaultProps: PartialITextProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialITextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Text.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
