package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticlesOptimization
  extends StObject
     with SceneOptimization
object ParticlesOptimization {
  
  inline def apply(apply: (Scene, SceneOptimizer) => Boolean, getDescription: () => String, priority: Double): ParticlesOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticlesOptimization]
  }
}
