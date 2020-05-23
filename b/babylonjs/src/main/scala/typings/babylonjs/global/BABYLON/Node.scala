package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.NodeConstructor
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Node")
@js.native
class Node protected ()
  extends typings.babylonjs.BABYLON.Node {
  /**
    * Creates a new Node
    * @param name the name and id to be given to this node
    * @param scene the scene this node will be added to
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}

/* static members */
@JSGlobal("BABYLON.Node")
@js.native
object Node extends js.Object {
  var _NodeConstructors: js.Any = js.native
  /**
    * Add a new node constructor
    * @param type defines the type name of the node to construct
    * @param constructorFunc defines the constructor function
    */
  def AddNodeConstructor(`type`: String, constructorFunc: NodeConstructor): Unit = js.native
  /**
    * Returns a node constructor based on type name
    * @param type defines the type name
    * @param name defines the new node name
    * @param scene defines the hosting scene
    * @param options defines optional options to transmit to constructors
    * @returns the new constructor or null
    */
  def Construct(`type`: String, name: String, scene: typings.babylonjs.BABYLON.Scene): Nullable[js.Function0[this.type]] = js.native
  def Construct(`type`: String, name: String, scene: typings.babylonjs.BABYLON.Scene, options: js.Any): Nullable[js.Function0[this.type]] = js.native
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param scene defines the hosting scene
    */
  def ParseAnimationRanges(node: typings.babylonjs.BABYLON.Node, parsedNode: js.Any, scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
  /** @hidden */
  def _AnimationRangeFactory(name: String, from: Double, to: Double): typings.babylonjs.BABYLON.AnimationRange = js.native
}

