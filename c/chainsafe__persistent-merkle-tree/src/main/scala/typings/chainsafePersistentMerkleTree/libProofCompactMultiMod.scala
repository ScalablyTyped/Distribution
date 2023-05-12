package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.anon.BitIndex
import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProofCompactMultiMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/compactMulti", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactMultiProofToNode(bitlist: js.Array[Boolean], leaves: js.Array[js.typedarray.Uint8Array], pointer: BitIndex): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("compactMultiProofToNode")(bitlist.asInstanceOf[js.Any], leaves.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def computeDescriptor(indices: js.Array[Gindex]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDescriptor")(indices.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createCompactMultiProof(rootNode: Node, descriptor: js.typedarray.Uint8Array): js.Array[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompactMultiProof")(rootNode.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint8Array]]
  
  inline def createNodeFromCompactMultiProof(leaves: js.Array[js.typedarray.Uint8Array], descriptor: js.typedarray.Uint8Array): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFromCompactMultiProof")(leaves.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def descriptorToBitlist(descriptor: js.typedarray.Uint8Array): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("descriptorToBitlist")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
  
  inline def nodeToCompactMultiProof(node: Node, bitlist: js.Array[Boolean], bitIndex: Double): js.Array[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeToCompactMultiProof")(node.asInstanceOf[js.Any], bitlist.asInstanceOf[js.Any], bitIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint8Array]]
}
