package typings.babylonjs.indexMod

import typings.babylonjs.anon.AdditiveAnimations
import typings.babylonjs.anon.Animations
import typings.babylonjs.anon.PartialIEnvironmentHelper
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelperOptions
import typings.babylonjs.cullingRayMod.TrianglePickingPredicate
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.spritesSpriteManagerMod.ISpriteManager
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @internal (Backing field) */
    var _boundingBoxRenderer: typings.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /** @internal */
    var _cachedRayForTransform: typings.babylonjs.cullingRayMod.Ray = js.native
    
    /** @internal */
    def _createMultiviewUbo(): Unit = js.native
    
    /**
      * @internal
      * Backing field
      */
    var _debugLayer: typings.babylonjs.debugDebugLayerMod.DebugLayer = js.native
    
    /** @internal (Backing field) */
    var _depthPeelingRenderer: Nullable[typings.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer] = js.native
    
    /** @internal (Backing field) */
    var _depthRenderer: org.scalablytyped.runtime.StringDictionary[typings.babylonjs.renderingDepthRendererMod.DepthRenderer] = js.native
    
    /** @internal */
    var _edgeRenderLineShader: Nullable[typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial] = js.native
    
    /** @internal (Backing field) */
    var _forceShowBoundingBoxes: Boolean = js.native
    
    /** @internal */
    var _gamepadManager: Nullable[typings.babylonjs.gamepadsGamepadManagerMod.GamepadManager] = js.native
    
    /** @internal (Backing field) */
    var _geometryBufferRenderer: Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /** @internal */
    def _internalMultiPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ]
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean]
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    
    /** @internal */
    def _internalMultiPickSprites(ray: typings.babylonjs.cullingRayMod.Ray): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean]
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    
    /** @internal */
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ]
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean]
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Unit,
      onlyBoundingInfo: Boolean
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Boolean
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    def _internalPick(
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      predicate: Unit,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): typings.babylonjs.collisionsPickingInfoMod.PickingInfo = js.native
    
    /** @internal */
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: Unit,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
      rayFunction: js.Function2[
          /* world */ typings.babylonjs.mathsMathDotvectorMod.Matrix, 
          /* enableDistantPicking */ Boolean, 
          typings.babylonjs.cullingRayMod.Ray
        ],
      mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
      world: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      fastCheck: Unit,
      onlyBoundingInfo: Unit,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    
    /** @internal */
    def _internalPickSprites(ray: typings.babylonjs.cullingRayMod.Ray): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean]
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(ray: typings.babylonjs.cullingRayMod.Ray, predicate: Unit, fastCheck: Boolean): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: Unit,
      fastCheck: Boolean,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: Unit,
      fastCheck: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    
    /**
      * @internal
      * Backing field
      */
    var _mainSoundTrack: typings.babylonjs.audioSoundTrackMod.SoundTrack = js.native
    
    /** @internal */
    var _meshUVSpaceRendererShader: Nullable[typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial] = js.native
    
    /** @internal */
    var _multiviewSceneUbo: Nullable[typings.babylonjs.materialsUniformBufferMod.UniformBuffer] = js.native
    
    /** @internal */
    var _outlineRenderer: typings.babylonjs.renderingOutlineRendererMod.OutlineRenderer = js.native
    
    /** @internal */
    var _pickWithRayInverseMatrix: typings.babylonjs.mathsMathDotvectorMod.Matrix = js.native
    
    /** @internal */
    var _pickedDownSprite: Nullable[typings.babylonjs.spritesSpriteMod.Sprite] = js.native
    
    /** @internal */
    var _pointerOverSprite: Nullable[typings.babylonjs.spritesSpriteMod.Sprite] = js.native
    
    /** @internal (Backing field) */
    var _postProcessRenderPipelineManager: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
    
    /** @internal */
    def _processLateAnimationBindings(): Unit = js.native
    
    /** @internal */
    def _processLateAnimationBindingsForMatrices(holder: AdditiveAnimations): Any = js.native
    
    /** @internal */
    def _processLateAnimationBindingsForQuaternions(holder: Animations, refQuaternion: typings.babylonjs.mathsMathDotvectorMod.Quaternion): typings.babylonjs.mathsMathDotvectorMod.Quaternion = js.native
    
    /** @internal */
    def _registerTargetForLateAnimationBinding(
      runtimeAnimation: typings.babylonjs.animationsRuntimeAnimationMod.RuntimeAnimation,
      originalValue: Any
    ): Unit = js.native
    
    /** @internal */
    def _renderMultiviewToSingleView(camera: typings.babylonjs.camerasCameraMod.Camera): Unit = js.native
    
    /**
      * @internal
      * Backing Filed
      */
    var _selectionOctree: typings.babylonjs.cullingOctreesOctreeMod.Octree[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /** @internal (Backing field) */
    var _simplificationQueue: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue = js.native
    
    /** @internal */
    var _tempPickingRay: Nullable[typings.babylonjs.cullingRayMod.Ray] = js.native
    
    /** @internal */
    var _tempSpritePickingRay: Nullable[typings.babylonjs.cullingRayMod.Ray] = js.native
    
    /** @internal */
    var _transformMatrixR: typings.babylonjs.mathsMathDotvectorMod.Matrix = js.native
    
    /** @internal */
    def _updateMultiviewUbo(): Unit = js.native
    def _updateMultiviewUbo(viewR: Unit, projectionR: typings.babylonjs.mathsMathDotvectorMod.Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: typings.babylonjs.mathsMathDotvectorMod.Matrix): Unit = js.native
    def _updateMultiviewUbo(
      viewR: typings.babylonjs.mathsMathDotvectorMod.Matrix,
      projectionR: typings.babylonjs.mathsMathDotvectorMod.Matrix
    ): Unit = js.native
    
    /** @internal */
    var _useOrderIndependentTransparency: Boolean = js.native
    
    /**
      * Gets or sets if audio support is enabled
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var audioEnabled: Boolean = js.native
    
    /**
      * Gets or sets custom audio listener position provider
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var audioListenerPositionProvider: Nullable[js.Function0[typings.babylonjs.mathsMathDotvectorMod.Vector3]] = js.native
    
    /**
      * Gets or sets custom audio listener rotation provider
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var audioListenerRotationProvider: Nullable[js.Function0[typings.babylonjs.mathsMathDotvectorMod.Vector3]] = js.native
    
    /**
      * Gets or sets a refresh rate when using 3D audio positioning
      */
    var audioPositioningRefreshRate: Double = js.native
    
    /**
      * Will start the animation sequence of a given target
      * @param target defines the target
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param stopCurrent defines if the current animations must be stopped first (true by default)
      * @param targetMask defines if the target should be animate if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the animatable object created for this animation
      */
    def beginAnimation(
      target: Any,
      from: Double,
      to: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[typings.babylonjs.animationsAnimatableMod.Animatable],
      stopCurrent: js.UndefOr[Boolean],
      targetMask: js.UndefOr[js.Function1[/* target */ Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    
    /**
      * Begin a new animation on a given node
      * @param target defines the target where the animation will take place
      * @param animations defines the list of animations to start
      * @param from defines the initial value
      * @param to defines the final value
      * @param loop defines if you want animation to loop (off by default)
      * @param speedRatio defines the speed ratio to apply to all animations
      * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of created animatables
      */
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: Any,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    
    /**
      * Begin a new animation on a given node and its hierarchy
      * @param target defines the root node where the animation will take place
      * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
      * @param animations defines the list of animations to start
      * @param from defines the initial value
      * @param to defines the final value
      * @param loop defines if you want animation to loop (off by default)
      * @param speedRatio defines the speed ratio to apply to all animations
      * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of animatables created for all nodes
      */
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Double,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typings.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typings.babylonjs.animationsAnimationMod.Animation],
      from: Double,
      to: Double,
      loop: Unit,
      speedRatio: Unit,
      onAnimationEnd: Unit,
      onAnimationLoop: Unit,
      isAdditive: Boolean
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    
    /**
      * Will start the animation sequence of a given target and its hierarchy
      * @param target defines the target
      * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param stopCurrent defines if the current animations must be stopped first (true by default)
      * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of created animatables
      */
    def beginHierarchyAnimation(
      target: Any,
      directDescendantsOnly: Boolean,
      from: Double,
      to: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[typings.babylonjs.animationsAnimatableMod.Animatable],
      stopCurrent: js.UndefOr[Boolean],
      targetMask: js.UndefOr[js.Function1[/* target */ Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    
    /**
      * Will start the animation sequence of a given target
      * @param target defines the target
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param weight defines the weight to apply to the animation (1.0 by default)
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the animatable object created for this animation
      */
    def beginWeightedAnimation(
      target: Any,
      from: Double,
      to: Double,
      weight: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[typings.babylonjs.animationsAnimatableMod.Animatable],
      targetMask: js.UndefOr[js.Function1[/* target */ Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): typings.babylonjs.animationsAnimatableMod.Animatable = js.native
    
    /**
      * Creates a default camera for the scene.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-camera
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has default false, when true replaces the active camera in the scene
      * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCamera(): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Unit, replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Unit, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Unit, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a default camera and a default light.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-camera-or-light
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has the default false, when true replaces the active camera/light in the scene
      * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCameraOrLight(): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Unit, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a new environment
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-environment
      * @param options defines the options you can use to configure the environment
      * @returns the new EnvironmentHelper
      */
    def createDefaultEnvironment(): Nullable[typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper] = js.native
    def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper] = js.native
    
    /**
      * Creates a default light for the scene.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-light
      * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
      */
    def createDefaultLight(): Unit = js.native
    def createDefaultLight(replace: Boolean): Unit = js.native
    
    /**
      * Creates a new sky box
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-skybox
      * @param environmentTexture defines the texture to use as environment texture
      * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
      * @param scale defines the overall scale of the skybox
      * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
      * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
      * @returns a new mesh holding the sky box
      */
    def createDefaultSkybox(): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Double): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Double, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Double): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Double, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Double): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Double, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Double): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Double, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture, pbr: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Double
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Unit,
      blur: Double
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Unit,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Unit,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Double
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Double,
      blur: Double
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Double,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Unit,
      blur: Double
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Unit,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture,
      pbr: Unit,
      scale: Unit,
      blur: Unit,
      setGlobalEnvTexture: Boolean
    ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = js.native
    
    /**
      * Creates a new VREXperienceHelper
      * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRHelper
      * @param webVROptions defines the options used to create the new VREXperienceHelper
      * @deprecated Please use createDefaultXRExperienceAsync instead
      * @returns a new VREXperienceHelper
      */
    def createDefaultVRExperience(): typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelper = js.native
    def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelper = js.native
    
    /**
      * Creates a new WebXRDefaultExperience
      * @see https://doc.babylonjs.com/features/featuresDeepDive/webXR/introToWebXR
      * @param options experience options
      * @returns a promise for a new WebXRDefaultExperience
      */
    def createDefaultXRExperienceAsync(): js.Promise[typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
    def createDefaultXRExperienceAsync(options: typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperienceOptions): js.Promise[typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
    
    /**
      * Creates or updates the octree used to boost selection (picking)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeOctrees
      * @param maxCapacity defines the maximum capacity per leaf
      * @param maxDepth defines the maximum depth of the octree
      * @returns an octree of AbstractMesh
      */
    def createOrUpdateSelectionOctree(): typings.babylonjs.cullingOctreesOctreeMod.Octree[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double): typings.babylonjs.cullingOctreesOctreeMod.Octree[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.cullingOctreesOctreeMod.Octree[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Unit, maxDepth: Double): typings.babylonjs.cullingOctreesOctreeMod.Octree[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Gets the debug layer (aka Inspector) associated with the scene
      * @see https://doc.babylonjs.com/toolsAndResources/inspector
      */
    var debugLayer: typings.babylonjs.debugDebugLayerMod.DebugLayer = js.native
    
    /**
      * Gets the current delta time used by animation engine
      */
    var deltaTime: Double = js.native
    
    /**
      * The depth peeling renderer
      */
    var depthPeelingRenderer: Nullable[typings.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer] = js.native
    
    /**
      * Disables a depth renderer for a given camera
      * @param camera The camera to disable the depth renderer on (default: scene's active camera)
      */
    def disableDepthRenderer(): Unit = js.native
    def disableDepthRenderer(camera: Nullable[typings.babylonjs.camerasCameraMod.Camera]): Unit = js.native
    
    /**
      * Disables the GeometryBufferRender associated with the scene
      */
    def disableGeometryBufferRenderer(): Unit = js.native
    
    /**
      * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
      * @param camera The camera to create the depth renderer on (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
      * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...)
      * @param storeCameraSpaceZ Defines whether the depth stored is the Z coordinate in camera space. If true, storeNonLinearDepth has no effect. (Default: false)
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Boolean, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Boolean, force32bitsFloat: Unit, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Boolean, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Unit, storeNonLinearDepth: Unit, force32bitsFloat: Unit, samplingMode: Double): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Unit,
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[typings.babylonjs.camerasCameraMod.Camera]): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[typings.babylonjs.camerasCameraMod.Camera], storeNonLinearDepth: Boolean): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Boolean,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Double,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
      storeNonLinearDepth: Unit,
      force32bitsFloat: Unit,
      samplingMode: Unit,
      storeCameraSpaceZ: Boolean
    ): typings.babylonjs.renderingDepthRendererMod.DepthRenderer = js.native
    
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double, depthFormat: Double): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Unit, depthFormat: Double): Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /**
      * Gets or sets a boolean indicating if all bounding boxes must be rendered
      */
    var forceShowBoundingBoxes: Boolean = js.native
    
    /**
      * Gets the gamepad manager associated with the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/input/gamepads
      */
    var gamepadManager: typings.babylonjs.gamepadsGamepadManagerMod.GamepadManager = js.native
    
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[typings.babylonjs.renderingGeometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /**
      * Gets all animatables associated with a given target
      * @param target defines the target to look animatables for
      * @returns an array of Animatables
      */
    def getAllAnimatablesByTarget(target: Any): js.Array[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    
    /**
      * Gets the animatable associated with a specific target
      * @param target defines the target of the animatable
      * @returns the required animatable if found
      */
    def getAnimatableByTarget(target: Any): Nullable[typings.babylonjs.animationsAnimatableMod.Animatable] = js.native
    
    /**
      * Gets a bone using its Id
      * @param id defines the bone's Id
      * @returns the bone or null if not found
      * @deprecated Please use getBoneById instead
      */
    def getBoneByID(id: String): Nullable[typings.babylonjs.bonesBoneMod.Bone] = js.native
    
    /**
      * Gets the bounding box renderer associated with the scene
      * @returns a BoundingBoxRenderer
      */
    def getBoundingBoxRenderer(): typings.babylonjs.renderingBoundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /**
      * Gets a camera using its Id
      * @param id defines the Id to look for
      * @returns the camera or null if not found
      * @deprecated Please use getCameraById instead
      */
    def getCameraByID(id: String): Nullable[typings.babylonjs.camerasCameraMod.Camera] = js.native
    
    /**
      * Gets a camera using its unique Id
      * @param uniqueId defines the unique Id to look for
      * @returns the camera or null if not found
      * @deprecated Please use getCameraByUniqueId instead
      */
    def getCameraByUniqueID(uniqueId: Double): Nullable[typings.babylonjs.camerasCameraMod.Camera] = js.native
    
    /**
      * Gets a geometry using its Id
      * @param id defines the geometry's Id
      * @returns the geometry or null if none found.
      * @deprecated Please use getGeometryById instead
      */
    def getGeometryByID(id: String): Nullable[typings.babylonjs.meshesGeometryMod.Geometry] = js.native
    
    /**
      * Gets a the last added node (Mesh, Camera, Light) using a given Id
      * @param id defines the Id to search for
      * @returns the found node or null if not found at all
      * @deprecated Please use getLastEntryById instead
      */
    def getLastEntryByID(id: String): Nullable[typings.babylonjs.nodeMod.Node] = js.native
    
    /**
      * Gets a the last added material using a given id
      * @param id defines the material's Id
      * @returns the last material with the given id or null if none found.
      * @deprecated Please use getLastMaterialById instead
      */
    def getLastMaterialByID(id: String): Nullable[typings.babylonjs.materialsMaterialMod.Material] = js.native
    
    /**
      * Gets a the last added mesh using a given Id
      * @param id defines the Id to search for
      * @returns the found mesh or null if not found at all.
      * @deprecated Please use getLastMeshById instead
      */
    def getLastMeshByID(id: String): Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Gets a skeleton using a given Id (if many are found, this function will pick the last one)
      * @param id defines the Id to search for
      * @returns the found skeleton or null if not found at all.
      * @deprecated Please use getLastSkeletonById instead
      */
    def getLastSkeletonByID(id: String): Nullable[typings.babylonjs.bonesSkeletonMod.Skeleton] = js.native
    
    /**
      * Gets a light node using its Id
      * @param id defines the light's Id
      * @returns the light or null if none found.
      * @deprecated Please use getLightById instead
      */
    def getLightByID(id: String): Nullable[typings.babylonjs.lightsLightMod.Light] = js.native
    
    /**
      * Gets a light node using its scene-generated unique Id
      * @param uniqueId defines the light's unique Id
      * @returns the light or null if none found.
      * @deprecated Please use getLightByUniqueId instead
      */
    def getLightByUniqueID(uniqueId: Double): Nullable[typings.babylonjs.lightsLightMod.Light] = js.native
    
    /**
      * Get a material using its id
      * @param id defines the material's Id
      * @returns the material or null if none found.
      * @deprecated Please use getMaterialById instead
      */
    def getMaterialByID(id: String): Nullable[typings.babylonjs.materialsMaterialMod.Material] = js.native
    
    /**
      * Gets the first added mesh found of a given Id
      * @param id defines the Id to search for
      * @returns the mesh found or null if not found at all
      * @deprecated Please use getMeshById instead
      */
    def getMeshByID(id: String): Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Gets a mesh with its auto-generated unique Id
      * @param uniqueId defines the unique Id to search for
      * @returns the found mesh or null if not found at all.
      * @deprecated Please use getMeshByUniqueId instead
      */
    def getMeshByUniqueID(uniqueId: Double): Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Gets a list of meshes using their Id
      * @param id defines the Id to search for
      * @returns a list of meshes
      * @deprecated Please use getMeshesById instead
      */
    def getMeshesByID(id: String): js.Array[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Gets a node (Mesh, Camera, Light) using a given Id
      * @param id defines the Id to search for
      * @returns the found node or null if not found at all
      * @deprecated Please use getNodeById instead
      */
    def getNodeByID(id: String): Nullable[typings.babylonjs.nodeMod.Node] = js.native
    
    /**
      * Gets the outline renderer associated with the scene
      * @returns a OutlineRenderer
      */
    def getOutlineRenderer(): typings.babylonjs.renderingOutlineRendererMod.OutlineRenderer = js.native
    
    /**
      * Gets a particle system by Id
      * @param id defines the particle system Id
      * @returns the corresponding system or null if none found
      * @deprecated Please use getParticleSystemById instead
      */
    def getParticleSystemByID(id: String): Nullable[IParticleSystem] = js.native
    
    /**
      * Gets the sprite under the pointer
      * @returns a Sprite or null if no sprite is under the pointer
      */
    def getPointerOverSprite(): Nullable[typings.babylonjs.spritesSpriteMod.Sprite] = js.native
    
    /**
      * Gets a sound using a given name
      * @param name defines the name to search for
      * @returns the found sound or null if not found at all.
      */
    def getSoundByName(name: String): Nullable[typings.babylonjs.audioSoundMod.Sound] = js.native
    
    /**
      * Get a texture using its unique id
      * @param uniqueId defines the texture's unique id
      * @returns the texture or null if none found.
      * @deprecated Please use getTextureByUniqueId instead
      */
    def getTextureByUniqueID(uniqueId: Double): Nullable[typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture] = js.native
    
    /**
      * Gets the first added transform node found of a given Id
      * @param id defines the Id to search for
      * @returns the found transform node or null if not found at all.
      * @deprecated Please use getTransformNodeById instead
      */
    def getTransformNodeByID(id: String): Nullable[typings.babylonjs.meshesTransformNodeMod.TransformNode] = js.native
    
    /**
      * Gets a transform node with its auto-generated unique Id
      * @param uniqueId defines the unique Id to search for
      * @returns the found transform node or null if not found at all.
      * @deprecated Please use getTransformNodeByUniqueId instead
      */
    def getTransformNodeByUniqueID(uniqueId: Double): Nullable[typings.babylonjs.meshesTransformNodeMod.TransformNode] = js.native
    
    /**
      * Gets a list of transform nodes using their Id
      * @param id defines the Id to search for
      * @returns a list of transform nodes
      * @deprecated Please use getTransformNodesById instead
      */
    def getTransformNodesByID(id: String): js.Array[typings.babylonjs.meshesTransformNodeMod.TransformNode] = js.native
    
    /**
      * Gets or sets if audio will be output to headphones
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var headphone: Boolean = js.native
    
    /**
      * The main sound track played by the scene.
      * It contains your primary collection of sounds.
      */
    var mainSoundTrack: typings.babylonjs.audioSoundTrackMod.SoundTrack = js.native
    
    /** Launch a ray to try to pick sprites in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSprite(x: Double, y: Double): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean]
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def multiPickSprite(x: Double, y: Double, predicate: Unit, camera: typings.babylonjs.camerasCameraMod.Camera): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    
    /** Use the given ray to pick sprites in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSpriteWithRay(ray: typings.babylonjs.cullingRayMod.Ray): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean]
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[js.Array[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]] = js.native
    
    /**
      * An event triggered when sprites rendering is done
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onAfterSpritesRenderingObservable: typings.babylonjs.miscObservableMod.Observable[
        typings.babylonjs.spritesSpriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /**
      * An event triggered when sprites rendering is about to start
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onBeforeSpritesRenderingObservable: typings.babylonjs.miscObservableMod.Observable[
        typings.babylonjs.spritesSpriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /** Launch a ray to try to pick a sprite in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSprite(x: Double, y: Double): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean]
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: Unit,
      fastCheck: Boolean,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: Unit,
      fastCheck: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    
    /** Use the given ray to pick a sprite in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSpriteWithRay(ray: typings.babylonjs.cullingRayMod.Ray): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean]
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: js.Function1[/* sprite */ typings.babylonjs.spritesSpriteMod.Sprite, Boolean],
      fastCheck: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(ray: typings.babylonjs.cullingRayMod.Ray, predicate: Unit, fastCheck: Boolean): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: Unit,
      fastCheck: Boolean,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typings.babylonjs.cullingRayMod.Ray,
      predicate: Unit,
      fastCheck: Unit,
      camera: typings.babylonjs.camerasCameraMod.Camera
    ): Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo] = js.native
    
    /**
      * Gets the postprocess render pipeline manager
      * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/postProcessRenderPipeline
      * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/defaultRenderingPipeline
      */
    val postProcessRenderPipelineManager: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
    
    /**
      * Gets the octree used to boost mesh selection (picking)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimizeOctrees
      */
    var selectionOctree: typings.babylonjs.cullingOctreesOctreeMod.Octree[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Sets the active camera of the scene using its Id
      * @param id defines the camera's Id
      * @returns the new active camera or null if none found.
      * @deprecated Please use setActiveCameraById instead
      */
    def setActiveCameraByID(id: String): Nullable[typings.babylonjs.camerasCameraMod.Camera] = js.native
    
    /**
      * Force the sprite under the pointer
      * @param sprite defines the sprite to use
      */
    def setPointerOverSprite(sprite: Nullable[typings.babylonjs.spritesSpriteMod.Sprite]): Unit = js.native
    
    /**
      * Gets or sets the simplification queue attached to the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/simplifyingMeshes
      */
    var simplificationQueue: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue = js.native
    
    /**
      * The list of sound tracks added to the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      */
    var soundTracks: Nullable[js.Array[typings.babylonjs.audioSoundTrackMod.SoundTrack]] = js.native
    
    /**
      * All of the sprite managers added to this scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/sprites
      */
    var spriteManagers: js.UndefOr[js.Array[ISpriteManager]] = js.native
    
    /**
      * Stops and removes all animations that have been applied to the scene
      */
    def stopAllAnimations(): Unit = js.native
    
    /**
      * Flag to indicate if we want to use order independent transparency, despite the performance hit
      */
    var useOrderIndependentTransparency: Boolean = js.native
  }
}
