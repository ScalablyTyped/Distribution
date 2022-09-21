package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoReleaseWorkerPoolOptions extends StObject {
  
  /**
    * Idle time elapsed before workers are terminated.
    */
  var idleTimeElapsedBeforeRelease: Double
}
object AutoReleaseWorkerPoolOptions {
  
  inline def apply(idleTimeElapsedBeforeRelease: Double): AutoReleaseWorkerPoolOptions = {
    val __obj = js.Dynamic.literal(idleTimeElapsedBeforeRelease = idleTimeElapsedBeforeRelease.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoReleaseWorkerPoolOptions]
  }
  
  extension [Self <: AutoReleaseWorkerPoolOptions](x: Self) {
    
    inline def setIdleTimeElapsedBeforeRelease(value: Double): Self = StObject.set(x, "idleTimeElapsedBeforeRelease", value.asInstanceOf[js.Any])
  }
}
