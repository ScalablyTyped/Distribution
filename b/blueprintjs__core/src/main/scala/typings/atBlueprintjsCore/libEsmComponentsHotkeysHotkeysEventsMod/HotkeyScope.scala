package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HotkeyScope extends js.Object

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeyScope")
@js.native
object HotkeyScope extends js.Object {
  @js.native
  sealed trait GLOBAL extends HotkeyScope
  
  @js.native
  sealed trait LOCAL extends HotkeyScope
  
  /* "global" */ val GLOBAL: typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope.GLOBAL with String = js.native
  /* "local" */ val LOCAL: typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope.LOCAL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HotkeyScope with String] = js.native
}

