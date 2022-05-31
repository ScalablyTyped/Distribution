package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonMeshBuilder extends StObject {
  
  /* private */ var _addToepoint: js.Any = js.native
  
  /* private */ var _eholes: js.Any = js.native
  
  /* private */ var _epoints: js.Any = js.native
  
  /* private */ var _holes: js.Any = js.native
  
  /* private */ var _name: js.Any = js.native
  
  /* private */ var _outlinepoints: js.Any = js.native
  
  /* private */ var _points: js.Any = js.native
  
  /* private */ var _scene: js.Any = js.native
  
  /**
    * Adds a whole within the polygon
    * @param hole Array of points defining the hole
    * @returns this
    */
  def addHole(hole: js.Array[Vector2]): PolygonMeshBuilder = js.native
  
  /**
    * Adds a side to the polygon
    * @param positions points that make the polygon
    * @param normals normals of the polygon
    * @param uvs uvs of the polygon
    * @param indices indices of the polygon
    * @param bounds bounds of the polygon
    * @param points points of the polygon
    * @param depth depth of the polygon
    * @param flip flip of the polygon
    */
  /* private */ var addSide: js.Any = js.native
  
  /**
    * Babylon reference to the earcut plugin.
    */
  var bjsEarcut: js.Any = js.native
  
  /**
    * Creates the polygon
    * @param updatable If the mesh should be updatable
    * @param depth The depth of the mesh created
    * @returns the created mesh
    */
  def build(): Mesh = js.native
  def build(updatable: Boolean): Mesh = js.native
  def build(updatable: Boolean, depth: Double): Mesh = js.native
  def build(updatable: Unit, depth: Double): Mesh = js.native
  
  /**
    * Creates the polygon
    * @param depth The depth of the mesh created
    * @returns the created VertexData
    */
  def buildVertexData(): VertexData = js.native
  def buildVertexData(depth: Double): VertexData = js.native
}
