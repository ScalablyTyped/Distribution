package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskExecutionMode extends StObject
@JSImport("azdata", "TaskExecutionMode")
@js.native
object TaskExecutionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskExecutionMode with Double] = js.native
  
  @js.native
  sealed trait execute extends TaskExecutionMode
  /* 0 */ val execute: typings.azdata.mod.TaskExecutionMode.execute with Double = js.native
  
  @js.native
  sealed trait executeAndScript extends TaskExecutionMode
  /* 2 */ val executeAndScript: typings.azdata.mod.TaskExecutionMode.executeAndScript with Double = js.native
  
  @js.native
  sealed trait script extends TaskExecutionMode
  /* 1 */ val script: typings.azdata.mod.TaskExecutionMode.script with Double = js.native
}
