package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchFileKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchFileKind
  /* 2 */ val DynamicPriorityPolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchFileKind.DynamicPriorityPolling & Double = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchFileKind
  /* 3 */ val FixedChunkSizePolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchFileKind.FixedChunkSizePolling & Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchFileKind
  /* 0 */ val FixedPollingInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchFileKind.FixedPollingInterval & Double = js.native
  
  @js.native
  sealed trait PriorityPollingInterval
    extends StObject
       with WatchFileKind
  /* 1 */ val PriorityPollingInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchFileKind.PriorityPollingInterval & Double = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchFileKind
  /* 4 */ val UseFsEvents: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchFileKind.UseFsEvents & Double = js.native
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory
    extends StObject
       with WatchFileKind
  /* 5 */ val UseFsEventsOnParentDirectory: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchFileKind.UseFsEventsOnParentDirectory & Double = js.native
}
