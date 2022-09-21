package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryKind extends StObject
@JSGlobal("ts.WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends StObject {
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchDirectoryKind
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchDirectoryKind
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchDirectoryKind
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchDirectoryKind
}
