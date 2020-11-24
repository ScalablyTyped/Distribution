package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ICreateCapsuleOptions
import typings.babylonjs.BABYLON.IPhysicsEnabledObject
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Flat
import typings.babylonjs.anon.H
import typings.babylonjs.anon.MaxMin
import typings.babylonjs.anon.SizeX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Mesh")
@js.native
class Mesh protected ()
  extends typings.babylonjs.BABYLON.Mesh {
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
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    parent: Nullable[typings.babylonjs.BABYLON.Node]
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Node]],
    source: Nullable[typings.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Node]],
    source: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Mesh]],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Node]],
    source: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Mesh]],
    doNotCloneChildren: js.UndefOr[scala.Nothing],
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Node]],
    source: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Mesh]],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.Mesh")
@js.native
object Mesh extends js.Object {
  
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  val BACKSIDE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on bottom
    */
  val BOTTOM: Double = js.native
  
  /**
    * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
    */
  val CAP_ALL: Double = js.native
  
  /**
    * Mesh cap setting : one cap at the end of the mesh
    */
  val CAP_END: Double = js.native
  
  /**
    * Mesh cap setting : one cap at the beginning of the mesh
    */
  val CAP_START: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles same on left/right or top/bottom
    */
  val CENTER: Double = js.native
  
  def Center(meshesOrMinMaxVector: js.Array[typings.babylonjs.BABYLON.AbstractMesh]): typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
    * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
    * @returns a vector3
    */
  def Center(meshesOrMinMaxVector: MaxMin): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Creates a box mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of each box side (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateBox(name: String, size: Double): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateBox(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateBox(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateBox(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateBox(name: String, size: Double, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = js.native
  
  /** Creates a Capsule Mesh
    * @param name defines the name of the mesh.
    * @param options the constructors options used to shape the mesh.
    * @param scene defines the scene the mesh is scoped to.
    * @returns the capsule mesh
    * @see https://doc.babylonjs.com/how_to/capsule_shape
    */
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  
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
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.Any,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.Any,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a dashed line mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param dashSize is the size of the dashes relatively the dash number (positive float, default 3)
    * @param gapSize is the size of the gap between two successive dashes relatively the dash number (positive float, default 1)
    * @param dashNb is the intended total number of dashes (positive integer, default 200)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines)
    * @returns a new Mesh
    */
  def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.LinesMesh
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    instance: typings.babylonjs.BABYLON.LinesMesh
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  
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
    name: String,
    sourceMesh: typings.babylonjs.BABYLON.AbstractMesh,
    position: typings.babylonjs.BABYLON.Vector3,
    normal: typings.babylonjs.BABYLON.Vector3,
    size: typings.babylonjs.BABYLON.Vector3,
    angle: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a plane polygonal mesh.  By default, this is a disc. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the radius size (float) of the polygon (default 0.5)
    * @param tessellation sets the number of polygon sides (positive integer, default 64). So a tessellation valued to 3 will build a triangle, to 4 a square, etc
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateDisc(name: String, radius: Double, tessellation: Double): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
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
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a ground mesh from a height map.
    * Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/babylon101/height_map
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
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    onReady: js.UndefOr[scala.Nothing],
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    onReady: js.Function1[/* mesh */ typings.babylonjs.BABYLON.GroundMesh, Unit]
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    onReady: js.Function1[/* mesh */ typings.babylonjs.BABYLON.GroundMesh, Unit],
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    onReady: js.UndefOr[scala.Nothing],
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    onReady: js.Function1[/* mesh */ typings.babylonjs.BABYLON.GroundMesh, Unit]
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    onReady: js.Function1[/* mesh */ typings.babylonjs.BABYLON.GroundMesh, Unit],
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = js.native
  
  /**
    * Creates a hemisphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  def CreateHemisphere(name: String, segments: Double, diameter: Double): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateHemisphere(name: String, segments: Double, diameter: Double, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
    * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
    * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value than `radius`)
    * * The parameter `subdivisions` sets the number of subdivisions (postive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
    * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @see https://doc.babylonjs.com/how_to/polyhedra_shapes#icosphere
    */
  def CreateIcoSphere(name: String, options: Flat, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  
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
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a line mesh. Please consider using the same method from the MeshBuilder class instead.
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines).
    * @returns a new Mesh
    */
  def CreateLines(name: String, points: js.Array[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    instance: Nullable[typings.babylonjs.BABYLON.LinesMesh]
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    instance: Nullable[typings.babylonjs.BABYLON.LinesMesh]
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  def CreateLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.LinesMesh = js.native
  
  /**
    * Creates a plane mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of both sides of the plane at once (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreatePlane(name: String, size: Double, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePlane(
    name: String,
    size: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePlane(name: String, size: Double, scene: typings.babylonjs.BABYLON.Scene, updatable: Boolean): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePlane(
    name: String,
    size: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a polygon mesh.Please consider using the same method from the MeshBuilder class instead
    * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh.
    * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors.
    * You can set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * Remember you can only change the shape positions, not their number when updating a polygon.
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    */
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]]
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a polyhedron mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * * The parameter `type` (positive integer, max 14, default 0) sets the polyhedron type to build among the 15 embbeded types. Please refer to the type sheet in the tutorial to choose the wanted type
    * * The parameter `size` (positive float, default 1) sets the polygon size
    * * You can overwrite the `size` on each dimension bu using the parameters `sizeX`, `sizeY` or `sizeZ` (positive floats, default to `size` value)
    * * You can build other polyhedron types than the 15 embbeded ones by setting the parameter `custom` (`polyhedronObject`, default null). If you set the parameter `custom`, this overwrittes the parameter `type`
    * * A `polyhedronObject` is a formatted javascript object. You'll find a full file with pre-set polyhedra here : https://github.com/BabylonJS/Extensions/tree/master/Polyhedron
    * * You can set the color and the UV of each side of the polyhedron with the parameters `faceColors` (Color4, default `(1, 1, 1, 1)`) and faceUV (Vector4, default `(0, 0, 1, 1)`)
    * * To understand how to set `faceUV` or `faceColors`, please read this by considering the right number of faces of your polyhedron, instead of only 6 for the box : https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * * The parameter `flat` (boolean, default true). If set to false, it gives the polyhedron a single global face, so less vertices and shared normals. In this case, `faceColors` and `faceUV` are ignored
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh to create
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  def CreatePolyhedron(name: String, options: SizeX, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a ribbon mesh. Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param pathArray is a required array of paths, what are each an array of successive Vector3. The pathArray parameter depicts the ribbon geometry.
    * @param closeArray creates a seam between the first and the last paths of the path array (default is false)
    * @param closePath creates a seam between the first and the last points of each path of the path array
    * @param offset is taken in account only if the `pathArray` is containing a single path
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance defines an instance of an existing Ribbon object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#ribbon)
    * @returns a new Mesh
    */
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a sphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateSphere(name: String, segments: Double, diameter: Double): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
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
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: H,
    precision: H,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: H,
    precision: H,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a torus mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param diameter sets the diameter size (float) of the torus (default 1)
    * @param thickness sets the diameter size of the tube of the torus (float, default 0.5)
    * @param tessellation sets the number of torus sides (postive integer, default 16)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
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
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates a tube mesh.
    * The tube is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param path is a required array of successive Vector3. It is the curve used as the axis of the tube
    * @param radius sets the tube radius size
    * @param tessellation is the number of sides on the tubular surface
    * @param radiusFunction is a custom function. If it is not null, it overwrittes the parameter `radius`. This function is called on each point of the tube path and is passed the index `i` of the i-th point and the distance of this point from the first point of the path
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing Tube object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#tube)
    * @returns a new Mesh
    */
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  val DEFAULTSIDE: Double = js.native
  
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  val DOUBLESIDE: Double = js.native
  
  /**
    * Creates an extruded polygon mesh, with depth in the Y direction. Please consider using the same method from the MeshBuilder class instead.
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param depth defines the height of extrusion
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    */
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]]
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates an extruded shape mesh.
    * The extrusion is a parametric shape. It has no predefined shape. Its final shape will depend on the input parameters. Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scale is the value to scale the shape
    * @param rotation is the angle value to rotate the shape each step (each path point), from the former step (so rotation added each step) along the curve
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Scene]],
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Creates an custom extruded shape mesh.
    * The custom extrusion is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scaleFunction is a custom Javascript function called on each path point
    * @param rotationFunction is a custom Javascript function called on each path point
    * @param ribbonCloseArray forces the extrusion underlying ribbon to close all the paths in its `pathArray`
    * @param ribbonClosePath forces the extrusion underlying ribbon to close its `pathArray`
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Mesh pattern setting : rotate pattern and rotate
    */
  val FLIP_N_ROTATE_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : flip and rotate alternate tiles on each row or column
    */
  val FLIP_N_ROTATE_TILE: Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) all tiles on alternate rows
    */
  val FLIP_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) alternate tiles on each row or column
    */
  val FLIP_TILE: Double = js.native
  
  /**
    * Mesh side orientation : usually the external or front surface
    */
  val FRONTSIDE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on left
    */
  val LEFT: Double = js.native
  
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes defines he vertices source.  They should all be of the same material.  Entries can empty
    * @param disposeSource when true (default), dispose of the vertices from the source meshes
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true
    * @param meshSubclass when set, vertices inserted into this Mesh.  Meshes can then be merged into a Mesh sub-class.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh to his subMesh array with meshes source.
    * @param multiMultiMaterials when true (false default), subdivide mesh and accept multiple multi materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  def MergeMeshes(meshes: js.Array[typings.babylonjs.BABYLON.Mesh]): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(meshes: js.Array[typings.babylonjs.BABYLON.Mesh], disposeSource: Boolean): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  
  /**
    * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
    * @param meshes defines the list of meshes to scan
    * @returns an object `{min:` Vector3`, max:` Vector3`}`
    */
  def MinMax(meshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh]): MaxMin = js.native
  
  /**
    * Mesh cap setting : no cap
    */
  val NO_CAP: Double = js.native
  
  /**
    * Mesh pattern setting : no flip or rotate
    */
  val NO_FLIP: Double = js.native
  
  /**
    * Returns a new Mesh object parsed from the source provided.
    * @param parsedMesh is the source
    * @param scene defines the hosting scene
    * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
    * @returns a new Mesh
    */
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Mesh tile positioning : part tiles on right
    */
  val RIGHT: Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) all tiles on alternate rows
    */
  val ROTATE_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) alternate tiles on each row or column
    */
  val ROTATE_TILE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on top
    */
  val TOP: Double = js.native
  
  /**
    * Gets the default side orientation.
    * @param orientation the orientation to value to attempt to get
    * @returns the default orientation
    * @hidden
    */
  def _GetDefaultSideOrientation(): Double = js.native
  def _GetDefaultSideOrientation(orientation: Double): Double = js.native
  
  /** @hidden */
  def _GroundMeshParser(parsedMesh: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = js.native
  
  /** @hidden */
  def _PhysicsImpostorParser(scene: typings.babylonjs.BABYLON.Scene, physicObject: IPhysicsEnabledObject, jsonObject: js.Any): typings.babylonjs.BABYLON.PhysicsImpostor = js.native
  
  /** @hidden */
  def _instancedMeshFactory(name: String, mesh: typings.babylonjs.BABYLON.Mesh): typings.babylonjs.BABYLON.InstancedMesh = js.native
}
