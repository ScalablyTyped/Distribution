package typings.babylonjs.spritesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.spriteManagerMod.ISpriteManager
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Sprites/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /** @hidden */
    var _pickedDownSprite: Nullable[typings.babylonjs.spriteMod.Sprite] = js.native
    /** @hidden */
    var _pointerOverSprite: Nullable[typings.babylonjs.spriteMod.Sprite] = js.native
    /** @hidden */
    var _tempSpritePickingRay: Nullable[Ray] = js.native
    /**
      * An event triggered when sprites rendering is done
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onAfterSpritesRenderingObservable: Observable[typings.babylonjs.spriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
    /**
      * An event triggered when sprites rendering is about to start
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onBeforeSpritesRenderingObservable: Observable[typings.babylonjs.spriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
    /**
      * All of the sprite managers added to this scene
      * @see http://doc.babylonjs.com/babylon101/sprites
      */
    var spriteManagers: js.Array[ISpriteManager] = js.native
    /** @hidden */
    def _internalMultiPickSprites(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      camera: Camera
    ): Nullable[js.Array[PickingInfo]] = js.native
    /** @hidden */
    def _internalPickSprites(ray: Ray): Nullable[PickingInfo] = js.native
    def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[PickingInfo] = js.native
    def _internalPickSprites(
      ray: Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def _internalPickSprites(
      ray: Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    /**
      * Gets the sprite under the pointer
      * @returns a Sprite or null if no sprite is under the pointer
      */
    def getPointerOverSprite(): Nullable[typings.babylonjs.spriteMod.Sprite] = js.native
    /** Launch a ray to try to pick sprites in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSprite(x: Double, y: Double): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      camera: Camera
    ): Nullable[js.Array[PickingInfo]] = js.native
    /** Use the given ray to pick sprites in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSpriteWithRay(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      camera: Camera
    ): Nullable[js.Array[PickingInfo]] = js.native
    /** Launch a ray to try to pick a sprite in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSprite(x: Double, y: Double): Nullable[PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    /** Use the given ray to pick a sprite in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck Launch a fast check only using the bounding boxes. Can be set to null.
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSpriteWithRay(ray: Ray): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: Camera
    ): Nullable[PickingInfo] = js.native
    /**
      * Force the sprite under the pointer
      * @param sprite defines the sprite to use
      */
    def setPointerOverSprite(sprite: Nullable[typings.babylonjs.spriteMod.Sprite]): Unit = js.native
  }
  
}

