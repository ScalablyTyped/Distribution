package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spriteManagerMod.ISpriteManager
import typings.babylonjs.spriteMod.Sprite
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteSceneComponentMod {
  
  @JSImport("babylonjs/Sprites/spriteSceneComponent", "SpriteSceneComponent")
  @js.native
  class SpriteSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _pickSpriteButKeepRay: js.Any = js.native
    
    var _pointerDown: js.Any = js.native
    
    var _pointerMove: js.Any = js.native
    
    var _pointerUp: js.Any = js.native
    
    /** @hidden */
    var _spritePredicate: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      def _internalMultiPickSprites(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: js.UndefOr[scala.Nothing], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /** @hidden */
      def _internalPickSprites(ray: Ray): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.UndefOr[scala.Nothing],
        fastCheck: js.UndefOr[scala.Nothing],
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: js.UndefOr[scala.Nothing],
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      
      /** @hidden */
      var _pickedDownSprite: Nullable[Sprite] = js.native
      
      /** @hidden */
      var _pointerOverSprite: Nullable[Sprite] = js.native
      
      /** @hidden */
      var _tempSpritePickingRay: Nullable[Ray] = js.native
      
      /**
        * Gets the sprite under the pointer
        * @returns a Sprite or null if no sprite is under the pointer
        */
      def getPointerOverSprite(): Nullable[Sprite] = js.native
      
      /** Launch a ray to try to pick sprites in the scene
        * @param x position on screen
        * @param y position on screen
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo array
        */
      def multiPickSprite(x: Double, y: Double): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: js.UndefOr[scala.Nothing], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /** Use the given ray to pick sprites in the scene
        * @param ray The ray (in world space) to use to pick meshes
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo array
        */
      def multiPickSpriteWithRay(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: js.UndefOr[scala.Nothing], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
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
      
      /** Launch a ray to try to pick a sprite in the scene
        * @param x position on screen
        * @param y position on screen
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param fastCheck defines if the first intersection will be used (and not the closest)
        * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo
        */
      def pickSprite(x: Double, y: Double): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.UndefOr[scala.Nothing],
        fastCheck: js.UndefOr[scala.Nothing],
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: js.UndefOr[scala.Nothing],
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      
      /** Use the given ray to pick a sprite in the scene
        * @param ray The ray (in world space) to use to pick meshes
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param fastCheck defines if the first intersection will be used (and not the closest)
        * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo
        */
      def pickSpriteWithRay(ray: Ray): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.UndefOr[scala.Nothing],
        fastCheck: js.UndefOr[scala.Nothing],
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: js.UndefOr[scala.Nothing],
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ Sprite, Boolean], fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      
      /**
        * Force the sprite under the pointer
        * @param sprite defines the sprite to use
        */
      def setPointerOverSprite(sprite: Nullable[Sprite]): Unit = js.native
      
      /**
        * All of the sprite managers added to this scene
        * @see https://doc.babylonjs.com/babylon101/sprites
        */
      var spriteManagers: js.Array[ISpriteManager] = js.native
    }
  }
}
