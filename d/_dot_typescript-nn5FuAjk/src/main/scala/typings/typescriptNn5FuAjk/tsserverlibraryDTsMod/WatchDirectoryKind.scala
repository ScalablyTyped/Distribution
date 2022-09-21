package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchDirectoryKind
  /* 2 */ val DynamicPriorityPolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchDirectoryKind.DynamicPriorityPolling & Double = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchDirectoryKind
  /* 3 */ val FixedChunkSizePolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchDirectoryKind.FixedChunkSizePolling & Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchDirectoryKind
  /* 1 */ val FixedPollingInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchDirectoryKind.FixedPollingInterval & Double = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchDirectoryKind
  /* 0 */ val UseFsEvents: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchDirectoryKind.UseFsEvents & Double = js.native
}
