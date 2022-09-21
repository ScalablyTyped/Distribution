package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowFlags extends StObject
@JSGlobal("ts.FlowFlags")
@js.native
object FlowFlags extends StObject {
  
  @js.native
  sealed trait ArrayMutation
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Assignment
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait BranchLabel
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Call
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Condition
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait FalseCondition
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Label
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait LoopLabel
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait ReduceLabel
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Referenced
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Shared
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Start
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait SwitchClause
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait TrueCondition
    extends StObject
       with FlowFlags
  
  @js.native
  sealed trait Unreachable
    extends StObject
       with FlowFlags
}
