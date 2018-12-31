package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to represent renderable models
  */
@JSImport("babylonjs", "Mesh")
@js.native
class Mesh protected ()
  extends babylonjsLib.BABYLONNs.Mesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param scene The scene to add this mesh to.
    * @param parent The parent of this mesh, if it has one
    * @param source An optional Mesh from which geometry is shared, cloned.
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    *                  When false, achieved by calling a clone(), also passing False.
    *                  This will make creation of children, recursive.
    * @param clonePhysicsImpostor When cloning, include cloning mesh physics impostor, default True.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], parent: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Node]) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], parent: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Node], source: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], parent: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Node], source: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh], doNotCloneChildren: scala.Boolean) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], parent: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Node], source: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh], doNotCloneChildren: scala.Boolean, clonePhysicsImpostor: scala.Boolean) = this()
}

/**
  * Class used to represent renderable models
  */
@JSImport("babylonjs", "Mesh")
@js.native
object Mesh extends js.Object {
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  val BACKSIDE: scala.Double = js.native
  /**
    * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
    */
  val CAP_ALL: scala.Double = js.native
  /**
    * Mesh cap setting : one cap at the end of the mesh
    */
  val CAP_END: scala.Double = js.native
  /**
    * Mesh cap setting : one cap at the beginning of the mesh
    */
  val CAP_START: scala.Double = js.native
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  val DEFAULTSIDE: scala.Double = js.native
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  val DOUBLESIDE: scala.Double = js.native
  /**
    * Mesh side orientation : usually the external or front surface
    */
  val FRONTSIDE: scala.Double = js.native
  /**
    * Mesh cap setting : no cap
    */
  val NO_CAP: scala.Double = js.native
  /**
    * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
    * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
    * @returns a vector3
    */
  def Center(meshesOrMinMaxVector: babylonjsLib.Anon_Max): babylonjsLib.BABYLONNs.Vector3 = js.native
  def Center(meshesOrMinMaxVector: js.Array[babylonjsLib.BABYLONNs.AbstractMesh]): babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Creates a box mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of each box side (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateBox(name: java.lang.String, size: scala.Double): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateBox(
    name: java.lang.String,
    size: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateBox(
    name: java.lang.String,
    size: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateBox(
    name: java.lang.String,
    size: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a cylinder or a cone mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param height sets the height size (float) of the cylinder/cone (float, default 2)
    * @param diameterTop set the top cap diameter (floats, default 1)
    * @param diameterBottom set the bottom cap diameter (floats, default 1). This value can't be zero
    * @param tessellation sets the number of cylinder sides (positive integer, default 24). Set it to 3 to get a prism for instance
    * @param subdivisions sets the number of rings along the cylinder height (positive integer, default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateCylinder(
    name: java.lang.String,
    height: scala.Double,
    diameterTop: scala.Double,
    diameterBottom: scala.Double,
    tessellation: scala.Double,
    subdivisions: js.Any
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateCylinder(
    name: java.lang.String,
    height: scala.Double,
    diameterTop: scala.Double,
    diameterBottom: scala.Double,
    tessellation: scala.Double,
    subdivisions: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateCylinder(
    name: java.lang.String,
    height: scala.Double,
    diameterTop: scala.Double,
    diameterBottom: scala.Double,
    tessellation: scala.Double,
    subdivisions: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: js.Any
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateCylinder(
    name: java.lang.String,
    height: scala.Double,
    diameterTop: scala.Double,
    diameterBottom: scala.Double,
    tessellation: scala.Double,
    subdivisions: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: js.Any,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a dashed line mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param dashSize is the size of the dashes relatively the dash number (positive float, default 3)
    * @param gapSize is the size of the gap between two successive dashes relatively the dash number (positive float, default 1)
    * @param dashNb is the intended total number of dashes (positive integer, default 200)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines)
    * @returns a new Mesh
    */
  def CreateDashedLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    dashSize: scala.Double,
    gapSize: scala.Double,
    dashNb: scala.Double
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  def CreateDashedLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    dashSize: scala.Double,
    gapSize: scala.Double,
    dashNb: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  def CreateDashedLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    dashSize: scala.Double,
    gapSize: scala.Double,
    dashNb: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  def CreateDashedLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    dashSize: scala.Double,
    gapSize: scala.Double,
    dashNb: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean,
    instance: babylonjsLib.BABYLONNs.LinesMesh
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  /**
    * Creates a decal mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * A decal is a mesh usually applied as a model onto the surface of another mesh
    * @param name  defines the name of the mesh
    * @param sourceMesh defines the mesh receiving the decal
    * @param position sets the position of the decal in world coordinates
    * @param normal sets the normal of the mesh where the decal is applied onto in world coordinates
    * @param size sets the decal scaling
    * @param angle sets the angle to rotate the decal
    * @returns a new Mesh
    */
  def CreateDecal(
    name: java.lang.String,
    sourceMesh: babylonjsLib.BABYLONNs.AbstractMesh,
    position: babylonjsLib.BABYLONNs.Vector3,
    normal: babylonjsLib.BABYLONNs.Vector3,
    size: babylonjsLib.BABYLONNs.Vector3,
    angle: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a plane polygonal mesh.  By default, this is a disc. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the radius size (float) of the polygon (default 0.5)
    * @param tessellation sets the number of polygon sides (positive integer, default 64). So a tessellation valued to 3 will build a triangle, to 4 a square, etc
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateDisc(name: java.lang.String, radius: scala.Double, tessellation: scala.Double): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateDisc(
    name: java.lang.String,
    radius: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateDisc(
    name: java.lang.String,
    radius: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateDisc(
    name: java.lang.String,
    radius: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a ground mesh.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param width set the width of the ground
    * @param height set the height of the ground
    * @param subdivisions sets the number of subdivisions per side
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    */
  def CreateGround(name: java.lang.String, width: scala.Double, height: scala.Double, subdivisions: scala.Double): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateGround(
    name: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    subdivisions: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateGround(
    name: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    subdivisions: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a ground mesh from a height map.
    * Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/babylon101/height_map
    * @param name defines the name of the mesh to create
    * @param url sets the URL of the height map image resource
    * @param width set the ground width size
    * @param height set the ground height size
    * @param subdivisions sets the number of subdivision per side
    * @param minHeight is the minimum altitude on the ground
    * @param maxHeight is the maximum altitude on the ground
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param onReady  is a callback function that will be called  once the mesh is built (the height map download can last some time)
    * @param alphaFilter will filter any data where the alpha channel is below this value, defaults 0 (all data visible)
    * @returns a new Mesh
    */
  def CreateGroundFromHeightMap(
    name: java.lang.String,
    url: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    subdivisions: scala.Double,
    minHeight: scala.Double,
    maxHeight: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: java.lang.String,
    url: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    subdivisions: scala.Double,
    minHeight: scala.Double,
    maxHeight: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: java.lang.String,
    url: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    subdivisions: scala.Double,
    minHeight: scala.Double,
    maxHeight: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    onReady: js.Function1[/* mesh */ babylonjsLib.BABYLONNs.GroundMesh, scala.Unit]
  ): babylonjsLib.BABYLONNs.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: java.lang.String,
    url: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    subdivisions: scala.Double,
    minHeight: scala.Double,
    maxHeight: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    onReady: js.Function1[/* mesh */ babylonjsLib.BABYLONNs.GroundMesh, scala.Unit],
    alphaFilter: scala.Double
  ): babylonjsLib.BABYLONNs.GroundMesh = js.native
  /**
    * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
    * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
    * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value than `radius`)
    * * The parameter `subdivisions` sets the number of subdivisions (postive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
    * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @see http://doc.babylonjs.com/how_to/polyhedra_shapes#icosphere
    */
  def CreateIcoSphere(
    name: java.lang.String,
    options: babylonjsLib.Anon_Subdivisions,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates lathe mesh.
    * The lathe is a shape with a symetry axis : a 2D model shape is rotated around this axis to design the lathe.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be rotated in its local space : the shape must be designed in the xOy plane and will be rotated around the Y axis. It's usually a 2D shape, so the Vector3 z coordinates are often set to zero
    * @param radius is the radius value of the lathe
    * @param tessellation is the side number of the lathe.
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateLathe(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateLathe(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateLathe(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a line mesh. Please consider using the same method from the MeshBuilder class instead.
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines).
    * @returns a new Mesh
    */
  def CreateLines(name: java.lang.String, points: js.Array[babylonjsLib.BABYLONNs.Vector3]): babylonjsLib.BABYLONNs.LinesMesh = js.native
  def CreateLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  def CreateLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  def CreateLines(
    name: java.lang.String,
    points: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean,
    instance: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.LinesMesh]
  ): babylonjsLib.BABYLONNs.LinesMesh = js.native
  /**
    * Creates a plane mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of both sides of the plane at once (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreatePlane(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreatePlane(
    name: java.lang.String,
    size: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreatePlane(
    name: java.lang.String,
    size: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a polygon mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh.
    * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors.
    * You can set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * Remember you can only change the shape positions, not their number when updating a polygon.
    */
  /**
    * Creates a polygon mesh.Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreatePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreatePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Scene,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]]
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreatePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Scene,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreatePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scene: babylonjsLib.BABYLONNs.Scene,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a polyhedron mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * * The parameter `type` (positive integer, max 14, default 0) sets the polyhedron type to build among the 15 embbeded types. Please refer to the type sheet in the tutorial to choose the wanted type
    * * The parameter `size` (positive float, default 1) sets the polygon size
    * * You can overwrite the `size` on each dimension bu using the parameters `sizeX`, `sizeY` or `sizeZ` (positive floats, default to `size` value)
    * * You can build other polyhedron types than the 15 embbeded ones by setting the parameter `custom` (`polyhedronObject`, default null). If you set the parameter `custom`, this overwrittes the parameter `type`
    * * A `polyhedronObject` is a formatted javascript object. You'll find a full file with pre-set polyhedra here : https://github.com/BabylonJS/Extensions/tree/master/Polyhedron
    * * You can set the color and the UV of each side of the polyhedron with the parameters `faceColors` (Color4, default `(1, 1, 1, 1)`) and faceUV (Vector4, default `(0, 0, 1, 1)`)
    * * To understand how to set `faceUV` or `faceColors`, please read this by considering the right number of faces of your polyhedron, instead of only 6 for the box : http://doc.babylonjs.com/tutorials/CreateBox_Per_Face_Textures_And_Colors
    * * The parameter `flat` (boolean, default true). If set to false, it gives the polyhedron a single global face, so less vertices and shared normals. In this case, `faceColors` and `faceUV` are ignored
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh to create
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  def CreatePolyhedron(name: java.lang.String, options: babylonjsLib.Anon_SizeZ, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: js.UndefOr[scala.Nothing],
    closePath: scala.Boolean,
    offset: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: js.UndefOr[scala.Nothing],
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: js.UndefOr[scala.Nothing],
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: js.UndefOr[scala.Nothing],
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: js.UndefOr[scala.Nothing],
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double,
    instance: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a ribbon mesh. Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param pathArray is a required array of paths, what are each an array of successive Vector3. The pathArray parameter depicts the ribbon geometry.
    * @param closeArray creates a seam between the first and the last paths of the path array (default is false)
    * @param closePath creates a seam between the first and the last points of each path of the path array
    * @param offset is taken in account only if the `pathArray` is containing a single path
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance defines an instance of an existing Ribbon object to be updated with the passed `pathArray` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#ribbon)
    * @returns a new Mesh
    */
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: scala.Boolean,
    closePath: scala.Boolean,
    offset: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: scala.Boolean,
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: scala.Boolean,
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: scala.Boolean,
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateRibbon(
    name: java.lang.String,
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    closeArray: scala.Boolean,
    closePath: scala.Boolean,
    offset: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double,
    instance: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a sphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateSphere(name: java.lang.String, segments: scala.Double, diameter: scala.Double): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateSphere(
    name: java.lang.String,
    segments: scala.Double,
    diameter: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateSphere(
    name: java.lang.String,
    segments: scala.Double,
    diameter: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateSphere(
    name: java.lang.String,
    segments: scala.Double,
    diameter: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a tiled ground mesh.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param xmin set the ground minimum X coordinate
    * @param zmin set the ground minimum Y coordinate
    * @param xmax set the ground maximum X coordinate
    * @param zmax set the ground maximum Z coordinate
    * @param subdivisions is an object `{w: positive integer, h: positive integer}` (default `{w: 6, h: 6}`). `w` and `h` are the numbers of subdivisions on the ground width and height. Each subdivision is called a tile
    * @param precision is an object `{w: positive integer, h: positive integer}` (default `{w: 2, h: 2}`). `w` and `h` are the numbers of subdivisions on the ground width and height of each tile
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    */
  def CreateTiledGround(
    name: java.lang.String,
    xmin: scala.Double,
    zmin: scala.Double,
    xmax: scala.Double,
    zmax: scala.Double,
    subdivisions: babylonjsLib.Anon_W,
    precision: babylonjsLib.Anon_W,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTiledGround(
    name: java.lang.String,
    xmin: scala.Double,
    zmin: scala.Double,
    xmax: scala.Double,
    zmax: scala.Double,
    subdivisions: babylonjsLib.Anon_W,
    precision: babylonjsLib.Anon_W,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a torus mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param diameter sets the diameter size (float) of the torus (default 1)
    * @param thickness sets the diameter size of the tube of the torus (float, default 0.5)
    * @param tessellation sets the number of torus sides (postive integer, default 16)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateTorus(
    name: java.lang.String,
    diameter: scala.Double,
    thickness: scala.Double,
    tessellation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTorus(
    name: java.lang.String,
    diameter: scala.Double,
    thickness: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTorus(
    name: java.lang.String,
    diameter: scala.Double,
    thickness: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTorus(
    name: java.lang.String,
    diameter: scala.Double,
    thickness: scala.Double,
    tessellation: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a torus knot mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the global radius size (float) of the torus knot (default 2)
    * @param tube sets the diameter size of the tube of the torus (float, default 0.5)
    * @param radialSegments sets the number of sides on each tube segments (positive integer, default 32)
    * @param tubularSegments sets the number of tubes to decompose the knot into (positive integer, default 32)
    * @param p the number of windings on X axis (positive integers, default 2)
    * @param q the number of windings on Y axis (positive integers, default 3)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateTorusKnot(
    name: java.lang.String,
    radius: scala.Double,
    tube: scala.Double,
    radialSegments: scala.Double,
    tubularSegments: scala.Double,
    p: scala.Double,
    q: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTorusKnot(
    name: java.lang.String,
    radius: scala.Double,
    tube: scala.Double,
    radialSegments: scala.Double,
    tubularSegments: scala.Double,
    p: scala.Double,
    q: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTorusKnot(
    name: java.lang.String,
    radius: scala.Double,
    tube: scala.Double,
    radialSegments: scala.Double,
    tubularSegments: scala.Double,
    p: scala.Double,
    q: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTorusKnot(
    name: java.lang.String,
    radius: scala.Double,
    tube: scala.Double,
    radialSegments: scala.Double,
    tubularSegments: scala.Double,
    p: scala.Double,
    q: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates a tube mesh.
    * The tube is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param path is a required array of successive Vector3. It is the curve used as the axis of the tube
    * @param radius sets the tube radius size
    * @param tessellation is the number of sides on the tubular surface
    * @param radiusFunction is a custom function. If it is not null, it overwrittes the parameter `radius`. This function is called on each point of the tube path and is passed the index `i` of the i-th point and the distance of this point from the first point of the path
    * @param cap sets the way the extruded shape is capped. Possible values : BABYLON.Mesh.NO_CAP (default), BABYLON.Mesh.CAP_START, BABYLON.Mesh.CAP_END, BABYLON.Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing Tube object to be updated with the passed `pathArray` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#tube)
    * @returns a new Mesh
    */
  def CreateTube(
    name: java.lang.String,
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    radiusFunction: babylonjsLib.Anon_I,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTube(
    name: java.lang.String,
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    radiusFunction: babylonjsLib.Anon_I,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTube(
    name: java.lang.String,
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    radiusFunction: babylonjsLib.Anon_I,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def CreateTube(
    name: java.lang.String,
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    radius: scala.Double,
    tessellation: scala.Double,
    radiusFunction: babylonjsLib.Anon_I,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double,
    instance: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates an extruded polygon mesh, with depth in the Y direction. Please consider using the same method from the MeshBuilder class instead.
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#extruded-non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param depth defines the height of extrusion
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def ExtrudePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    depth: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    depth: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]]
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    depth: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudePolygon(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    depth: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    holes: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates an extruded shape mesh.
    * The extrusion is a parametric shape. It has no predefined shape. Its final shape will depend on the input parameters. Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scale is the value to scale the shape
    * @param rotation is the angle value to rotate the shape each step (each path point), from the former step (so rotation added each step) along the curve
    * @param cap sets the way the extruded shape is capped. Possible values : BABYLON.Mesh.NO_CAP (default), BABYLON.Mesh.CAP_START, BABYLON.Mesh.CAP_END, BABYLON.Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  def ExtrudeShape(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scale: scala.Double,
    rotation: scala.Double,
    cap: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShape(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scale: scala.Double,
    rotation: scala.Double,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShape(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scale: scala.Double,
    rotation: scala.Double,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShape(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scale: scala.Double,
    rotation: scala.Double,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShape(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scale: scala.Double,
    rotation: scala.Double,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    updatable: scala.Boolean,
    sideOrientation: scala.Double,
    instance: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Creates an custom extruded shape mesh.
    * The custom extrusion is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scaleFunction is a custom Javascript function called on each path point
    * @param rotationFunction is a custom Javascript function called on each path point
    * @param ribbonCloseArray forces the extrusion underlying ribbon to close all the paths in its `pathArray`
    * @param ribbonClosePath forces the extrusion underlying ribbon to close its `pathArray`
    * @param cap sets the way the extruded shape is capped. Possible values : BABYLON.Mesh.NO_CAP (default), BABYLON.Mesh.CAP_START, BABYLON.Mesh.CAP_END, BABYLON.Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  def ExtrudeShapeCustom(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: scala.Boolean,
    ribbonClosePath: scala.Boolean,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShapeCustom(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: scala.Boolean,
    ribbonClosePath: scala.Boolean,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShapeCustom(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: scala.Boolean,
    ribbonClosePath: scala.Boolean,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  def ExtrudeShapeCustom(
    name: java.lang.String,
    shape: js.Array[babylonjsLib.BABYLONNs.Vector3],
    path: js.Array[babylonjsLib.BABYLONNs.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: scala.Boolean,
    ribbonClosePath: scala.Boolean,
    cap: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    updatable: scala.Boolean,
    sideOrientation: scala.Double,
    instance: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.Mesh = js.native
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes defines he vertices source.  They should all be of the same material.  Entries can empty
    * @param disposeSource when true (default), dispose of the vertices from the source meshes
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true
    * @param meshSubclass when set, vertices inserted into this Mesh.  Meshes can then be merged into a Mesh sub-class.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh to his subMesh array with meshes source.
    * @returns a new mesh
    */
  def MergeMeshes(meshes: js.Array[babylonjsLib.BABYLONNs.Mesh]): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh] = js.native
  def MergeMeshes(meshes: js.Array[babylonjsLib.BABYLONNs.Mesh], disposeSource: scala.Boolean): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[babylonjsLib.BABYLONNs.Mesh],
    disposeSource: scala.Boolean,
    allow32BitsIndices: scala.Boolean
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[babylonjsLib.BABYLONNs.Mesh],
    disposeSource: scala.Boolean,
    allow32BitsIndices: scala.Boolean,
    meshSubclass: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[babylonjsLib.BABYLONNs.Mesh],
    disposeSource: scala.Boolean,
    allow32BitsIndices: scala.Boolean,
    meshSubclass: babylonjsLib.BABYLONNs.Mesh,
    subdivideWithSubMeshes: scala.Boolean
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh] = js.native
  /**
    * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
    * @param meshes defines the list of meshes to scan
    * @returns an object `{min:` Vector3`, max:` Vector3`}`
    */
  def MinMax(meshes: js.Array[babylonjsLib.BABYLONNs.AbstractMesh]): babylonjsLib.Anon_Max = js.native
  /**
    * Returns a new Mesh object parsed from the source provided.
    * @param parsedMesh is the source
    * @param scene defines the hosting scene
    * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
    * @returns a new Mesh
    */
  def Parse(parsedMesh: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Mesh = js.native
}

