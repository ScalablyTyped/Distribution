package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRMeshDetector
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _detectedMeshes: Any = js.native
  
  /* private */ var _init: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _updateVertexDataWithXRMesh: Any = js.native
  
  /**
    * Observers registered here will be executed when a new mesh was added to the session
    */
  var onMeshAddedObservable: Observable[IWebXRVertexData] = js.native
  
  /**
    * Observers registered here will be executed when a mesh is no longer detected in the session
    */
  var onMeshRemovedObservable: Observable[IWebXRVertexData] = js.native
  
  /**
    * Observers registered here will be executed when an existing mesh updates
    */
  var onMeshUpdatedObservable: Observable[IWebXRVertexData] = js.native
}
