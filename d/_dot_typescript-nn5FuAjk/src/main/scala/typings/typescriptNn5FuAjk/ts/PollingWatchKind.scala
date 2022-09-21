package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PollingWatchKind extends StObject
@JSGlobal("ts.PollingWatchKind")
@js.native
object PollingWatchKind extends StObject {
  
  @js.native
  sealed trait DynamicPriority
    extends StObject
       with PollingWatchKind
  
  @js.native
  sealed trait FixedChunkSize
    extends StObject
       with PollingWatchKind
  
  @js.native
  sealed trait FixedInterval
    extends StObject
       with PollingWatchKind
  
  @js.native
  sealed trait PriorityInterval
    extends StObject
       with PollingWatchKind
}
