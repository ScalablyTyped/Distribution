package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointLight
  extends StObject
     with ShadowLight {
  
  /* private */ var _shadowAngle: Any = js.native
  
  /**
    * Gets the direction if it has been set.
    * In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    */
  @JSName("direction")
  def direction_MPointLight: Vector3 = js.native
  
  /**
    * Getter: In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    * This specifies what angle the shadow will use to be created.
    *
    * It default to 90 degrees to work nicely with the cube texture generation for point lights shadow maps.
    */
  def shadowAngle: Double = js.native
  /**
    * Setter: In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    * This specifies what angle the shadow will use to be created.
    *
    * It default to 90 degrees to work nicely with the cube texture generation for point lights shadow maps.
    */
  def shadowAngle_=(value: Double): Unit = js.native
}
