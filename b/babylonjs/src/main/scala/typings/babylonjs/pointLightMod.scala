package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.ShadowLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Lights/pointLight", JSImport.Namespace)
@js.native
object pointLightMod extends js.Object {
  @js.native
  class PointLight protected () extends ShadowLight {
    /**
      * Creates a PointLight object from the passed name and position (Vector3) and adds it in the scene.
      * A PointLight emits the light in every direction.
      * It can cast shadows.
      * If the scene camera is already defined and you want to set your PointLight at the camera position, just set it :
      * ```javascript
      * var pointLight = new PointLight("pl", camera.position, scene);
      * ```
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The light friendly name
      * @param position The position of the point light in the scene
      * @param scene The scene the lights belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    var _shadowAngle: js.Any = js.native
    /**
      * Gets the direction if it has been set.
      * In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
      */
    @JSName("direction")
    def direction_MPointLight: Vector3 = js.native
    /**
      * In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
      */
    @JSName("direction")
    def direction_MPointLight(value: Vector3): js.Any = js.native
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
    def shadowAngle(value: Double): js.Any = js.native
  }
  
}

