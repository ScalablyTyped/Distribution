package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentSubSystem extends js.Object
@JSImport("azdata", "AgentSubSystem")
@js.native
object AgentSubSystem extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentSubSystem with Double] = js.native
  
  @js.native
  sealed trait ActiveScripting extends AgentSubSystem
  /* 2 */ @js.native
  object ActiveScripting extends TopLevel[ActiveScripting with Double]
  
  @js.native
  sealed trait AnalysisCommands extends AgentSubSystem
  /* 10 */ @js.native
  object AnalysisCommands extends TopLevel[AnalysisCommands with Double]
  
  @js.native
  sealed trait AnalysisQuery extends AgentSubSystem
  /* 9 */ @js.native
  object AnalysisQuery extends TopLevel[AnalysisQuery with Double]
  
  @js.native
  sealed trait CmdExec extends AgentSubSystem
  /* 3 */ @js.native
  object CmdExec extends TopLevel[CmdExec with Double]
  
  @js.native
  sealed trait Distribution extends AgentSubSystem
  /* 6 */ @js.native
  object Distribution extends TopLevel[Distribution with Double]
  
  @js.native
  sealed trait LogReader extends AgentSubSystem
  /* 5 */ @js.native
  object LogReader extends TopLevel[LogReader with Double]
  
  @js.native
  sealed trait Merge extends AgentSubSystem
  /* 7 */ @js.native
  object Merge extends TopLevel[Merge with Double]
  
  @js.native
  sealed trait PowerShell extends AgentSubSystem
  /* 12 */ @js.native
  object PowerShell extends TopLevel[PowerShell with Double]
  
  @js.native
  sealed trait QueueReader extends AgentSubSystem
  /* 8 */ @js.native
  object QueueReader extends TopLevel[QueueReader with Double]
  
  @js.native
  sealed trait Snapshot extends AgentSubSystem
  /* 4 */ @js.native
  object Snapshot extends TopLevel[Snapshot with Double]
  
  @js.native
  sealed trait Ssis extends AgentSubSystem
  /* 11 */ @js.native
  object Ssis extends TopLevel[Ssis with Double]
  
  @js.native
  sealed trait TransactSql extends AgentSubSystem
  /* 1 */ @js.native
  object TransactSql extends TopLevel[TransactSql with Double]
}
