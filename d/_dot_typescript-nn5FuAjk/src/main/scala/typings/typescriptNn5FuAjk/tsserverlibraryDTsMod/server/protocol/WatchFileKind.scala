package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WatchFileKind & String] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchFileKind
  /* "DynamicPriorityPolling" */ val DynamicPriorityPolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchFileKind.DynamicPriorityPolling & String = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchFileKind
  /* "FixedChunkSizePolling" */ val FixedChunkSizePolling: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchFileKind.FixedChunkSizePolling & String = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchFileKind
  /* "FixedPollingInterval" */ val FixedPollingInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchFileKind.FixedPollingInterval & String = js.native
  
  @js.native
  sealed trait PriorityPollingInterval
    extends StObject
       with WatchFileKind
  /* "PriorityPollingInterval" */ val PriorityPollingInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchFileKind.PriorityPollingInterval & String = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchFileKind
  /* "UseFsEvents" */ val UseFsEvents: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchFileKind.UseFsEvents & String = js.native
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory
    extends StObject
       with WatchFileKind
  /* "UseFsEventsOnParentDirectory" */ val UseFsEventsOnParentDirectory: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.WatchFileKind.UseFsEventsOnParentDirectory & String = js.native
}
