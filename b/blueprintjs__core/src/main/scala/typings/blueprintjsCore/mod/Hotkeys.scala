package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.TabIndex
import typings.blueprintjsCore.hotkeysTypesMod.IHotkeysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Hotkeys")
@js.native
open class Hotkeys protected ()
  extends typings.blueprintjsCore.componentsMod.Hotkeys {
  def this(props: IHotkeysProps) = this()
  def this(props: IHotkeysProps, context: Any) = this()
}
/* static members */
object Hotkeys {
  
  @JSImport("@blueprintjs/core", "Hotkeys")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Hotkeys.defaultProps")
  @js.native
  def defaultProps: TabIndex = js.native
  inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Hotkeys.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
