package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.lightsLightMod.Light
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsShadowLightMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Lights/shadowLight", "ShadowLight")
  @js.native
  open class ShadowLight protected () extends IShadowLight {
    /**
      * Creates a Light object in the scene.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The friendly name of the light
      * @param scene The scene the light belongs too
      */
    def this(name: String, scene: Scene) = this()
    
    /* protected */ var _direction: Vector3 = js.native
    
    /* private */ var _needProjectionMatrixCompute: Any = js.native
    
    /* protected */ var _position: Vector3 = js.native
    
    /* protected */ def _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): Unit = js.native
    
    /* protected */ def _setDirection(value: Vector3): Unit = js.native
    
    /* protected */ def _setPosition(value: Vector3): Unit = js.native
    
    /* protected */ var _shadowMaxZ: Double = js.native
    
    /* protected */ var _shadowMinZ: Double = js.native
    
    /**
      * In 2d mode (needCube being false), gets the direction used to cast the shadow.
      * Also use as the light direction on spot and directional lights.
      */
    @JSName("direction")
    def direction_MShadowLight: Vector3 = js.native
    
    /**
      * Returns the light rotation in euler definition.
      * @returns the x y z rotation in local space.
      */
    def getRotation(): Vector3 = js.native
    
    /**
      * Sets the position the shadow will be casted from. Also use as the light position for both
      * point and spot lights.
      */
    @JSName("position")
    def position_MShadowLight: Vector3 = js.native
    
    /**
      * Sets the ShadowLight direction toward the passed target.
      * @param target The point to target in local space
      * @returns the updated ShadowLight direction
      */
    def setDirectionToTarget(target: Vector3): Vector3 = js.native
    
    /**
      * Sets the shadow projection clipping maximum z value.
      */
    @JSName("shadowMaxZ")
    def shadowMaxZ_MShadowLight: Double = js.native
    
    /**
      * Gets the shadow projection clipping minimum z value.
      */
    @JSName("shadowMinZ")
    def shadowMinZ_MShadowLight: Double = js.native
  }
  
  @js.native
  trait IShadowLight extends Light {
    
    /**
      * Computes the transformed information (transformedPosition and transformedDirection in World space) of the current light
      * @returns true if the information has been computed, false if it does not need to (no parenting)
      */
    def computeTransformedInformation(): Boolean = js.native
    
    /**
      * Callback defining a custom Projection Matrix Builder.
      * This can be used to override the default projection matrix computation.
      */
    def customProjectionMatrixBuilder(viewMatrix: Matrix, renderList: js.Array[AbstractMesh], result: Matrix): Unit = js.native
    
    /**
      * In 2d mode (needCube being false), the direction used to cast the shadow.
      */
    var direction: Vector3 = js.native
    
    /**
      * Forces the shadow generator to recompute the projection matrix even if position and direction did not changed.
      */
    def forceProjectionMatrixCompute(): Unit = js.native
    
    /**
      * Gets the maxZ used for shadow according to both the scene and the light.
      * @param activeCamera The camera we are returning the max for
      * @returns the depth max z
      */
    def getDepthMaxZ(activeCamera: Camera): Double = js.native
    
    /**
      * Gets the minZ used for shadow according to both the scene and the light.
      * @param activeCamera The camera we are returning the min for
      * @returns the depth min z
      */
    def getDepthMinZ(activeCamera: Camera): Double = js.native
    
    /**
      * Gets the current depth scale used in ESM.
      * @returns The scale
      */
    def getDepthScale(): Double = js.native
    
    /**
      * Get the direction to use to render the shadow map. In case of cube texture, the face index can be passed.
      * @param faceIndex The index of the face we are computed the direction to generate shadow
      * @returns The set direction in 2d mode otherwise the direction to the cubemap face if needCube() is true
      */
    def getShadowDirection(): Vector3 = js.native
    def getShadowDirection(faceIndex: Double): Vector3 = js.native
    
    /**
      * Returns whether or not the shadow generation require a cube texture or a 2d texture.
      * @returns true if a cube texture needs to be use
      */
    def needCube(): Boolean = js.native
    
    /**
      * Detects if the projection matrix requires to be recomputed this frame.
      * @returns true if it requires to be recomputed otherwise, false.
      */
    def needProjectionMatrixCompute(): Boolean = js.native
    
    /**
      * The position the shadow will be casted from.
      */
    var position: Vector3 = js.native
    
    /**
      * Sets the shadow projection matrix in parameter to the generated projection matrix.
      * @param matrix The matrix to updated with the projection information
      * @param viewMatrix The transform matrix of the light
      * @param renderList The list of mesh to render in the map
      * @returns The current light
      */
    def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): IShadowLight = js.native
    
    /**
      * Defines the shadow projection clipping maximum z value.
      */
    var shadowMaxZ: Double = js.native
    
    /**
      * Defines the shadow projection clipping minimum z value.
      */
    var shadowMinZ: Double = js.native
    
    /**
      * The transformed direction. Direction of the light in world space taking parenting in account.
      */
    var transformedDirection: Vector3 = js.native
    
    /**
      * The transformed position. Position of the light in world space taking parenting in account.
      */
    var transformedPosition: Vector3 = js.native
  }
}
