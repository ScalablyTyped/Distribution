package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store geometry data (vertex buffers + index buffer)
     */
@JSImport("babylonjs", "Geometry")
@js.native
class Geometry protected ()
  extends babylonjsLib.BABYLONNs.Geometry {
  /**
           * Creates a new geometry
           * @param id defines the unique ID
           * @param scene defines the hosting scene
           * @param vertexData defines the VertexData used to get geometry data
           * @param updatable defines if geometry must be updatable (false by default)
           * @param mesh defines the mesh that will be associated with the geometry
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a new geometry
           * @param id defines the unique ID
           * @param scene defines the hosting scene
           * @param vertexData defines the VertexData used to get geometry data
           * @param updatable defines if geometry must be updatable (false by default)
           * @param mesh defines the mesh that will be associated with the geometry
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, vertexData: babylonjsLib.BABYLONNs.VertexData) = this()
  /**
           * Creates a new geometry
           * @param id defines the unique ID
           * @param scene defines the hosting scene
           * @param vertexData defines the VertexData used to get geometry data
           * @param updatable defines if geometry must be updatable (false by default)
           * @param mesh defines the mesh that will be associated with the geometry
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, vertexData: babylonjsLib.BABYLONNs.VertexData, updatable: scala.Boolean) = this()
  /**
           * Creates a new geometry
           * @param id defines the unique ID
           * @param scene defines the hosting scene
           * @param vertexData defines the VertexData used to get geometry data
           * @param updatable defines if geometry must be updatable (false by default)
           * @param mesh defines the mesh that will be associated with the geometry
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, vertexData: babylonjsLib.BABYLONNs.VertexData, updatable: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
}

/**
     * Class used to store geometry data (vertex buffers + index buffer)
     */
@JSImport("babylonjs", "Geometry")
@js.native
object Geometry extends js.Object {
  var _CleanMatricesWeights: js.Any = js.native
  /**
           * Static function used to attach a new empty geometry to a mesh
           * @param mesh defines the mesh to attach the geometry to
           * @returns the new Geometry
           */
  def CreateGeometryForMesh(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.Geometry = js.native
  /**
           * Extracts a clone of a mesh geometry
           * @param mesh defines the source mesh
           * @param id defines the unique ID of the new geometry object
           * @returns the new geometry object
           */
  def ExtractFromMesh(mesh: babylonjsLib.BABYLONNs.Mesh, id: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Geometry] = js.native
  /**
           * Create a new geometry from persisted data (Using .babylon file format)
           * @param parsedVertexData defines the persisted data
           * @param scene defines the hosting scene
           * @param rootUrl defines the root url to use to load assets (like delayed data)
           * @returns the new geometry object
           */
  def Parse(parsedVertexData: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Geometry] = js.native
  /**
           * You should now use Tools.RandomId(), this method is still here for legacy reasons.
           * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
           * Be aware Math.random() could cause collisions, but:
           * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
           * @returns a string containing a new GUID
           */
  def RandomId(): java.lang.String = js.native
  /** @hidden */
  def _ImportGeometry(parsedGeometry: js.Any, mesh: babylonjsLib.BABYLONNs.Mesh): scala.Unit = js.native
}

