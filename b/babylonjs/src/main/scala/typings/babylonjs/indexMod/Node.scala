package typings.babylonjs.indexMod

import typings.babylonjs.nodeMod.NodeConstructor
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Node")
@js.native
class Node protected ()
  extends typings.babylonjs.nodeMod.Node {
  /**
    * Creates a new Node
    * @param name the name and id to be given to this node
    * @param scene the scene this node will be added to
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
@JSImport("babylonjs/index", "Node")
@js.native
object Node extends js.Object {
  
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
  def Construct(`type`: String, name: String, scene: typings.babylonjs.sceneMod.Scene): Nullable[js.Function0[this.type]] = js.native
  def Construct(`type`: String, name: String, scene: typings.babylonjs.sceneMod.Scene, options: js.Any): Nullable[js.Function0[this.type]] = js.native
  
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param scene defines the hosting scene
    */
  def ParseAnimationRanges(node: typings.babylonjs.nodeMod.Node, parsedNode: js.Any, scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
  
  /** @hidden */
  def _AnimationRangeFactory(name: String, from: Double, to: Double): typings.babylonjs.animationRangeMod.AnimationRange = js.native
  
  var _NodeConstructors: js.Any = js.native
}
