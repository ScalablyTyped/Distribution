package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoJoinPolicy extends js.Object

@JSGlobal("chrome.cast.AutoJoinPolicy")
@js.native
object AutoJoinPolicy extends js.Object {
  @js.native
  sealed trait CUSTOM_CONTROLLER_SCOPED extends AutoJoinPolicy
  
  @js.native
  sealed trait ORIGIN_SCOPED extends AutoJoinPolicy
  
  @js.native
  sealed trait PAGE_SCOPED extends AutoJoinPolicy
  
  @js.native
  sealed trait TAB_AND_ORIGIN_SCOPED extends AutoJoinPolicy
  
}

