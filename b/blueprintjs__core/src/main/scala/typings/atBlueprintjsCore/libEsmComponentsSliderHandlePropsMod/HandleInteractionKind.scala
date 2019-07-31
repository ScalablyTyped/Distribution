package typings.atBlueprintjsCore.libEsmComponentsSliderHandlePropsMod

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.lock
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.none
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.lock
  - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.push
  - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.none
*/
trait HandleInteractionKind extends js.Object

@JSImport("@blueprintjs/core/lib/esm/components/slider/handleProps", "HandleInteractionKind")
@js.native
object HandleInteractionKind extends js.Object {
  /** Locked handles prevent other handles from being dragged past then. */
  var LOCK: lock = js.native
  /**
    * Handles marked "none" are not interactive and do not appear in the UI.
    * They serve only to break the track into subsections that can be colored separately.
    */
  var NONE: none = js.native
  /** Push handles move overlapping handles with them as they are dragged. */
  var PUSH: push = js.native
}

