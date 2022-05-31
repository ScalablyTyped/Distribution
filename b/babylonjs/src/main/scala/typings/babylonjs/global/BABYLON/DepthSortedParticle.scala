package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DepthSortedParticle")
@js.native
class DepthSortedParticle protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DepthSortedParticle {
  /**
    * Creates a new sorted particle
    * @param materialIndex
    */
  def this(idx: Double, ind: Double, indLength: Double, materialIndex: Double) = this()
  
  /**
    * Particle index
    */
  /* CompleteClass */
  var idx: Double = js.native
  
  /**
    * Index of the particle in the "indices" array
    */
  /* CompleteClass */
  var ind: Double = js.native
  
  /**
    * Length of the particle shape in the "indices" array
    */
  /* CompleteClass */
  var indicesLength: Double = js.native
  
  /**
    * Material index when used with MultiMaterials
    */
  /* CompleteClass */
  var materialIndex: Double = js.native
  
  /**
    * Squared distance from the particle to the camera
    */
  /* CompleteClass */
  var sqDistance: Double = js.native
}
