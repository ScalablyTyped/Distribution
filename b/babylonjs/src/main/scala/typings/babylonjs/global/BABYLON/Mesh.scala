package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.ICreateCapsuleOptions
import typings.babylonjs.BABYLON.IPhysicsEnabledObject
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.CustomFaceColors
import typings.babylonjs.anon.FlatRadius
import typings.babylonjs.anon.H
import typings.babylonjs.anon.MaxMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Mesh")
@js.native
open class Mesh protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Mesh {
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
  def this(name: String, scene: Unit, parent: Nullable[typings.babylonjs.BABYLON.Node]) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node]
  ) = this()
  def this(name: String, scene: Unit, parent: Unit, source: Nullable[typings.babylonjs.BABYLON.Mesh]) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(name: String, scene: Unit, parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Unit,
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Unit,
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    parent: Nullable[typings.babylonjs.BABYLON.Node],
    source: Nullable[typings.babylonjs.BABYLON.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this checks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
/* static members */
object Mesh {
  
  @JSGlobal("BABYLON.Mesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  @JSGlobal("BABYLON.Mesh.BACKSIDE")
  @js.native
  val BACKSIDE: /* 1 */ Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on bottom
    */
  @JSGlobal("BABYLON.Mesh.BOTTOM")
  @js.native
  val BOTTOM: /* 4 */ Double = js.native
  
  /**
    * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
    */
  @JSGlobal("BABYLON.Mesh.CAP_ALL")
  @js.native
  val CAP_ALL: /* 3 */ Double = js.native
  
  /**
    * Mesh cap setting : one cap at the end of the mesh
    */
  @JSGlobal("BABYLON.Mesh.CAP_END")
  @js.native
  val CAP_END: /* 2 */ Double = js.native
  
  /**
    * Mesh cap setting : one cap at the beginning of the mesh
    */
  @JSGlobal("BABYLON.Mesh.CAP_START")
  @js.native
  val CAP_START: /* 1 */ Double = js.native
  
  /**
    * Mesh tile positioning : part tiles same on left/right or top/bottom
    */
  @JSGlobal("BABYLON.Mesh.CENTER")
  @js.native
  val CENTER: /* 0 */ Double = js.native
  
  inline def Center(meshesOrMinMaxVector: js.Array[typings.babylonjs.BABYLON.AbstractMesh]): typings.babylonjs.BABYLON.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Center")(meshesOrMinMaxVector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Vector3]
  /**
    * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
    * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
    * @returns a vector3
    */
  inline def Center(meshesOrMinMaxVector: MaxMin): typings.babylonjs.BABYLON.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Center")(meshesOrMinMaxVector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Vector3]
  
  /**
    * Creates a box mesh.
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of each box side (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateBox(name: String, size: Double, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, size: Double, scene: Nullable[typings.babylonjs.BABYLON.Scene], updatable: Boolean): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateBox(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /** Creates a Capsule Mesh
    * @param name defines the name of the mesh.
    * @param options the constructors options used to shape the mesh.
    * @param scene defines the scene the mesh is scoped to.
    * @returns the capsule mesh
    * @see https://doc.babylonjs.com/how_to/capsule_shape
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a cylinder or a cone mesh.
    * @param name defines the name of the mesh to create
    * @param height sets the height size (float) of the cylinder/cone (float, default 2)
    * @param diameterTop set the top cap diameter (floats, default 1)
    * @param diameterBottom set the bottom cap diameter (floats, default 1). This value can't be zero
    * @param tessellation sets the number of cylinder sides (positive integer, default 24). Set it to 3 to get a prism for instance
    * @param subdivisions sets the number of rings along the cylinder height (positive integer, default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: Unit,
    updatable: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: Unit,
    updatable: Any,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Any,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: Any,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], height.asInstanceOf[js.Any], diameterTop.asInstanceOf[js.Any], diameterBottom.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a dashed line mesh.
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param dashSize is the size of the dashes relatively the dash number (positive float, default 3)
    * @param gapSize is the size of the gap between two successive dashes relatively the dash number (positive float, default 1)
    * @param dashNb is the intended total number of dashes (positive integer, default 200)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], points.asInstanceOf[js.Any], dashSize.asInstanceOf[js.Any], gapSize.asInstanceOf[js.Any], dashNb.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], points.asInstanceOf[js.Any], dashSize.asInstanceOf[js.Any], gapSize.asInstanceOf[js.Any], dashNb.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    instance: typings.babylonjs.BABYLON.LinesMesh
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], points.asInstanceOf[js.Any], dashSize.asInstanceOf[js.Any], gapSize.asInstanceOf[js.Any], dashNb.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Unit,
    instance: typings.babylonjs.BABYLON.LinesMesh
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], points.asInstanceOf[js.Any], dashSize.asInstanceOf[js.Any], gapSize.asInstanceOf[js.Any], dashNb.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  
  /**
    * Creates a decal mesh.
    *.
    * A decal is a mesh usually applied as a model onto the surface of another mesh
    * @param name  defines the name of the mesh
    * @param sourceMesh defines the mesh receiving the decal
    * @param position sets the position of the decal in world coordinates
    * @param normal sets the normal of the mesh where the decal is applied onto in world coordinates
    * @param size sets the decal scaling
    * @param angle sets the angle to rotate the decal
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateDecal(
    name: String,
    sourceMesh: typings.babylonjs.BABYLON.AbstractMesh,
    position: typings.babylonjs.BABYLON.Vector3,
    normal: typings.babylonjs.BABYLON.Vector3,
    size: typings.babylonjs.BABYLON.Vector3,
    angle: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], position.asInstanceOf[js.Any], normal.asInstanceOf[js.Any], size.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a plane polygonal mesh.  By default, this is a disc.
    * @param name defines the name of the mesh to create
    * @param radius sets the radius size (float) of the polygon (default 0.5)
    * @param tessellation sets the number of polygon sides (positive integer, default 64). So a tessellation valued to 3 will build a triangle, to 4 a square, etc
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a ground mesh.
    * @param name defines the name of the mesh to create
    * @param width set the width of the ground
    * @param height set the height of the ground
    * @param subdivisions sets the number of subdivisions per side
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateGround(name: String, width: Double, height: Double, subdivisions: Double): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateGround(name: String, width: Double, height: Double, subdivisions: Double, scene: Unit, updatable: Boolean): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a ground mesh from a height map.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set/height_map
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
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
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
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
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
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], alphaFilter.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    onReady: Unit,
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], alphaFilter.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    onReady: js.Function1[/* mesh */ typings.babylonjs.BABYLON.GroundMesh, Unit]
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    onReady: js.Function1[/* mesh */ typings.babylonjs.BABYLON.GroundMesh, Unit],
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], alphaFilter.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    onReady: Unit,
    alphaFilter: Double
  ): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], minHeight.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], alphaFilter.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
  
  /**
    * Creates a hemisphere mesh.
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateHemisphere(name: String, segments: Double, diameter: Double): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateHemisphere(name: String, segments: Double, diameter: Double, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
    * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
    * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value than `radius`)
    * * The parameter `subdivisions` sets the number of subdivisions (positive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
    * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/polyhedra#icosphere
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateIcoSphere(name: String, options: FlatRadius, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates lathe mesh.
    * The lathe is a shape with a symmetry axis : a 2D model shape is rotated around this axis to design the lathe.
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be rotated in its local space : the shape must be designed in the xOy plane and will be rotated around the Y axis. It's usually a 2D shape, so the Vector3 z coordinates are often set to zero
    * @param radius is the radius value of the lathe
    * @param tessellation is the side number of the lathe.
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateLathe(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a line mesh..
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines).
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], points.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  inline def CreateLines(
    name: String,
    points: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    instance: Nullable[typings.babylonjs.BABYLON.LinesMesh]
  ): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], points.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
  
  /**
    * Creates a plane mesh.
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of both sides of the plane at once (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreatePlane(name: String, size: Double, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePlane(name: String, size: Double, scene: typings.babylonjs.BABYLON.Scene, updatable: Boolean): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePlane(
    name: String,
    size: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePlane(
    name: String,
    size: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a polygon mesh.Please consider using the same method from the MeshBuilder class instead
    * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh.
    * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors.
    * You can set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * Remember you can only change the shape positions, not their number when updating a polygon.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param#non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]]
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Unit,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Unit,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Unit,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Unit,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a polyhedron mesh.
    *.
    * * The parameter `type` (positive integer, max 14, default 0) sets the polyhedron type to build among the 15 embedded types. Please refer to the type sheet in the tutorial to choose the wanted type
    * * The parameter `size` (positive float, default 1) sets the polygon size
    * * You can overwrite the `size` on each dimension bu using the parameters `sizeX`, `sizeY` or `sizeZ` (positive floats, default to `size` value)
    * * You can build other polyhedron types than the 15 embbeded ones by setting the parameter `custom` (`polyhedronObject`, default null). If you set the parameter `custom`, this overwrittes the parameter `type`
    * * A `polyhedronObject` is a formatted javascript object. You'll find a full file with pre-set polyhedra here : https://github.com/BabylonJS/Extensions/tree/master/Polyhedron
    * * You can set the color and the UV of each side of the polyhedron with the parameters `faceColors` (Color4, default `(1, 1, 1, 1)`) and faceUV (Vector4, default `(0, 0, 1, 1)`)
    * * To understand how to set `faceUV` or `faceColors`, please read this by considering the right number of faces of your polyhedron, instead of only 6 for the box : https://doc.babylonjs.com/features/featuresDeepDive/materials/using/texturePerBoxFace
    * * The parameter `flat` (boolean, default true). If set to false, it gives the polyhedron a single global face, so less vertices and shared normals. In this case, `faceColors` and `faceUV` are ignored
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh to create
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreatePolyhedron(name: String, options: CustomFaceColors, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a ribbon mesh.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param
    * @param name defines the name of the mesh to create
    * @param pathArray is a required array of paths, what are each an array of successive Vector3. The pathArray parameter depicts the ribbon geometry.
    * @param closeArray creates a seam between the first and the last paths of the path array (default is false)
    * @param closePath creates a seam between the first and the last points of each path of the path array
    * @param offset is taken in account only if the `pathArray` is containing a single path
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @param instance defines an instance of an existing Ribbon object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#ribbon)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Boolean,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], pathArray.asInstanceOf[js.Any], closeArray.asInstanceOf[js.Any], closePath.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a sphere mesh.
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateSphere(name: String, segments: Double, diameter: Double): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(name: String, segments: Double, diameter: Double, scene: Unit, updatable: Boolean): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: Unit,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(name: String, segments: Double, diameter: Double, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], segments.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a tiled ground mesh.
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
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: H,
    precision: H,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], xmin.asInstanceOf[js.Any], zmin.asInstanceOf[js.Any], xmax.asInstanceOf[js.Any], zmax.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: H,
    precision: H,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], xmin.asInstanceOf[js.Any], zmin.asInstanceOf[js.Any], xmax.asInstanceOf[js.Any], zmax.asInstanceOf[js.Any], subdivisions.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a torus mesh.
    * @param name defines the name of the mesh to create
    * @param diameter sets the diameter size (float) of the torus (default 1)
    * @param thickness sets the diameter size of the tube of the torus (float, default 0.5)
    * @param tessellation sets the number of torus sides (positive integer, default 16)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: Unit,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: Unit,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], diameter.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a torus knot mesh.
    * @param name defines the name of the mesh to create
    * @param radius sets the global radius size (float) of the torus knot (default 2)
    * @param tube sets the diameter size of the tube of the torus (float, default 0.5)
    * @param radialSegments sets the number of sides on each tube segments (positive integer, default 32)
    * @param tubularSegments sets the number of tubes to decompose the knot into (positive integer, default 32)
    * @param p the number of windings on X axis (positive integers, default 2)
    * @param q the number of windings on Y axis (positive integers, default 3)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: Unit,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: Unit,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
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
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tube.asInstanceOf[js.Any], radialSegments.asInstanceOf[js.Any], tubularSegments.asInstanceOf[js.Any], p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates a tube mesh.
    * The tube is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    *
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param
    * @param name defines the name of the mesh to create
    * @param path is a required array of successive Vector3. It is the curve used as the axis of the tube
    * @param radius sets the tube radius size
    * @param tessellation is the number of sides on the tubular surface
    * @param radiusFunction is a custom function. If it is not null, it overrides the parameter `radius`. This function is called on each point of the tube path and is passed the index `i` of the i-th point and the distance of this point from the first point of the path
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @param instance is an instance of an existing Tube object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#tube)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
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
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def CreateTube(
    name: String,
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], tessellation.asInstanceOf[js.Any], radiusFunction.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  @JSGlobal("BABYLON.Mesh.DEFAULTSIDE")
  @js.native
  val DEFAULTSIDE: /* 0 */ Double = js.native
  
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  @JSGlobal("BABYLON.Mesh.DOUBLESIDE")
  @js.native
  val DOUBLESIDE: /* 2 */ Double = js.native
  
  /**
    * Extends a mesh to a Goldberg mesh
    * Warning  the mesh to convert MUST be an import of a perviously exported Goldberg mesh
    * @param mesh the mesh to convert
    * @returns the extended mesh
    * @deprecated Please use ExtendMeshToGoldberg instead
    */
  inline def ExtendToGoldberg(mesh: typings.babylonjs.BABYLON.Mesh): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("ExtendToGoldberg")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates an extruded polygon mesh, with depth in the Y direction..
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param#extruded-non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param depth defines the height of extrusion
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]]
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Boolean,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Unit,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: js.Array[js.Array[typings.babylonjs.BABYLON.Vector3]],
    updatable: Unit,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Boolean,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Unit,
    sideOrientation: Double,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    depth: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    holes: Unit,
    updatable: Unit,
    sideOrientation: Unit,
    earcutInjection: Any
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates an extruded shape mesh.
    * The extrusion is a parametric shape. It has no predefined shape. Its final shape will depend on the input parameters.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scale is the value to scale the shape
    * @param rotation is the angle value to rotate the shape each step (each path point), from the former step (so rotation added each step) along the curve
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Boolean,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Unit,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    updatable: Unit,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Creates an custom extruded shape mesh.
    * The custom extrusion is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    *
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/param#extruded-shapes
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
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/features/featuresDeepDive/mesh/creation/set#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/features/featuresDeepDive/mesh/dynamicMeshMorph#extruded-shape)
    * @returns a new Mesh
    * @deprecated Please use MeshBuilder instead
    */
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Boolean,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Double,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    path: js.Array[typings.babylonjs.BABYLON.Vector3],
    scaleFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    rotationFunction: Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]],
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    updatable: Unit,
    sideOrientation: Unit,
    instance: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], path.asInstanceOf[js.Any], scaleFunction.asInstanceOf[js.Any], rotationFunction.asInstanceOf[js.Any], ribbonCloseArray.asInstanceOf[js.Any], ribbonClosePath.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], updatable.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Mesh pattern setting : rotate pattern and rotate
    */
  @JSGlobal("BABYLON.Mesh.FLIP_N_ROTATE_ROW")
  @js.native
  val FLIP_N_ROTATE_ROW: /* 6 */ Double = js.native
  
  /**
    * Mesh pattern setting : flip and rotate alternate tiles on each row or column
    */
  @JSGlobal("BABYLON.Mesh.FLIP_N_ROTATE_TILE")
  @js.native
  val FLIP_N_ROTATE_TILE: /* 5 */ Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) all tiles on alternate rows
    */
  @JSGlobal("BABYLON.Mesh.FLIP_ROW")
  @js.native
  val FLIP_ROW: /* 3 */ Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) alternate tiles on each row or column
    */
  @JSGlobal("BABYLON.Mesh.FLIP_TILE")
  @js.native
  val FLIP_TILE: /* 1 */ Double = js.native
  
  /**
    * Mesh side orientation : usually the external or front surface
    */
  @JSGlobal("BABYLON.Mesh.FRONTSIDE")
  @js.native
  val FRONTSIDE: /* 0 */ Double = js.native
  
  /**
    * Indicates that the instanced meshes should be sorted from back to front before rendering if their material is transparent
    */
  @JSGlobal("BABYLON.Mesh.INSTANCEDMESH_SORT_TRANSPARENT")
  @js.native
  def INSTANCEDMESH_SORT_TRANSPARENT: Boolean = js.native
  inline def INSTANCEDMESH_SORT_TRANSPARENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCEDMESH_SORT_TRANSPARENT")(x.asInstanceOf[js.Any])
  
  /**
    * Mesh tile positioning : part tiles on left
    */
  @JSGlobal("BABYLON.Mesh.LEFT")
  @js.native
  val LEFT: /* 1 */ Double = js.native
  
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes array of meshes with the vertices to merge. Entries cannot be empty meshes.
    * @param disposeSource when true (default), dispose of the vertices from the source meshes.
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true.
    * @param meshSubclass (optional) can be set to a Mesh where the merged vertices will be inserted.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh into subMeshes.
    * @param multiMultiMaterials when true (false default), subdivide mesh into subMeshes with multiple materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  inline def MergeMeshes(meshes: js.Array[typings.babylonjs.BABYLON.Mesh]): Nullable[typings.babylonjs.BABYLON.Mesh] = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(meshes: js.Array[typings.babylonjs.BABYLON.Mesh], disposeSource: Boolean): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(meshes: js.Array[typings.babylonjs.BABYLON.Mesh], disposeSource: Unit, allow32BitsIndices: Boolean): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.BABYLON.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Mesh]]
  
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes array of meshes with the vertices to merge. Entries cannot be empty meshes.
    * @param disposeSource when true (default), dispose of the vertices from the source meshes.
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true.
    * @param meshSubclass (optional) can be set to a Mesh where the merged vertices will be inserted.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh into subMeshes.
    * @param multiMultiMaterials when true (false default), subdivide mesh into subMeshes with multiple materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  inline def MergeMeshesAsync(meshes: js.Array[typings.babylonjs.BABYLON.Mesh]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(meshes: js.Array[typings.babylonjs.BABYLON.Mesh], disposeSource: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(meshes: js.Array[typings.babylonjs.BABYLON.Mesh], disposeSource: Unit, allow32BitsIndices: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.BABYLON.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.BABYLON.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
    * @param meshes defines the list of meshes to scan
    * @returns an object `{min:` Vector3`, max:` Vector3`}`
    */
  inline def MinMax(meshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh]): MaxMin = ^.asInstanceOf[js.Dynamic].applyDynamic("MinMax")(meshes.asInstanceOf[js.Any]).asInstanceOf[MaxMin]
  
  /**
    * Mesh cap setting : no cap
    */
  @JSGlobal("BABYLON.Mesh.NO_CAP")
  @js.native
  val NO_CAP: /* 0 */ Double = js.native
  
  /**
    * Mesh pattern setting : no flip or rotate
    */
  @JSGlobal("BABYLON.Mesh.NO_FLIP")
  @js.native
  val NO_FLIP: /* 0 */ Double = js.native
  
  /**
    * Returns a new Mesh object parsed from the source provided.
    * @param parsedMesh is the source
    * @param scene defines the hosting scene
    * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
    * @returns a new Mesh
    */
  inline def Parse(parsedMesh: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * Mesh tile positioning : part tiles on right
    */
  @JSGlobal("BABYLON.Mesh.RIGHT")
  @js.native
  val RIGHT: /* 2 */ Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) all tiles on alternate rows
    */
  @JSGlobal("BABYLON.Mesh.ROTATE_ROW")
  @js.native
  val ROTATE_ROW: /* 4 */ Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) alternate tiles on each row or column
    */
  @JSGlobal("BABYLON.Mesh.ROTATE_TILE")
  @js.native
  val ROTATE_TILE: /* 2 */ Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on top
    */
  @JSGlobal("BABYLON.Mesh.TOP")
  @js.native
  val TOP: /* 3 */ Double = js.native
  
  /**
    * Gets the default side orientation.
    * @param orientation the orientation to value to attempt to get
    * @returns the default orientation
    * @internal
    */
  inline def _GetDefaultSideOrientation(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetDefaultSideOrientation")().asInstanceOf[Double]
  inline def _GetDefaultSideOrientation(orientation: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetDefaultSideOrientation")(orientation.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @internal
    */
  inline def _GoldbergMeshParser(parsedMesh: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_GoldbergMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GoldbergMesh]
  
  /**
    * @internal
    */
  inline def _GroundMeshParser(parsedMesh: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_GroundMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  /**
    * @internal
    */
  inline def _LinesMeshParser(parsedMesh: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_LinesMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
  
  @JSGlobal("BABYLON.Mesh._MergeMeshesCoroutine")
  @js.native
  def _MergeMeshesCoroutine: Any = js.native
  inline def _MergeMeshesCoroutine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MergeMeshesCoroutine")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _PhysicsImpostorParser(scene: typings.babylonjs.BABYLON.Scene, physicObject: IPhysicsEnabledObject, jsonObject: Any): typings.babylonjs.BABYLON.PhysicsImpostor = (^.asInstanceOf[js.Dynamic].applyDynamic("_PhysicsImpostorParser")(scene.asInstanceOf[js.Any], physicObject.asInstanceOf[js.Any], jsonObject.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.PhysicsImpostor]
  
  /**
    * @internal
    */
  inline def _instancedMeshFactory(name: String, mesh: typings.babylonjs.BABYLON.Mesh): typings.babylonjs.BABYLON.InstancedMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_instancedMeshFactory")(name.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.InstancedMesh]
}
