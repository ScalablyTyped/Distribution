package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.ShadowLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionalLightMod {
  
  @JSImport("babylonjs/Lights/directionalLight", "DirectionalLight")
  @js.native
  open class DirectionalLight protected () extends ShadowLight {
    /**
      * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
      * The directional light is emitted from everywhere in the given direction.
      * It can cast shadows.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The friendly name of the light
      * @param direction The direction of the light
      * @param scene The scene the light belongs to
      */
    def this(name: String, direction: Vector3, scene: Scene) = this()
    
    /* private */ var _orthoBottom: Any = js.native
    
    /* private */ var _orthoLeft: Any = js.native
    
    /* private */ var _orthoRight: Any = js.native
    
    /* private */ var _orthoTop: Any = js.native
    
    /**
      * Sets the passed matrix "matrix" as auto extend projection matrix for the shadows cast by the light according to the passed view matrix.
      * Returns the DirectionalLight Shadow projection matrix.
      * @param matrix
      * @param viewMatrix
      * @param renderList
      */
    /* protected */ def _setDefaultAutoExtendShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): Unit = js.native
    
    /**
      * Sets the passed matrix "matrix" as fixed frustum projection matrix for the shadows cast by the light according to the passed view matrix.
      * Returns the DirectionalLight Shadow projection matrix.
      * @param matrix
      */
    /* protected */ def _setDefaultFixedFrustumShadowProjectionMatrix(matrix: Matrix): Unit = js.native
    
    /* private */ var _shadowFrustumSize: Any = js.native
    
    /* private */ var _shadowOrthoScale: Any = js.native
    
    /**
      * Automatically compute the shadowMinZ and shadowMaxZ for the projection matrix to best fit (including all the casters)
      * on each frame. autoUpdateExtends must be set to true for this to work
      */
    var autoCalcShadowZBounds: Boolean = js.native
    
    /**
      * Automatically compute the projection matrix to best fit (including all the casters)
      * on each frame.
      */
    var autoUpdateExtends: Boolean = js.native
    
    /**
      * Gets or sets the orthoBottom property used to build the light frustum
      */
    def orthoBottom: Double = js.native
    def orthoBottom_=(bottom: Double): Unit = js.native
    
    /**
      * Gets or sets the orthoLeft property used to build the light frustum
      */
    def orthoLeft: Double = js.native
    def orthoLeft_=(left: Double): Unit = js.native
    
    /**
      * Gets or sets the orthoRight property used to build the light frustum
      */
    def orthoRight: Double = js.native
    def orthoRight_=(right: Double): Unit = js.native
    
    /**
      * Gets or sets the orthoTop property used to build the light frustum
      */
    def orthoTop: Double = js.native
    def orthoTop_=(top: Double): Unit = js.native
    
    /**
      * Fix frustum size for the shadow generation. This is disabled if the value is 0.
      */
    def shadowFrustumSize: Double = js.native
    /**
      * Specifies a fix frustum size for the shadow generation.
      */
    def shadowFrustumSize_=(value: Double): Unit = js.native
    
    /**
      * Gets the shadow projection scale against the optimal computed one.
      * 0.1 by default which means that the projection window is increase by 10% from the optimal size.
      * This does not impact in fixed frustum size (shadowFrustumSize being set)
      */
    def shadowOrthoScale: Double = js.native
    /**
      * Sets the shadow projection scale against the optimal computed one.
      * 0.1 by default which means that the projection window is increase by 10% from the optimal size.
      * This does not impact in fixed frustum size (shadowFrustumSize being set)
      */
    def shadowOrthoScale_=(value: Double): Unit = js.native
  }
}
