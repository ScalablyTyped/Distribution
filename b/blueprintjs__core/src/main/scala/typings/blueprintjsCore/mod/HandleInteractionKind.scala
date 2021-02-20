package typings.blueprintjsCore.mod

import typings.blueprintjsCore.blueprintjsCoreStrings.lock
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HandleInteractionKind {
  
  @JSImport("@blueprintjs/core", "HandleInteractionKind")
  @js.native
  val ^ : js.Any = js.native
  
  /** Locked handles prevent other handles from being dragged past then. */
  @JSImport("@blueprintjs/core", "HandleInteractionKind.LOCK")
  @js.native
  def LOCK: lock = js.native
  @scala.inline
  def LOCK_=(x: lock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK")(x.asInstanceOf[js.Any])
  
  /**
    * Handles marked "none" are not interactive and do not appear in the UI.
    * They serve only to break the track into subsections that can be colored separately.
    */
  @JSImport("@blueprintjs/core", "HandleInteractionKind.NONE")
  @js.native
  def NONE: none = js.native
  @scala.inline
  def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  /** Push handles move overlapping handles with them as they are dragged. */
  @JSImport("@blueprintjs/core", "HandleInteractionKind.PUSH")
  @js.native
  def PUSH: push = js.native
  @scala.inline
  def PUSH_=(x: push): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUSH")(x.asInstanceOf[js.Any])
}
