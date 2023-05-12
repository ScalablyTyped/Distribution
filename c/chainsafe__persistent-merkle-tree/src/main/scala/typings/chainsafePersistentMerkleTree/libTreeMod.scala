package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libGindexMod.GindexBitstring
import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import typings.chainsafePersistentMerkleTree.libProofMod.Proof
import typings.chainsafePersistentMerkleTree.libProofMod.ProofInput
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/tree", "Tree")
  @js.native
  open class Tree protected () extends StObject {
    def this(node: Node) = this()
    def this(node: Node, hook: Hook) = this()
    
    /* private */ var _rootNode: Any = js.native
    
    /**
      * Return the node at the specified gindex.
      */
    def getNode(gindex: Gindex): Node = js.native
    def getNode(gindex: GindexBitstring): Node = js.native
    
    /**
      * Return the node at the specified depth and index.
      *
      * Supports index up to `Number.MAX_SAFE_INTEGER`.
      */
    def getNodeAtDepth(depth: Double, index: Double): Node = js.native
    
    /**
      * Fast read-only iteration
      * In-order traversal of nodes at `depth`
      * starting from the `startIndex`-indexed node
      * iterating through `count` nodes
      *
      * Supports index up to `Number.MAX_SAFE_INTEGER`.
      */
    def getNodesAtDepth(depth: Double, startIndex: Double, count: Double): js.Array[Node] = js.native
    
    /**
      * Return a merkle proof for the proof input.
      *
      * This method can be used to create multiproofs.
      */
    def getProof(input: ProofInput): Proof = js.native
    
    /**
      * Return the hash at the specified gindex.
      */
    def getRoot(index: Gindex): js.typedarray.Uint8Array = js.native
    def getRoot(index: GindexBitstring): js.typedarray.Uint8Array = js.native
    
    /**
      * Return a merkle proof for the node at the specified gindex.
      */
    def getSingleProof(index: Gindex): js.Array[js.typedarray.Uint8Array] = js.native
    
    /**
      * Return the subtree at the specified gindex.
      *
      * Note: The returned subtree will have a `hook` attached to the parent tree.
      * Updates to the subtree will result in updates to the parent.
      */
    def getSubtree(index: Gindex): Tree = js.native
    def getSubtree(index: GindexBitstring): Tree = js.native
    
    /* private */ var hook: Any = js.native
    
    /**
      * Fast read-only iteration
      * In-order traversal of nodes at `depth`
      * starting from the `startIndex`-indexed node
      * iterating through `count` nodes
      *
      * Supports index up to `Number.MAX_SAFE_INTEGER`.
      */
    def iterateNodesAtDepth(depth: Double, startIndex: Double, count: Double): IterableIterator[Node] = js.native
    
    /**
      * The root hash of the tree
      */
    def root: js.typedarray.Uint8Array = js.native
    
    /**
      * The root node of the tree
      */
    def rootNode: Node = js.native
    /**
      *
      * Setting the root node will trigger a call to the tree's `hook` if it exists.
      */
    def rootNode_=(newRootNode: Node): Unit = js.native
    
    def setNode(gindex: GindexBitstring, n: Node): Unit = js.native
    /**
      * Set the node at at the specified gindex.
      */
    def setNode(gindex: Gindex, n: Node): Unit = js.native
    
    /**
      * Set the node at the specified depth and index.
      *
      * Supports index up to `Number.MAX_SAFE_INTEGER`.
      */
    def setNodeAtDepth(depth: Double, index: Double, node: Node): Unit = js.native
    
    def setNodeWithFn(gindex: GindexBitstring, getNewNode: js.Function1[/* node */ Node, Node]): Unit = js.native
    /**
      * Traverse to the node at the specified gindex,
      * then apply the function to get a new node and set the node at the specified gindex with the result.
      *
      * This is a convenient method to avoid traversing the tree 2 times to
      * get and set.
      */
    def setNodeWithFn(gindex: Gindex, getNewNode: js.Function1[/* node */ Node, Node]): Unit = js.native
    
    def setRoot(index: GindexBitstring, root: js.typedarray.Uint8Array): Unit = js.native
    /**
      * Set the hash at the specified gindex.
      *
      * Note: This will set a new `LeafNode` at the specified gindex.
      */
    def setRoot(index: Gindex, root: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object Tree {
    
    @JSImport("@chainsafe/persistent-merkle-tree/lib/tree", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a `Tree` from a `Proof` object
      */
    inline def createFromProof(proof: Proof): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProof")(proof.asInstanceOf[js.Any]).asInstanceOf[Tree]
  }
  
  inline def getNode(rootNode: Node, gindex: Gindex): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def getNode(rootNode: Node, gindex: GindexBitstring): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def getNodeAtDepth(rootNode: Node, depth: Double, index: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtDepth")(rootNode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def getNodesAtDepth(rootNode: Node, depth: Double, startIndex: Double, count: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodesAtDepth")(rootNode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def iterateNodesAtDepth(rootNode: Node, depth: Double, startIndex: Double, count: Double): IterableIterator[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateNodesAtDepth")(rootNode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Node]]
  
  inline def setNode(rootNode: Node, gindex: GindexBitstring, n: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def setNode(rootNode: Node, gindex: Gindex, n: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setNodeAtDepth(rootNode: Node, nodesDepth: Double, index: Double, nodeChanged: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeAtDepth")(rootNode.asInstanceOf[js.Any], nodesDepth.asInstanceOf[js.Any], index.asInstanceOf[js.Any], nodeChanged.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setNodeWithFn(rootNode: Node, gindex: GindexBitstring, getNewNode: js.Function1[/* node */ Node, Node]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeWithFn")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], getNewNode.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def setNodeWithFn(rootNode: Node, gindex: Gindex, getNewNode: js.Function1[/* node */ Node, Node]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeWithFn")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], getNewNode.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setNodesAtDepth(rootNode: Node, nodesDepth: Double, indexes: js.Array[Double], nodes: js.Array[Node]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodesAtDepth")(rootNode.asInstanceOf[js.Any], nodesDepth.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def treeZeroAfterIndex(rootNode: Node, nodesDepth: Double, index: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("treeZeroAfterIndex")(rootNode.asInstanceOf[js.Any], nodesDepth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  type Hook = js.Function1[/* newRootNode */ Node, Unit]
}
