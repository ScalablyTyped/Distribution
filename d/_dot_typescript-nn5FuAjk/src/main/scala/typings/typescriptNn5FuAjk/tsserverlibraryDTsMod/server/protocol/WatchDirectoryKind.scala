package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WatchDirectoryKind & String] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchDirectoryKind
  /* "DynamicPriorityPolling" */ val DynamicPriorityPolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchDirectoryKind.DynamicPriorityPolling & String = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchDirectoryKind
  /* "FixedChunkSizePolling" */ val FixedChunkSizePolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchDirectoryKind.FixedChunkSizePolling & String = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchDirectoryKind
  /* "FixedPollingInterval" */ val FixedPollingInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchDirectoryKind.FixedPollingInterval & String = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchDirectoryKind
  /* "UseFsEvents" */ val UseFsEvents: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchDirectoryKind.UseFsEvents & String = js.native
}
