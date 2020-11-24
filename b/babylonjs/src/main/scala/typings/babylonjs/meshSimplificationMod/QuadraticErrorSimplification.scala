package typings.babylonjs.meshSimplificationMod

import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/meshSimplification", "QuadraticErrorSimplification")
@js.native
class QuadraticErrorSimplification protected () extends ISimplifier {
  /**
    * Creates a new QuadraticErrorSimplification
    * @param _mesh defines the target mesh
    */
  def this(_mesh: Mesh) = this()
  
  var _mesh: js.Any = js.native
  
  var _reconstructedMesh: js.Any = js.native
  
  /** Gets or sets the aggressiveness of the simplifier */
  var aggressiveness: Double = js.native
  
  /** Gets or sets the espilon to use for bounding box computation */
  var boundingBoxEpsilon: Double = js.native
  
  var calculateError: js.Any = js.native
  
  /** Gets or sets the number of allowed iterations for decimation */
  var decimationIterations: Double = js.native
  
  var identifyBorder: js.Any = js.native
  
  var init: js.Any = js.native
  
  var initDecimatedMesh: js.Any = js.native
  
  var initWithMesh: js.Any = js.native
  
  var isFlipped: js.Any = js.native
  
  var reconstructMesh: js.Any = js.native
  
  var references: js.Any = js.native
  
  var runDecimation: js.Any = js.native
  
  /** Gets or sets the number pf sync interations */
  var syncIterations: Double = js.native
  
  var triangles: js.Any = js.native
  
  var updateMesh: js.Any = js.native
  
  var updateTriangles: js.Any = js.native
  
  var vertexError: js.Any = js.native
  
  var vertices: js.Any = js.native
}
