package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PollingWatchKind extends StObject
@JSImport(".typescript-nn5FuAjk", "PollingWatchKind")
@js.native
object PollingWatchKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PollingWatchKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriority
    extends StObject
       with PollingWatchKind
  /* 2 */ val DynamicPriority: typings.typescriptNn5FuAjk.mod.PollingWatchKind.DynamicPriority & Double = js.native
  
  @js.native
  sealed trait FixedChunkSize
    extends StObject
       with PollingWatchKind
  /* 3 */ val FixedChunkSize: typings.typescriptNn5FuAjk.mod.PollingWatchKind.FixedChunkSize & Double = js.native
  
  @js.native
  sealed trait FixedInterval
    extends StObject
       with PollingWatchKind
  /* 0 */ val FixedInterval: typings.typescriptNn5FuAjk.mod.PollingWatchKind.FixedInterval & Double = js.native
  
  @js.native
  sealed trait PriorityInterval
    extends StObject
       with PollingWatchKind
  /* 1 */ val PriorityInterval: typings.typescriptNn5FuAjk.mod.PollingWatchKind.PriorityInterval & Double = js.native
}
