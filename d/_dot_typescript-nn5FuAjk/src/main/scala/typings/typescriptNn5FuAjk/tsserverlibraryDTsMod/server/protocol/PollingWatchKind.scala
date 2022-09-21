package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PollingWatchKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.PollingWatchKind")
@js.native
object PollingWatchKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PollingWatchKind & String] = js.native
  
  @js.native
  sealed trait DynamicPriority
    extends StObject
       with PollingWatchKind
  /* "DynamicPriority" */ val DynamicPriority: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.PollingWatchKind.DynamicPriority & String = js.native
  
  @js.native
  sealed trait FixedChunkSize
    extends StObject
       with PollingWatchKind
  /* "FixedChunkSize" */ val FixedChunkSize: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.PollingWatchKind.FixedChunkSize & String = js.native
  
  @js.native
  sealed trait FixedInterval
    extends StObject
       with PollingWatchKind
  /* "FixedInterval" */ val FixedInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.PollingWatchKind.FixedInterval & String = js.native
  
  @js.native
  sealed trait PriorityInterval
    extends StObject
       with PollingWatchKind
  /* "PriorityInterval" */ val PriorityInterval: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.PollingWatchKind.PriorityInterval & String = js.native
}
