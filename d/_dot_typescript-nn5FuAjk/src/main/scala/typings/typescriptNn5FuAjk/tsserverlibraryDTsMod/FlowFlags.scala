package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowFlags extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "FlowFlags")
@js.native
object FlowFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowFlags & Double] = js.native
  
  @js.native
  sealed trait ArrayMutation
    extends StObject
       with FlowFlags
  /* 256 */ val ArrayMutation: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.ArrayMutation & Double = js.native
  
  @js.native
  sealed trait Assignment
    extends StObject
       with FlowFlags
  /* 16 */ val Assignment: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Assignment & Double = js.native
  
  @js.native
  sealed trait BranchLabel
    extends StObject
       with FlowFlags
  /* 4 */ val BranchLabel: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.BranchLabel & Double = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with FlowFlags
  /* 512 */ val Call: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Call & Double = js.native
  
  @js.native
  sealed trait Condition
    extends StObject
       with FlowFlags
  /* 96 */ val Condition: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Condition & Double = js.native
  
  @js.native
  sealed trait FalseCondition
    extends StObject
       with FlowFlags
  /* 64 */ val FalseCondition: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.FalseCondition & Double = js.native
  
  @js.native
  sealed trait Label
    extends StObject
       with FlowFlags
  /* 12 */ val Label: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Label & Double = js.native
  
  @js.native
  sealed trait LoopLabel
    extends StObject
       with FlowFlags
  /* 8 */ val LoopLabel: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.LoopLabel & Double = js.native
  
  @js.native
  sealed trait ReduceLabel
    extends StObject
       with FlowFlags
  /* 1024 */ val ReduceLabel: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.ReduceLabel & Double = js.native
  
  @js.native
  sealed trait Referenced
    extends StObject
       with FlowFlags
  /* 2048 */ val Referenced: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Referenced & Double = js.native
  
  @js.native
  sealed trait Shared
    extends StObject
       with FlowFlags
  /* 4096 */ val Shared: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Shared & Double = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with FlowFlags
  /* 2 */ val Start: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Start & Double = js.native
  
  @js.native
  sealed trait SwitchClause
    extends StObject
       with FlowFlags
  /* 128 */ val SwitchClause: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.SwitchClause & Double = js.native
  
  @js.native
  sealed trait TrueCondition
    extends StObject
       with FlowFlags
  /* 32 */ val TrueCondition: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.TrueCondition & Double = js.native
  
  @js.native
  sealed trait Unreachable
    extends StObject
       with FlowFlags
  /* 1 */ val Unreachable: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FlowFlags.Unreachable & Double = js.native
}
