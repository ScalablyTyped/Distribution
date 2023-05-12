package typings.chainsafePersistentMerkleTree

import typings.chainsafeAsSha256.libHashObjectMod.HashObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/node", "BranchNode")
  @js.native
  open class BranchNode protected () extends Node {
    def this(_left: Node, _right: Node) = this()
    
    /* private */ var _left: Any = js.native
    
    /* private */ var _right: Any = js.native
    
    @JSName("left")
    def left_MBranchNode: Node = js.native
    
    @JSName("right")
    def right_MBranchNode: Node = js.native
    
    @JSName("rootHashObject")
    def rootHashObject_MBranchNode: HashObject = js.native
    
    @JSName("root")
    def root_MBranchNode: js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/node", "LeafNode")
  @js.native
  open class LeafNode protected () extends Node {
    def this(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, h5: Double, h6: Double, h7: Double) = this()
    
    def bitwiseOrUint(uintBytes: Double, offsetBytes: Double, value: Double): Unit = js.native
    
    def getUint(uintBytes: Double, offsetBytes: Double): Double = js.native
    def getUint(uintBytes: Double, offsetBytes: Double, clipInfinity: Boolean): Double = js.native
    
    def getUintBigint(uintBytes: Double, offsetBytes: Double): js.BigInt = js.native
    
    @JSName("left")
    def left_MLeafNode: Node = js.native
    
    @JSName("right")
    def right_MLeafNode: Node = js.native
    
    @JSName("rootHashObject")
    def rootHashObject_MLeafNode: HashObject = js.native
    
    @JSName("root")
    def root_MLeafNode: js.typedarray.Uint8Array = js.native
    
    def setUint(uintBytes: Double, offsetBytes: Double, value: Double): Unit = js.native
    def setUint(uintBytes: Double, offsetBytes: Double, value: Double, clipInfinity: Boolean): Unit = js.native
    
    def setUintBigint(uintBytes: Double, offsetBytes: Double, valueBN: js.BigInt): Unit = js.native
    
    def writeToBytes(data: js.typedarray.Uint8Array, start: Double, size: Double): Unit = js.native
  }
  /* static members */
  object LeafNode {
    
    @JSImport("@chainsafe/persistent-merkle-tree/lib/node", "LeafNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * New LeafNode from existing HashObject.
      */
    inline def fromHashObject(ho: HashObject): LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHashObject")(ho.asInstanceOf[js.Any]).asInstanceOf[LeafNode]
    
    inline def fromRoot(root: js.typedarray.Uint8Array): LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRoot")(root.asInstanceOf[js.Any]).asInstanceOf[LeafNode]
    
    /**
      * LeafNode with HashObject `(uint32, 0, 0, 0, 0, 0, 0, 0)`.
      */
    inline def fromUint32(uint32: Double): LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint32")(uint32.asInstanceOf[js.Any]).asInstanceOf[LeafNode]
    
    /**
      * New LeafNode with its internal value set to zero. Consider using `zeroNode(0)` if you don't need to mutate.
      */
    inline def fromZero(): LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromZero")().asInstanceOf[LeafNode]
  }
  
  /* note: abstract class */ @JSImport("@chainsafe/persistent-merkle-tree/lib/node", "Node")
  @js.native
  open class Node protected ()
    extends StObject
       with HashObject {
    def this(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, h5: Double, h6: Double, h7: Double) = this()
    
    def applyHash(root: HashObject): Unit = js.native
    
    /* CompleteClass */
    var h0: Double = js.native
    
    /* CompleteClass */
    var h1: Double = js.native
    
    /* CompleteClass */
    var h2: Double = js.native
    
    /* CompleteClass */
    var h3: Double = js.native
    
    /* CompleteClass */
    var h4: Double = js.native
    
    /* CompleteClass */
    var h5: Double = js.native
    
    /* CompleteClass */
    var h6: Double = js.native
    
    /* CompleteClass */
    var h7: Double = js.native
    
    /** Returns true if the node is a `LeafNode` */
    def isLeaf(): Boolean = js.native
    
    /** The left child node */
    var left: Node = js.native
    
    /** The right child node */
    var right: Node = js.native
    
    /** The root hash of the node */
    var root: js.typedarray.Uint8Array = js.native
    
    /** The root hash of the node as a `HashObject` */
    var rootHashObject: HashObject = js.native
  }
  
  inline def bitwiseOrNodeH(node: Node, hIndex: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseOrNodeH")(node.asInstanceOf[js.Any], hIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compose(inner: Link, outer: Link): Link = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(inner.asInstanceOf[js.Any], outer.asInstanceOf[js.Any])).asInstanceOf[Link]
  
  inline def getNodeH(node: Node, hIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeH")(node.asInstanceOf[js.Any], hIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def identity(n: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(n.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def setNodeH(node: Node, hIndex: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeH")(node.asInstanceOf[js.Any], hIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Link = js.Function1[/* n */ Node, Node]
}
