package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParentChildType with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  /* 1 */ @js.native
  object NotChild extends TopLevel[NotChild with Double]
  
  /* 3 */ @js.native
  object NotChildNotParent extends TopLevel[NotChildNotParent with Double]
  
  /* 4 */ @js.native
  object Parent extends TopLevel[Parent with Double]
  
}

