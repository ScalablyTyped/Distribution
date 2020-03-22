package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskStatus extends js.Object

@JSImport("azdata", "TaskStatus")
@js.native
object TaskStatus extends js.Object {
  @js.native
  sealed trait Canceled extends TaskStatus
  
  @js.native
  sealed trait Canceling extends TaskStatus
  
  @js.native
  sealed trait Failed extends TaskStatus
  
  @js.native
  sealed trait InProgress extends TaskStatus
  
  @js.native
  sealed trait NotStarted extends TaskStatus
  
  @js.native
  sealed trait Succeeded extends TaskStatus
  
  @js.native
  sealed trait SucceededWithWarning extends TaskStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
  /* 5 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 6 */ @js.native
  object Canceling extends TopLevel[Canceling with Double]
  
  /* 4 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 3 */ @js.native
  object SucceededWithWarning extends TopLevel[SucceededWithWarning with Double]
  
}

