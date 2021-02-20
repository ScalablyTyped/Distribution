package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.TabIndex
import typings.blueprintjsCore.hotkeysTypesMod.IHotkeysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys")
@js.native
class Hotkeys protected ()
  extends typings.blueprintjsCore.hotkeysMod.Hotkeys {
  def this(props: IHotkeysProps) = this()
  def this(props: IHotkeysProps, context: js.Any) = this()
}
/* static members */
object Hotkeys {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys.defaultProps")
  @js.native
  def defaultProps: TabIndex = js.native
  @scala.inline
  def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
