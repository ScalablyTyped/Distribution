package typings.babylonjs.indexMod

import typings.babylonjs.nodeMod.NodeConstructor
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Node")
@js.native
open class Node protected ()
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
object Node {
  
  @JSImport("babylonjs/index", "Node")
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
  inline def Construct(`type`: String, name: String, scene: typings.babylonjs.sceneMod.Scene): Nullable[js.Function0[this.type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Construct")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Function0[this.type]]]
  inline def Construct(`type`: String, name: String, scene: typings.babylonjs.sceneMod.Scene, options: Any): Nullable[js.Function0[this.type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Construct")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Function0[this.type]]]
  
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param _scene defines the hosting scene
    */
  inline def ParseAnimationRanges(node: typings.babylonjs.nodeMod.Node, parsedNode: Any, _scene: typings.babylonjs.sceneMod.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseAnimationRanges")(node.asInstanceOf[js.Any], parsedNode.asInstanceOf[js.Any], _scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _AnimationRangeFactory(_name: String, _from: Double, _to: Double): typings.babylonjs.animationsAnimationRangeMod.AnimationRange = (^.asInstanceOf[js.Dynamic].applyDynamic("_AnimationRangeFactory")(_name.asInstanceOf[js.Any], _from.asInstanceOf[js.Any], _to.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationsAnimationRangeMod.AnimationRange]
  
  @JSImport("babylonjs/index", "Node._NodeConstructors")
  @js.native
  def _NodeConstructors: Any = js.native
  inline def _NodeConstructors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NodeConstructors")(x.asInstanceOf[js.Any])
}
