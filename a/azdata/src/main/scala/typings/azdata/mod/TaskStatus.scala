package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskStatus extends StObject
@JSImport("azdata", "TaskStatus")
@js.native
object TaskStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends TaskStatus
  /* 5 */ val Canceled: typings.azdata.mod.TaskStatus.Canceled with Double = js.native
  
  @js.native
  sealed trait Canceling extends TaskStatus
  /* 6 */ val Canceling: typings.azdata.mod.TaskStatus.Canceling with Double = js.native
  
  @js.native
  sealed trait Failed extends TaskStatus
  /* 4 */ val Failed: typings.azdata.mod.TaskStatus.Failed with Double = js.native
  
  @js.native
  sealed trait InProgress extends TaskStatus
  /* 1 */ val InProgress: typings.azdata.mod.TaskStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait NotStarted extends TaskStatus
  /* 0 */ val NotStarted: typings.azdata.mod.TaskStatus.NotStarted with Double = js.native
  
  @js.native
  sealed trait Succeeded extends TaskStatus
  /* 2 */ val Succeeded: typings.azdata.mod.TaskStatus.Succeeded with Double = js.native
  
  @js.native
  sealed trait SucceededWithWarning extends TaskStatus
  /* 3 */ val SucceededWithWarning: typings.azdata.mod.TaskStatus.SucceededWithWarning with Double = js.native
}
