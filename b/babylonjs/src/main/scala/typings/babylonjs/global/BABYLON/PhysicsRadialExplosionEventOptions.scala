package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PhysicsAffectedImpostorWithData
import typings.babylonjs.anon.DiameterSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsRadialExplosionEventOptions")
@js.native
class PhysicsRadialExplosionEventOptions ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions {
  
  /**
    * Sphere options for the radial explosion.
    */
  /* CompleteClass */
  override def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
  
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  /* CompleteClass */
  var falloff: typings.babylonjs.BABYLON.PhysicsRadialImpulseFalloff = js.native
  
  /**
    * The radius of the sphere for the radial explosion.
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * Sphere options for the radial explosion.
    */
  /* CompleteClass */
  var sphere: DiameterSegments = js.native
  
  /**
    * The strenth of the explosion.
    */
  /* CompleteClass */
  var strength: Double = js.native
}
