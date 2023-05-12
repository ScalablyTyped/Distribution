package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libGindexMod.GindexBitstring
import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProofTreeOffsetMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/treeOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTreeOffsetProofSerializedLength(offsets: js.Array[Double], leaves: js.Array[js.typedarray.Uint8Array]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTreeOffsetProofSerializedLength")(offsets.asInstanceOf[js.Any], leaves.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createNodeFromTreeOffsetProof(offsets: js.Array[Double], leaves: js.Array[js.typedarray.Uint8Array]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFromTreeOffsetProof")(offsets.asInstanceOf[js.Any], leaves.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def createTreeOffsetProof(rootNode: Node, gindices: js.Array[Gindex]): js.Tuple2[js.Array[Double], js.Array[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTreeOffsetProof")(rootNode.asInstanceOf[js.Any], gindices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], js.Array[js.typedarray.Uint8Array]]]
  
  inline def deserializeTreeOffsetProof(data: js.typedarray.Uint8Array, byteOffset: Double): js.Tuple2[js.Array[Double], js.Array[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeTreeOffsetProof")(data.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], js.Array[js.typedarray.Uint8Array]]]
  
  inline def nodeToTreeOffsetProof(node: Node, gindex: GindexBitstring, proofGindices: js.Array[GindexBitstring]): js.Tuple2[js.Array[Double], js.Array[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeToTreeOffsetProof")(node.asInstanceOf[js.Any], gindex.asInstanceOf[js.Any], proofGindices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], js.Array[js.typedarray.Uint8Array]]]
  
  inline def serializeTreeOffsetProof(
    output: js.typedarray.Uint8Array,
    byteOffset: Double,
    offsets: js.Array[Double],
    leaves: js.Array[js.typedarray.Uint8Array]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTreeOffsetProof")(output.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], offsets.asInstanceOf[js.Any], leaves.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treeOffsetProofToNode(offsets: js.Array[Double], leaves: js.Array[js.typedarray.Uint8Array]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("treeOffsetProofToNode")(offsets.asInstanceOf[js.Any], leaves.asInstanceOf[js.Any])).asInstanceOf[Node]
}
