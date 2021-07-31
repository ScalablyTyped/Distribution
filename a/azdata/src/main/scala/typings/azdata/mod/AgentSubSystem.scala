package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentSubSystem extends StObject
@JSImport("azdata", "AgentSubSystem")
@js.native
object AgentSubSystem extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentSubSystem & Double] = js.native
  
  @js.native
  sealed trait ActiveScripting
    extends StObject
       with AgentSubSystem
  /* 2 */ val ActiveScripting: typings.azdata.mod.AgentSubSystem.ActiveScripting & Double = js.native
  
  @js.native
  sealed trait AnalysisCommands
    extends StObject
       with AgentSubSystem
  /* 10 */ val AnalysisCommands: typings.azdata.mod.AgentSubSystem.AnalysisCommands & Double = js.native
  
  @js.native
  sealed trait AnalysisQuery
    extends StObject
       with AgentSubSystem
  /* 9 */ val AnalysisQuery: typings.azdata.mod.AgentSubSystem.AnalysisQuery & Double = js.native
  
  @js.native
  sealed trait CmdExec
    extends StObject
       with AgentSubSystem
  /* 3 */ val CmdExec: typings.azdata.mod.AgentSubSystem.CmdExec & Double = js.native
  
  @js.native
  sealed trait Distribution
    extends StObject
       with AgentSubSystem
  /* 6 */ val Distribution: typings.azdata.mod.AgentSubSystem.Distribution & Double = js.native
  
  @js.native
  sealed trait LogReader
    extends StObject
       with AgentSubSystem
  /* 5 */ val LogReader: typings.azdata.mod.AgentSubSystem.LogReader & Double = js.native
  
  @js.native
  sealed trait Merge
    extends StObject
       with AgentSubSystem
  /* 7 */ val Merge: typings.azdata.mod.AgentSubSystem.Merge & Double = js.native
  
  @js.native
  sealed trait PowerShell
    extends StObject
       with AgentSubSystem
  /* 12 */ val PowerShell: typings.azdata.mod.AgentSubSystem.PowerShell & Double = js.native
  
  @js.native
  sealed trait QueueReader
    extends StObject
       with AgentSubSystem
  /* 8 */ val QueueReader: typings.azdata.mod.AgentSubSystem.QueueReader & Double = js.native
  
  @js.native
  sealed trait Snapshot
    extends StObject
       with AgentSubSystem
  /* 4 */ val Snapshot: typings.azdata.mod.AgentSubSystem.Snapshot & Double = js.native
  
  @js.native
  sealed trait Ssis
    extends StObject
       with AgentSubSystem
  /* 11 */ val Ssis: typings.azdata.mod.AgentSubSystem.Ssis & Double = js.native
  
  @js.native
  sealed trait TransactSql
    extends StObject
       with AgentSubSystem
  /* 1 */ val TransactSql: typings.azdata.mod.AgentSubSystem.TransactSql & Double = js.native
}
