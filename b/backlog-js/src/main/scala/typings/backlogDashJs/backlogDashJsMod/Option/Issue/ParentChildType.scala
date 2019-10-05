package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParentChildType extends js.Object

@JSImport("backlog-js", "Option.Issue.ParentChildType")
@js.native
object ParentChildType extends js.Object {
  @js.native
  sealed trait All extends ParentChildType
  
  @js.native
  sealed trait Child extends ParentChildType
  
  @js.native
  sealed trait NotChild extends ParentChildType
  
  @js.native
  sealed trait NotChildNotParent extends ParentChildType
  
  @js.native
  sealed trait Parent extends ParentChildType
  
  /* 0 */ val All: typings.backlogDashJs.backlogDashJsMod.Option.Issue.ParentChildType.All with Double = js.native
  /* 2 */ val Child: typings.backlogDashJs.backlogDashJsMod.Option.Issue.ParentChildType.Child with Double = js.native
  /* 1 */ val NotChild: typings.backlogDashJs.backlogDashJsMod.Option.Issue.ParentChildType.NotChild with Double = js.native
  /* 3 */ val NotChildNotParent: typings.backlogDashJs.backlogDashJsMod.Option.Issue.ParentChildType.NotChildNotParent with Double = js.native
  /* 4 */ val Parent: typings.backlogDashJs.backlogDashJsMod.Option.Issue.ParentChildType.Parent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParentChildType with Double] = js.native
}

