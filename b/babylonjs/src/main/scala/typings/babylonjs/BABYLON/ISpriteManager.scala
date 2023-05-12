package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteManager
  extends StObject
     with IDisposable {
  
  /** @internal */
  var _wasDispatched: Boolean = js.native
  
  /** Defines the default height of a cell in the spritesheet */
  var cellHeight: Double = js.native
  
  /** Defines the default width of a cell in the spritesheet */
  var cellWidth: Double = js.native
  
  /**
    * Tests the intersection of a sprite with a specific ray.
    * @param ray The ray we are sending to test the collision
    * @param camera The camera space we are sending rays in
    * @param predicate A predicate allowing excluding sprites from the list of object to test
    * @param fastCheck defines if the first intersection will be used (and not the closest)
    * @returns picking info or null.
    */
  def intersects(ray: Ray, camera: Camera): Nullable[PickingInfo] = js.native
  def intersects(ray: Ray, camera: Camera, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
  def intersects(
    ray: Ray,
    camera: Camera,
    predicate: js.Function1[/* sprite */ Sprite, Boolean],
    fastCheck: Boolean
  ): Nullable[PickingInfo] = js.native
  def intersects(ray: Ray, camera: Camera, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
  
  /**
    * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
    */
  var isPickable: Boolean = js.native
  
  /**
    * Restricts the camera to viewing objects with the same layerMask.
    * A camera with a layerMask of 1 will render spriteManager.layerMask & camera.layerMask!== 0
    */
  var layerMask: Double = js.native
  
  /**
    * Intersects the sprites with a ray
    * @param ray defines the ray to intersect with
    * @param camera defines the current active camera
    * @param predicate defines a predicate used to select candidate sprites
    * @returns null if no hit or a PickingInfo array
    */
  def multiIntersects(ray: Ray, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
  def multiIntersects(ray: Ray, camera: Camera, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
  
  /**
    * Gets manager's name
    */
  var name: String = js.native
  
  /**
    * Rebuilds the manager (after a context lost, for eg)
    */
  def rebuild(): Unit = js.native
  
  /**
    * Renders the list of sprites on screen.
    */
  def render(): Unit = js.native
  
  /**
    * Specifies the rendering group id for this mesh (0 by default)
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/advanced/transparent_rendering#rendering-groups
    */
  var renderingGroupId: Double = js.native
  
  /**
    * Gets the hosting scene
    */
  var scene: Scene = js.native
  
  /**
    * Defines the list of sprites managed by the manager.
    */
  var sprites: js.Array[Sprite] = js.native
  
  /**
    * Gets or sets the spritesheet texture
    */
  var texture: Texture = js.native
}
