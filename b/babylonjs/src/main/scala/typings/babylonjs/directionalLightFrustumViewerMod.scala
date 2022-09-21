package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.directionalLightMod.DirectionalLight
import typings.babylonjs.mathVectorMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionalLightFrustumViewerMod {
  
  @JSImport("babylonjs/Debug/directionalLightFrustumViewer", "DirectionalLightFrustumViewer")
  @js.native
  open class DirectionalLightFrustumViewer protected () extends StObject {
    /**
      * Creates a new frustum viewer
      * @param light directional light to display the frustum for
      * @param camera camera used to retrieve the minZ / maxZ values if the shadowMinZ/shadowMaxZ values of the light are not setup
      */
    def this(light: DirectionalLight, camera: Camera) = this()
    
    /* private */ var _blLinesPoints: Any = js.native
    
    /* private */ var _bottomPlaneVertices: Any = js.native
    
    /* private */ var _brLinesPoints: Any = js.native
    
    /* private */ var _camera: Any = js.native
    
    /* protected */ def _createGeometry(): Unit = js.native
    
    /* private */ var _farLinesPoints: Any = js.native
    
    /* private */ var _farPlaneVertices: Any = js.native
    
    /* protected */ def _getInvertViewMatrix(): Matrix = js.native
    
    /* private */ var _inverseViewMatrix: Any = js.native
    
    /* private */ var _leftPlaneVertices: Any = js.native
    
    /* private */ var _light: Any = js.native
    
    /* private */ var _lightHelperFrustumMeshes: Any = js.native
    
    /* private */ var _nearLinesPoints: Any = js.native
    
    /* private */ var _nearPlaneVertices: Any = js.native
    
    /* private */ var _oldAutoCalc: Any = js.native
    
    /* private */ var _oldDirection: Any = js.native
    
    /* private */ var _oldMaxZ: Any = js.native
    
    /* private */ var _oldMinZ: Any = js.native
    
    /* private */ var _oldPosition: Any = js.native
    
    /* private */ var _rightPlaneVertices: Any = js.native
    
    /* private */ var _rootNode: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _showLines: Any = js.native
    
    /* private */ var _showPlanes: Any = js.native
    
    /* private */ var _tlLinesPoints: Any = js.native
    
    /* private */ var _topPlaneVertices: Any = js.native
    
    /* private */ var _trLinesPoints: Any = js.native
    
    /* private */ var _transparency: Any = js.native
    
    /* private */ var _visible: Any = js.native
    
    /**
      * Dispose of the class / remove the frustum view
      */
    def dispose(): Unit = js.native
    
    /**
      * Hides the frustum
      */
    def hide(): Unit = js.native
    
    /**
      * Shows the frustum
      */
    def show(): Unit = js.native
    
    /**
      * true to display the edges of the frustum
      */
    def showLines: Boolean = js.native
    def showLines_=(show: Boolean): Unit = js.native
    
    /**
      * true to display the planes of the frustum
      */
    def showPlanes: Boolean = js.native
    def showPlanes_=(show: Boolean): Unit = js.native
    
    /**
      * Gets or sets the transparency of the frustum planes
      */
    def transparency: Double = js.native
    def transparency_=(alpha: Double): Unit = js.native
    
    /**
      * Updates the frustum.
      * Call this method to update the frustum view if the light has changed position/direction
      */
    def update(): Unit = js.native
  }
}
