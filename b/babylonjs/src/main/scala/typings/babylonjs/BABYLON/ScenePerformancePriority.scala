package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScenePerformancePriority extends StObject
@JSGlobal("BABYLON.ScenePerformancePriority")
@js.native
object ScenePerformancePriority extends StObject {
  
  /** Performance will be top priority */
  @js.native
  sealed trait Aggressive
    extends StObject
       with ScenePerformancePriority
  
  /** Default mode. No change. Performance will be treated as less important than backward compatibility */
  @js.native
  sealed trait BackwardCompatible
    extends StObject
       with ScenePerformancePriority
  
  /** Some performance options will be turned on trying to strike a balance between perf and ease of use */
  @js.native
  sealed trait Intermediate
    extends StObject
       with ScenePerformancePriority
}
