package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HotkeyScope extends js.Object

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysEvents", "HotkeyScope")
@js.native
object HotkeyScope extends js.Object {
  @js.native
  sealed trait GLOBAL
    extends atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope
  
  @js.native
  sealed trait LOCAL
    extends atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope
  
  /* "global" */ val GLOBAL: GLOBAL with java.lang.String = js.native
  /* "local" */ val LOCAL: LOCAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysEventsMod.HotkeyScope with java.lang.String
  ] = js.native
}

