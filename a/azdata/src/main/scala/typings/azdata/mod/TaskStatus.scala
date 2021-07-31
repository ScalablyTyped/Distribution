package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskStatus extends StObject
@JSImport("azdata", "TaskStatus")
@js.native
object TaskStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus & Double] = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with TaskStatus
  /* 5 */ val Canceled: typings.azdata.mod.TaskStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait Canceling
    extends StObject
       with TaskStatus
  /* 6 */ val Canceling: typings.azdata.mod.TaskStatus.Canceling & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with TaskStatus
  /* 4 */ val Failed: typings.azdata.mod.TaskStatus.Failed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with TaskStatus
  /* 1 */ val InProgress: typings.azdata.mod.TaskStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait NotStarted
    extends StObject
       with TaskStatus
  /* 0 */ val NotStarted: typings.azdata.mod.TaskStatus.NotStarted & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with TaskStatus
  /* 2 */ val Succeeded: typings.azdata.mod.TaskStatus.Succeeded & Double = js.native
  
  @js.native
  sealed trait SucceededWithWarning
    extends StObject
       with TaskStatus
  /* 3 */ val SucceededWithWarning: typings.azdata.mod.TaskStatus.SucceededWithWarning & Double = js.native
}
