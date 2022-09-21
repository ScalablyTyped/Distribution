package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancedLinesMesh
  extends StObject
     with InstancedMesh {
  
  /**
    * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
    * This margin is expressed in world space coordinates, so its value may vary.
    * Initialized with the intersectionThreshold value of the source LinesMesh
    */
  var intersectionThreshold: Double = js.native
}
