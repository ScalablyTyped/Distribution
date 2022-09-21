package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferencePriority extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "InferencePriority")
@js.native
object InferencePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferencePriority & Double] = js.native
  
  @js.native
  sealed trait AlwaysStrict
    extends StObject
       with InferencePriority
  /* 1024 */ val AlwaysStrict: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.AlwaysStrict & Double = js.native
  
  @js.native
  sealed trait Circularity
    extends StObject
       with InferencePriority
  /* -1 */ val Circularity: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.Circularity & Double = js.native
  
  @js.native
  sealed trait ContravariantConditional
    extends StObject
       with InferencePriority
  /* 64 */ val ContravariantConditional: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.ContravariantConditional & Double = js.native
  
  @js.native
  sealed trait HomomorphicMappedType
    extends StObject
       with InferencePriority
  /* 8 */ val HomomorphicMappedType: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.HomomorphicMappedType & Double = js.native
  
  @js.native
  sealed trait LiteralKeyof
    extends StObject
       with InferencePriority
  /* 256 */ val LiteralKeyof: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.LiteralKeyof & Double = js.native
  
  @js.native
  sealed trait MappedTypeConstraint
    extends StObject
       with InferencePriority
  /* 32 */ val MappedTypeConstraint: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.MappedTypeConstraint & Double = js.native
  
  @js.native
  sealed trait MaxValue
    extends StObject
       with InferencePriority
  /* 2048 */ val MaxValue: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.MaxValue & Double = js.native
  
  @js.native
  sealed trait NakedTypeVariable
    extends StObject
       with InferencePriority
  /* 1 */ val NakedTypeVariable: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.NakedTypeVariable & Double = js.native
  
  @js.native
  sealed trait NoConstraints
    extends StObject
       with InferencePriority
  /* 512 */ val NoConstraints: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.NoConstraints & Double = js.native
  
  @js.native
  sealed trait PartialHomomorphicMappedType
    extends StObject
       with InferencePriority
  /* 16 */ val PartialHomomorphicMappedType: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.PartialHomomorphicMappedType & Double = js.native
  
  @js.native
  sealed trait PriorityImpliesCombination
    extends StObject
       with InferencePriority
  /* 416 */ val PriorityImpliesCombination: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.PriorityImpliesCombination & Double = js.native
  
  @js.native
  sealed trait ReturnType
    extends StObject
       with InferencePriority
  /* 128 */ val ReturnType: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.ReturnType & Double = js.native
  
  @js.native
  sealed trait SpeculativeTuple
    extends StObject
       with InferencePriority
  /* 2 */ val SpeculativeTuple: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.SpeculativeTuple & Double = js.native
  
  @js.native
  sealed trait SubstituteSource
    extends StObject
       with InferencePriority
  /* 4 */ val SubstituteSource: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InferencePriority.SubstituteSource & Double = js.native
}
