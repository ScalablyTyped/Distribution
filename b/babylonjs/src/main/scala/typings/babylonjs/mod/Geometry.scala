package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Geometry")
@js.native
class Geometry protected ()
  extends typings.babylonjs.legacyMod.Geometry {
  /**
    * Creates a new geometry
    * @param id defines the unique ID
    * @param scene defines the hosting scene
    * @param vertexData defines the VertexData used to get geometry data
    * @param updatable defines if geometry must be updatable (false by default)
    * @param mesh defines the mesh that will be associated with the geometry
    */
  def this(id: String, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    id: String,
    scene: typings.babylonjs.sceneMod.Scene,
    vertexData: typings.babylonjs.meshVertexDataMod.VertexData
  ) = this()
  def this(id: String, scene: typings.babylonjs.sceneMod.Scene, vertexData: Unit, updatable: Boolean) = this()
  def this(
    id: String,
    scene: typings.babylonjs.sceneMod.Scene,
    vertexData: typings.babylonjs.meshVertexDataMod.VertexData,
    updatable: Boolean
  ) = this()
  def this(
    id: String,
    scene: typings.babylonjs.sceneMod.Scene,
    vertexData: Unit,
    updatable: Boolean,
    mesh: Nullable[typings.babylonjs.meshMod.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typings.babylonjs.sceneMod.Scene,
    vertexData: Unit,
    updatable: Unit,
    mesh: Nullable[typings.babylonjs.meshMod.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typings.babylonjs.sceneMod.Scene,
    vertexData: typings.babylonjs.meshVertexDataMod.VertexData,
    updatable: Boolean,
    mesh: Nullable[typings.babylonjs.meshMod.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typings.babylonjs.sceneMod.Scene,
    vertexData: typings.babylonjs.meshVertexDataMod.VertexData,
    updatable: Unit,
    mesh: Nullable[typings.babylonjs.meshMod.Mesh]
  ) = this()
}
/* static members */
object Geometry {
  
  @JSImport("babylonjs", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static function used to attach a new empty geometry to a mesh
    * @param mesh defines the mesh to attach the geometry to
    * @returns the new Geometry
    */
  inline def CreateGeometryForMesh(mesh: typings.babylonjs.meshMod.Mesh): typings.babylonjs.geometryMod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeometryForMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.geometryMod.Geometry]
  
  /**
    * Extracts a clone of a mesh geometry
    * @param mesh defines the source mesh
    * @param id defines the unique ID of the new geometry object
    * @returns the new geometry object
    */
  inline def ExtractFromMesh(mesh: typings.babylonjs.meshMod.Mesh, id: String): Nullable[typings.babylonjs.geometryMod.Geometry] = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromMesh")(mesh.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.geometryMod.Geometry]]
  
  /**
    * Create a new geometry from persisted data (Using .babylon file format)
    * @param parsedVertexData defines the persisted data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url to use to load assets (like delayed data)
    * @returns the new geometry object
    */
  inline def Parse(parsedVertexData: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.geometryMod.Geometry] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedVertexData.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.geometryMod.Geometry]]
  
  /**
    * You should now use Tools.RandomId(), this method is still here for legacy reasons.
    * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
    * Be aware Math.random() could cause collisions, but:
    * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
    * @returns a string containing a new GUID
    */
  inline def RandomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomId")().asInstanceOf[String]
  
  @JSImport("babylonjs", "Geometry._CleanMatricesWeights")
  @js.native
  def _CleanMatricesWeights: js.Any = js.native
  inline def _CleanMatricesWeights_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CleanMatricesWeights")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  inline def _ImportGeometry(parsedGeometry: js.Any, mesh: typings.babylonjs.meshMod.Mesh): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ImportGeometry")(parsedGeometry.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
