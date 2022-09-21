package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "ScriptKind")
@js.native
object ScriptKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind & Double] = js.native
  
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with ScriptKind
  /* 7 */ val Deferred: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.Deferred & Double = js.native
  
  @js.native
  sealed trait External
    extends StObject
       with ScriptKind
  /* 5 */ val External: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.External & Double = js.native
  
  @js.native
  sealed trait JS
    extends StObject
       with ScriptKind
  /* 1 */ val JS: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.JS & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with ScriptKind
  /* 6 */ val JSON: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.JSON & Double = js.native
  
  @js.native
  sealed trait JSX
    extends StObject
       with ScriptKind
  /* 2 */ val JSX: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.JSX & Double = js.native
  
  @js.native
  sealed trait TS
    extends StObject
       with ScriptKind
  /* 3 */ val TS: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.TS & Double = js.native
  
  @js.native
  sealed trait TSX
    extends StObject
       with ScriptKind
  /* 4 */ val TSX: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.TSX & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ScriptKind
  /* 0 */ val Unknown: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.Unknown & Double = js.native
}
