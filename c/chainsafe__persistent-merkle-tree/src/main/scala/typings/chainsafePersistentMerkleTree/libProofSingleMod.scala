package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProofSingleMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/single", "ERR_INVALID_NAV")
  @js.native
  val ERR_INVALID_NAV: /* "Invalid tree navigation" */ String = js.native
  
  inline def createNodeFromSingleProof(gindex: Gindex, leaf: js.typedarray.Uint8Array, witnesses: js.Array[js.typedarray.Uint8Array]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFromSingleProof")(gindex.asInstanceOf[js.Any], leaf.asInstanceOf[js.Any], witnesses.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def createSingleProof(rootNode: Node, index: Gindex): js.Tuple2[js.typedarray.Uint8Array, js.Array[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSingleProof")(rootNode.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.typedarray.Uint8Array, js.Array[js.typedarray.Uint8Array]]]
}
