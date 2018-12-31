package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node is the basic class for all scene objects (Mesh, Light, Camera.)
  */
@JSImport("babylonjs", "Node")
@js.native
class Node protected ()
  extends babylonjsLib.BABYLONNs.Node {
  /**
    * Creates a new Node
    * @param name the name and id to be given to this node
    * @param scene the scene this node will be added to
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
}

/**
  * Node is the basic class for all scene objects (Mesh, Light, Camera.)
  */
@JSImport("babylonjs", "Node")
@js.native
object Node extends js.Object {
  var _NodeConstructors: js.Any = js.native
  /**
    * Add a new node constructor
    * @param type defines the type name of the node to construct
    * @param constructorFunc defines the constructor function
    */
  def AddNodeConstructor(`type`: java.lang.String, constructorFunc: babylonjsLib.BABYLONNs.NodeConstructor): scala.Unit = js.native
  /**
    * Returns a node constructor based on type name
    * @param type defines the type name
    * @param name defines the new node name
    * @param scene defines the hosting scene
    * @param options defines optional options to transmit to constructors
    * @returns the new constructor or null
    */
  def Construct(`type`: java.lang.String, name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[js.Function0[this.type]] = js.native
  def Construct(
    `type`: java.lang.String,
    name: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Scene,
    options: js.Any
  ): babylonjsLib.BABYLONNs.Nullable[js.Function0[this.type]] = js.native
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param scene defines the hosting scene
    */
  def ParseAnimationRanges(node: babylonjsLib.BABYLONNs.Node, parsedNode: js.Any, scene: babylonjsLib.BABYLONNs.Scene): scala.Unit = js.native
}

