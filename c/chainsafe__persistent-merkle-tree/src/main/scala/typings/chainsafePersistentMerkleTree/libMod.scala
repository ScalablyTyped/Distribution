package typings.chainsafePersistentMerkleTree

import typings.chainsafeAsSha256.libHashObjectMod.HashObject
import typings.chainsafePersistentMerkleTree.libGindexMod.Bit
import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libGindexMod.GindexBitstring
import typings.chainsafePersistentMerkleTree.libGindexMod.GindexIterator_
import typings.chainsafePersistentMerkleTree.libHasherTypesMod.Hasher
import typings.chainsafePersistentMerkleTree.libNodeMod.Link
import typings.chainsafePersistentMerkleTree.libProofMod.Proof
import typings.chainsafePersistentMerkleTree.libProofMod.ProofInput
import typings.chainsafePersistentMerkleTree.libProofMod.ProofType
import typings.chainsafePersistentMerkleTree.libTreeMod.Hook
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", "BranchNode")
  @js.native
  open class BranchNode protected ()
    extends typings.chainsafePersistentMerkleTree.libNodeMod.BranchNode {
    def this(
      _left: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
      _right: typings.chainsafePersistentMerkleTree.libNodeMod.Node
    ) = this()
  }
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", "LeafNode")
  @js.native
  open class LeafNode protected ()
    extends typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode {
    def this(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, h5: Double, h6: Double, h7: Double) = this()
  }
  /* static members */
  object LeafNode {
    
    @JSImport("@chainsafe/persistent-merkle-tree/lib", "LeafNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * New LeafNode from existing HashObject.
      */
    inline def fromHashObject(ho: HashObject): typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHashObject")(ho.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode]
    
    inline def fromRoot(root: js.typedarray.Uint8Array): typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRoot")(root.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode]
    
    /**
      * LeafNode with HashObject `(uint32, 0, 0, 0, 0, 0, 0, 0)`.
      */
    inline def fromUint32(uint32: Double): typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint32")(uint32.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode]
    
    /**
      * New LeafNode with its internal value set to zero. Consider using `zeroNode(0)` if you don't need to mutate.
      */
    inline def fromZero(): typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromZero")().asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.LeafNode]
  }
  
  /* note: abstract class */ @JSImport("@chainsafe/persistent-merkle-tree/lib", "Node")
  @js.native
  open class Node protected ()
    extends typings.chainsafePersistentMerkleTree.libNodeMod.Node {
    def this(h0: Double, h1: Double, h2: Double, h3: Double, h4: Double, h5: Double, h6: Double, h7: Double) = this()
  }
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", "ProofType")
  @js.native
  object ProofType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chainsafePersistentMerkleTree.libProofMod.ProofType & String] = js.native
    
    /* "compactMulti" */ val compactMulti: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.compactMulti & String = js.native
    
    /* "multi" */ val multi: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.multi & String = js.native
    
    /* "single" */ val single: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.single & String = js.native
    
    /* "treeOffset" */ val treeOffset: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.treeOffset & String = js.native
  }
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", "ProofTypeSerialized")
  @js.native
  val ProofTypeSerialized: js.Array[ProofType] = js.native
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", "Tree")
  @js.native
  open class Tree protected ()
    extends typings.chainsafePersistentMerkleTree.libTreeMod.Tree {
    def this(node: typings.chainsafePersistentMerkleTree.libNodeMod.Node) = this()
    def this(node: typings.chainsafePersistentMerkleTree.libNodeMod.Node, hook: Hook) = this()
  }
  /* static members */
  object Tree {
    
    @JSImport("@chainsafe/persistent-merkle-tree/lib", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a `Tree` from a `Proof` object
      */
    inline def createFromProof(proof: Proof): typings.chainsafePersistentMerkleTree.libTreeMod.Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProof")(proof.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libTreeMod.Tree]
  }
  
  inline def bitIndexBigInt(v: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bitIndexBigInt")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bitwiseOrNodeH(node: typings.chainsafePersistentMerkleTree.libNodeMod.Node, hIndex: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseOrNodeH")(node.asInstanceOf[js.Any], hIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compose(inner: Link, outer: Link): Link = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(inner.asInstanceOf[js.Any], outer.asInstanceOf[js.Any])).asInstanceOf[Link]
  
  inline def computeDescriptor(indices: js.Array[Gindex]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDescriptor")(indices.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def concatGindices(gindices: js.Array[Gindex]): Gindex = ^.asInstanceOf[js.Dynamic].applyDynamic("concatGindices")(gindices.asInstanceOf[js.Any]).asInstanceOf[Gindex]
  
  inline def convertGindexToBitstring(gindex: Gindex): GindexBitstring = ^.asInstanceOf[js.Dynamic].applyDynamic("convertGindexToBitstring")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexBitstring]
  inline def convertGindexToBitstring(gindex: GindexBitstring): GindexBitstring = ^.asInstanceOf[js.Dynamic].applyDynamic("convertGindexToBitstring")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexBitstring]
  
  inline def countToDepth(count: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countToDepth")(count.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def createNodeFromProof(proof: Proof): typings.chainsafePersistentMerkleTree.libNodeMod.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFromProof")(proof.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def createProof(rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node, input: ProofInput): Proof = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(rootNode.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Proof]
  
  inline def descriptorToBitlist(descriptor: js.typedarray.Uint8Array): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("descriptorToBitlist")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
  
  inline def deserializeProof(data: js.typedarray.Uint8Array): Proof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProof")(data.asInstanceOf[js.Any]).asInstanceOf[Proof]
  
  inline def getGindexBits(gindex: Gindex): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGindexBits")(gindex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  inline def getGindexBits(gindex: GindexBitstring): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGindexBits")(gindex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  
  inline def getGindicesAtDepth(depth: Double, startIndex: Double, count: Double): js.Array[Gindex] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGindicesAtDepth")(depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Gindex]]
  
  inline def getNode(rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node, gindex: Gindex): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  inline def getNode(rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node, gindex: GindexBitstring): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def getNodeAtDepth(rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node, depth: Double, index: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtDepth")(rootNode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def getNodeH(node: typings.chainsafePersistentMerkleTree.libNodeMod.Node, hIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeH")(node.asInstanceOf[js.Any], hIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNodesAtDepth(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    depth: Double,
    startIndex: Double,
    count: Double
  ): js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodesAtDepth")(rootNode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node]]
  
  inline def gindexChild(gindex: Gindex, rightChild: Boolean): Gindex = (^.asInstanceOf[js.Dynamic].applyDynamic("gindexChild")(gindex.asInstanceOf[js.Any], rightChild.asInstanceOf[js.Any])).asInstanceOf[Gindex]
  
  inline def gindexIterator(gindex: Gindex): GindexIterator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexIterator")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexIterator_]
  inline def gindexIterator(gindex: GindexBitstring): GindexIterator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexIterator")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexIterator_]
  
  inline def gindexParent(gindex: Gindex): Gindex = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexParent")(gindex.asInstanceOf[js.Any]).asInstanceOf[Gindex]
  
  inline def gindexSibling(gindex: Gindex): Gindex = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexSibling")(gindex.asInstanceOf[js.Any]).asInstanceOf[Gindex]
  
  inline def hashObjectToUint8Array(obj: HashObject): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashObjectToUint8Array")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib", "hasher")
  @js.native
  def hasher: Hasher = js.native
  inline def hasher_=(x: Hasher): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasher")(x.asInstanceOf[js.Any])
  
  inline def identity(n: typings.chainsafePersistentMerkleTree.libNodeMod.Node): typings.chainsafePersistentMerkleTree.libNodeMod.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(n.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def iterateAtDepth(depth: Double, startIndex: js.BigInt, count: js.BigInt): js.Iterable[Gindex] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateAtDepth")(depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Gindex]]
  
  inline def iterateNodesAtDepth(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    depth: Double,
    startIndex: Double,
    count: Double
  ): IterableIterator[typings.chainsafePersistentMerkleTree.libNodeMod.Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateNodesAtDepth")(rootNode.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[typings.chainsafePersistentMerkleTree.libNodeMod.Node]]
  
  inline def packedNodeRootsToBytes(
    dataView: js.typedarray.DataView,
    start: Double,
    size: Double,
    nodes: js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("packedNodeRootsToBytes")(dataView.asInstanceOf[js.Any], start.asInstanceOf[js.Any], size.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def packedRootsBytesToLeafNodes(dataView: js.typedarray.DataView, start: Double, end: Double): js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("packedRootsBytesToLeafNodes")(dataView.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node]]
  
  inline def packedRootsBytesToNode(depth: Double, dataView: js.typedarray.DataView, start: Double, end: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("packedRootsBytesToNode")(depth.asInstanceOf[js.Any], dataView.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def serializeProof(proof: Proof): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProof")(proof.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def setHasher(newHasher: Hasher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHasher")(newHasher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setNode(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    gindex: GindexBitstring,
    n: typings.chainsafePersistentMerkleTree.libNodeMod.Node
  ): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  inline def setNode(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    gindex: Gindex,
    n: typings.chainsafePersistentMerkleTree.libNodeMod.Node
  ): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNode")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def setNodeAtDepth(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    nodesDepth: Double,
    index: Double,
    nodeChanged: typings.chainsafePersistentMerkleTree.libNodeMod.Node
  ): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeAtDepth")(rootNode.asInstanceOf[js.Any], nodesDepth.asInstanceOf[js.Any], index.asInstanceOf[js.Any], nodeChanged.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def setNodeH(node: typings.chainsafePersistentMerkleTree.libNodeMod.Node, hIndex: Double, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeH")(node.asInstanceOf[js.Any], hIndex.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setNodeWithFn(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    gindex: GindexBitstring,
    getNewNode: js.Function1[
      /* node */ typings.chainsafePersistentMerkleTree.libNodeMod.Node, 
      typings.chainsafePersistentMerkleTree.libNodeMod.Node
    ]
  ): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeWithFn")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], getNewNode.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  inline def setNodeWithFn(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    gindex: Gindex,
    getNewNode: js.Function1[
      /* node */ typings.chainsafePersistentMerkleTree.libNodeMod.Node, 
      typings.chainsafePersistentMerkleTree.libNodeMod.Node
    ]
  ): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodeWithFn")(rootNode.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], getNewNode.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def setNodesAtDepth(
    rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node,
    nodesDepth: Double,
    indexes: js.Array[Double],
    nodes: js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  ): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setNodesAtDepth")(rootNode.asInstanceOf[js.Any], nodesDepth.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def subtreeFillToContents(nodes: js.Array[typings.chainsafePersistentMerkleTree.libNodeMod.Node], depth: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeFillToContents")(nodes.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def subtreeFillToDepth(bottom: typings.chainsafePersistentMerkleTree.libNodeMod.Node, depth: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeFillToDepth")(bottom.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def subtreeFillToLength(bottom: typings.chainsafePersistentMerkleTree.libNodeMod.Node, depth: Double, length: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeFillToLength")(bottom.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def toGindex(depth: Double, index: js.BigInt): Gindex = (^.asInstanceOf[js.Dynamic].applyDynamic("toGindex")(depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Gindex]
  
  inline def toGindexBitstring(depth: Double, index: Double): GindexBitstring = (^.asInstanceOf[js.Dynamic].applyDynamic("toGindexBitstring")(depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[GindexBitstring]
  
  inline def treeZeroAfterIndex(rootNode: typings.chainsafePersistentMerkleTree.libNodeMod.Node, nodesDepth: Double, index: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("treeZeroAfterIndex")(rootNode.asInstanceOf[js.Any], nodesDepth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
  
  inline def uint8ArrayToHashObject(byteArr: js.typedarray.Uint8Array): HashObject = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8ArrayToHashObject")(byteArr.asInstanceOf[js.Any]).asInstanceOf[HashObject]
  
  inline def zeroNode(height: Double): typings.chainsafePersistentMerkleTree.libNodeMod.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroNode")(height.asInstanceOf[js.Any]).asInstanceOf[typings.chainsafePersistentMerkleTree.libNodeMod.Node]
}
