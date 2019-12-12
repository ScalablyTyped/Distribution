package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod

import org.scalablytyped.runtime.TopLevel
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope.GLOBAL
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope.LOCAL
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HotkeyScope with String] = js.native
  /* "global" */ @js.native
  object GLOBAL extends TopLevel[GLOBAL with String]
  
  /* "local" */ @js.native
  object LOCAL extends TopLevel[LOCAL with String]
  
}

