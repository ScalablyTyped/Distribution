package typings.browserfs.distNodeCoreFileUnderscoreFlagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionType extends js.Object

@JSImport("browserfs/dist/node/core/file_flag", "ActionType")
@js.native
object ActionType extends js.Object {
  @js.native
  sealed trait CREATE_FILE extends ActionType
  
  @js.native
  sealed trait NOP extends ActionType
  
  @js.native
  sealed trait THROW_EXCEPTION extends ActionType
  
  @js.native
  sealed trait TRUNCATE_FILE extends ActionType
  
  /* 3 */ val CREATE_FILE: typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.CREATE_FILE with Double = js.native
  /* 0 */ val NOP: typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.NOP with Double = js.native
  /* 1 */ val THROW_EXCEPTION: typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.THROW_EXCEPTION with Double = js.native
  /* 2 */ val TRUNCATE_FILE: typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.TRUNCATE_FILE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActionType with Double] = js.native
}

