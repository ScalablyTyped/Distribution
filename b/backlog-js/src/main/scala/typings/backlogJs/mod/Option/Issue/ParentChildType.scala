package typings.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParentChildType extends js.Object
@JSImport("backlog-js", "Option.Issue.ParentChildType")
@js.native
object ParentChildType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParentChildType with Double] = js.native
  
  @js.native
  sealed trait All extends ParentChildType
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Child extends ParentChildType
  /* 2 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  @js.native
  sealed trait NotChild extends ParentChildType
  /* 1 */ @js.native
  object NotChild extends TopLevel[NotChild with Double]
  
  @js.native
  sealed trait NotChildNotParent extends ParentChildType
  /* 3 */ @js.native
  object NotChildNotParent extends TopLevel[NotChildNotParent with Double]
  
  @js.native
  sealed trait Parent extends ParentChildType
  /* 4 */ @js.native
  object Parent extends TopLevel[Parent with Double]
}
