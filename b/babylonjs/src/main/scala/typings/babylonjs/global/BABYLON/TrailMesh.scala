package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TrailMesh")
@js.native
open class TrailMesh protected ()
  extends StObject
     with typings.babylonjs.BABYLON.TrailMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param generator The mesh or transform node to generate a trail.
    * @param scene The scene to add this mesh to.
    * @param diameter Diameter of trailing mesh. Default is 1.
    * @param length Length of trailing mesh. Default is 60.
    * @param autoStart Automatically start trailing mesh. Default true.
    */
  def this(name: String, generator: typings.babylonjs.BABYLON.TransformNode) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(name: String, generator: typings.babylonjs.BABYLON.TransformNode, scene: Unit, diameter: Double) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: Unit,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: Unit,
    diameter: Unit,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Unit,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: Unit,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: Unit,
    diameter: Double,
    length: Unit,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: Unit,
    diameter: Unit,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: Unit,
    diameter: Unit,
    length: Unit,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Double,
    length: Unit,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Unit,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.BABYLON.TransformNode,
    scene: typings.babylonjs.BABYLON.Scene,
    diameter: Unit,
    length: Unit,
    autoStart: Boolean
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
object TrailMesh {
  
  @JSGlobal("BABYLON.TrailMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  inline def Parse(parsedMesh: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.TrailMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TrailMesh]
}
