package typings.backlogDashJs.backlogDashJsMod.Option.User

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleType extends js.Object

@JSImport("backlog-js", "Option.User.RoleType")
@js.native
object RoleType extends js.Object {
  @js.native
  sealed trait Admin extends RoleType
  
  @js.native
  sealed trait GuestReporter extends RoleType
  
  @js.native
  sealed trait GuestViewer extends RoleType
  
  @js.native
  sealed trait Reporter extends RoleType
  
  @js.native
  sealed trait User extends RoleType
  
  @js.native
  sealed trait Viewer extends RoleType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
  /* 1 */ @js.native
  object Admin extends TopLevel[Admin with Double]
  
  /* 5 */ @js.native
  object GuestReporter extends TopLevel[GuestReporter with Double]
  
  /* 6 */ @js.native
  object GuestViewer extends TopLevel[GuestViewer with Double]
  
  /* 3 */ @js.native
  object Reporter extends TopLevel[Reporter with Double]
  
  /* 2 */ @js.native
  object User
    extends TopLevel[typings.backlogDashJs.backlogDashJsMod.Option.User.RoleType.User with Double]
  
  /* 4 */ @js.native
  object Viewer extends TopLevel[Viewer with Double]
  
}

