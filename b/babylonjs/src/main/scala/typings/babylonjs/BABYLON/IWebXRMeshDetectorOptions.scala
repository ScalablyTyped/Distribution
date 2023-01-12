package typings.babylonjs.BABYLON

import typings.babylonjs.XRGeometryDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRMeshDetectorOptions extends StObject {
  
  /**
    * If set to true, WebXRMeshDetector will convert coordinate systems for meshes.
    * If not defined, mesh conversions from right handed to left handed coordinate systems won't be conducted.
    * Right handed mesh data will be available through IWebXRVertexData.xrMesh.
    */
  var convertCoordinateSystems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true a reference of the created meshes will be kept until the next session starts
    * If not defined, meshes will be removed from the array when the feature is detached or the session ended.
    */
  var doNotRemoveMeshesOnSessionEnded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Preferred detector configuration, not all preferred options will be supported by all platforms.
    */
  var preferredDetectorOptions: js.UndefOr[XRGeometryDetectorOptions] = js.undefined
  
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.undefined
}
object IWebXRMeshDetectorOptions {
  
  inline def apply(): IWebXRMeshDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRMeshDetectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRMeshDetectorOptions] (val x: Self) extends AnyVal {
    
    inline def setConvertCoordinateSystems(value: Boolean): Self = StObject.set(x, "convertCoordinateSystems", value.asInstanceOf[js.Any])
    
    inline def setConvertCoordinateSystemsUndefined: Self = StObject.set(x, "convertCoordinateSystems", js.undefined)
    
    inline def setDoNotRemoveMeshesOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemoveMeshesOnSessionEnded", value.asInstanceOf[js.Any])
    
    inline def setDoNotRemoveMeshesOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemoveMeshesOnSessionEnded", js.undefined)
    
    inline def setPreferredDetectorOptions(value: XRGeometryDetectorOptions): Self = StObject.set(x, "preferredDetectorOptions", value.asInstanceOf[js.Any])
    
    inline def setPreferredDetectorOptionsUndefined: Self = StObject.set(x, "preferredDetectorOptions", js.undefined)
    
    inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
    
    inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
  }
}
