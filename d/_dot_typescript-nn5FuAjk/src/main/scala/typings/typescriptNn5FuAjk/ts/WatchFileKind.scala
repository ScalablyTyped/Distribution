package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends StObject
@JSGlobal("ts.WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchFileKind
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchFileKind
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchFileKind
  
  @js.native
  sealed trait PriorityPollingInterval
    extends StObject
       with WatchFileKind
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchFileKind
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory
    extends StObject
       with WatchFileKind
}
