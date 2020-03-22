package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentSubSystem extends js.Object

@JSImport("azdata", "AgentSubSystem")
@js.native
object AgentSubSystem extends js.Object {
  @js.native
  sealed trait ActiveScripting extends AgentSubSystem
  
  @js.native
  sealed trait AnalysisCommands extends AgentSubSystem
  
  @js.native
  sealed trait AnalysisQuery extends AgentSubSystem
  
  @js.native
  sealed trait CmdExec extends AgentSubSystem
  
  @js.native
  sealed trait Distribution extends AgentSubSystem
  
  @js.native
  sealed trait LogReader extends AgentSubSystem
  
  @js.native
  sealed trait Merge extends AgentSubSystem
  
  @js.native
  sealed trait PowerShell extends AgentSubSystem
  
  @js.native
  sealed trait QueueReader extends AgentSubSystem
  
  @js.native
  sealed trait Snapshot extends AgentSubSystem
  
  @js.native
  sealed trait Ssis extends AgentSubSystem
  
  @js.native
  sealed trait TransactSql extends AgentSubSystem
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentSubSystem with Double] = js.native
  /* 2 */ @js.native
  object ActiveScripting extends TopLevel[ActiveScripting with Double]
  
  /* 10 */ @js.native
  object AnalysisCommands extends TopLevel[AnalysisCommands with Double]
  
  /* 9 */ @js.native
  object AnalysisQuery extends TopLevel[AnalysisQuery with Double]
  
  /* 3 */ @js.native
  object CmdExec extends TopLevel[CmdExec with Double]
  
  /* 6 */ @js.native
  object Distribution extends TopLevel[Distribution with Double]
  
  /* 5 */ @js.native
  object LogReader extends TopLevel[LogReader with Double]
  
  /* 7 */ @js.native
  object Merge extends TopLevel[Merge with Double]
  
  /* 12 */ @js.native
  object PowerShell extends TopLevel[PowerShell with Double]
  
  /* 8 */ @js.native
  object QueueReader extends TopLevel[QueueReader with Double]
  
  /* 4 */ @js.native
  object Snapshot extends TopLevel[Snapshot with Double]
  
  /* 11 */ @js.native
  object Ssis extends TopLevel[Ssis with Double]
  
  /* 1 */ @js.native
  object TransactSql extends TopLevel[TransactSql with Double]
  
}

