package typings.backlogJs.mod.Option.User

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoleType extends js.Object
@JSImport("backlog-js", "Option.User.RoleType")
@js.native
object RoleType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
  
  @js.native
  sealed trait Admin extends RoleType
  /* 1 */ @js.native
  object Admin extends TopLevel[Admin with Double]
  
  @js.native
  sealed trait GuestReporter extends RoleType
  /* 5 */ @js.native
  object GuestReporter extends TopLevel[GuestReporter with Double]
  
  @js.native
  sealed trait GuestViewer extends RoleType
  /* 6 */ @js.native
  object GuestViewer extends TopLevel[GuestViewer with Double]
  
  @js.native
  sealed trait Reporter extends RoleType
  /* 3 */ @js.native
  object Reporter extends TopLevel[Reporter with Double]
  
  @js.native
  sealed trait User extends RoleType
  /* 2 */ @js.native
  object User
    extends TopLevel[typings.backlogJs.mod.Option.User.RoleType.User with Double]
  
  @js.native
  sealed trait Viewer extends RoleType
  /* 4 */ @js.native
  object Viewer extends TopLevel[Viewer with Double]
}
