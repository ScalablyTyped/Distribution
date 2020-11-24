package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskStatus extends js.Object
@JSImport("azdata", "TaskStatus")
@js.native
object TaskStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends TaskStatus
  /* 5 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait Canceling extends TaskStatus
  /* 6 */ @js.native
  object Canceling extends TopLevel[Canceling with Double]
  
  @js.native
  sealed trait Failed extends TaskStatus
  /* 4 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait InProgress extends TaskStatus
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait NotStarted extends TaskStatus
  /* 0 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  @js.native
  sealed trait Succeeded extends TaskStatus
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  @js.native
  sealed trait SucceededWithWarning extends TaskStatus
  /* 3 */ @js.native
  object SucceededWithWarning extends TopLevel[SucceededWithWarning with Double]
}
