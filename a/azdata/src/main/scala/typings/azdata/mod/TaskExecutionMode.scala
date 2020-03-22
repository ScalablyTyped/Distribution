package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskExecutionMode extends js.Object

@JSImport("azdata", "TaskExecutionMode")
@js.native
object TaskExecutionMode extends js.Object {
  @js.native
  sealed trait execute extends TaskExecutionMode
  
  @js.native
  sealed trait executeAndScript extends TaskExecutionMode
  
  @js.native
  sealed trait script extends TaskExecutionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskExecutionMode with Double] = js.native
  /* 0 */ @js.native
  object execute extends TopLevel[execute with Double]
  
  /* 2 */ @js.native
  object executeAndScript extends TopLevel[executeAndScript with Double]
  
  /* 1 */ @js.native
  object script extends TopLevel[script with Double]
  
}

