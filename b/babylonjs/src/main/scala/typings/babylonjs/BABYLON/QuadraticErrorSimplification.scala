package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuadraticErrorSimplification
  extends StObject
     with ISimplifier {
  
  /* private */ var _calculateError: Any = js.native
  
  /* private */ var _identifyBorder: Any = js.native
  
  /* private */ var _init: Any = js.native
  
  /* private */ var _initDecimatedMesh: Any = js.native
  
  /* private */ var _initWithMesh: Any = js.native
  
  /* private */ var _isFlipped: Any = js.native
  
  /* private */ var _mesh: Any = js.native
  
  /* private */ var _reconstructMesh: Any = js.native
  
  /* private */ var _reconstructedMesh: Any = js.native
  
  /* private */ var _references: Any = js.native
  
  /* private */ var _runDecimation: Any = js.native
  
  /* private */ var _triangles: Any = js.native
  
  /* private */ var _updateMesh: Any = js.native
  
  /* private */ var _updateTriangles: Any = js.native
  
  /* private */ var _vertexError: Any = js.native
  
  /* private */ var _vertices: Any = js.native
  
  /** Gets or sets the aggressiveness of the simplifier */
  var aggressiveness: Double = js.native
  
  /** Gets or sets the espilon to use for bounding box computation */
  var boundingBoxEpsilon: Double = js.native
  
  /** Gets or sets the number of allowed iterations for decimation */
  var decimationIterations: Double = js.native
  
  /** Gets or sets the number pf sync iterations */
  var syncIterations: Double = js.native
}
