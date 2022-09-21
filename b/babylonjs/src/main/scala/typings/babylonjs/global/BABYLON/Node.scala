package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.NodeConstructor
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Node")
@js.native
open class Node protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Node {
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
object Node {
  
  @JSGlobal("BABYLON.Node")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a new node constructor
    * @param type defines the type name of the node to construct
    * @param constructorFunc defines the constructor function
    */
  inline def AddNodeConstructor(`type`: String, constructorFunc: NodeConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddNodeConstructor")(`type`.asInstanceOf[js.Any], constructorFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a node constructor based on type name
    * @param type defines the type name
    * @param name defines the new node name
    * @param scene defines the hosting scene
    * @param options defines optional options to transmit to constructors
    * @returns the new constructor or null
    */
  inline def Construct(`type`: String, name: String, scene: typings.babylonjs.BABYLON.Scene): Nullable[js.Function0[this.type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Construct")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Function0[this.type]]]
  inline def Construct(`type`: String, name: String, scene: typings.babylonjs.BABYLON.Scene, options: Any): Nullable[js.Function0[this.type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Construct")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Function0[this.type]]]
  
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param scene defines the hosting scene
    */
  inline def ParseAnimationRanges(node: typings.babylonjs.BABYLON.Node, parsedNode: Any, scene: typings.babylonjs.BABYLON.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseAnimationRanges")(node.asInstanceOf[js.Any], parsedNode.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @param name
    * @param from
    * @param to
    * @hidden
    */
  inline def _AnimationRangeFactory(name: String, from: Double, to: Double): typings.babylonjs.BABYLON.AnimationRange = (^.asInstanceOf[js.Dynamic].applyDynamic("_AnimationRangeFactory")(name.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.AnimationRange]
  
  @JSGlobal("BABYLON.Node._NodeConstructors")
  @js.native
  def _NodeConstructors: Any = js.native
  inline def _NodeConstructors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NodeConstructors")(x.asInstanceOf[js.Any])
}
