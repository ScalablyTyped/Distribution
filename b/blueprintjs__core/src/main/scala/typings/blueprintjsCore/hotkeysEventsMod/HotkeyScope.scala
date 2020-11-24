package typings.blueprintjsCore.hotkeysEventsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HotkeyScope extends js.Object
@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeyScope")
@js.native
object HotkeyScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HotkeyScope with String] = js.native
  
  @js.native
  sealed trait GLOBAL extends HotkeyScope
  /* "global" */ @js.native
  object GLOBAL extends TopLevel[GLOBAL with String]
  
  @js.native
  sealed trait LOCAL extends HotkeyScope
  /* "local" */ @js.native
  object LOCAL extends TopLevel[LOCAL with String]
}
