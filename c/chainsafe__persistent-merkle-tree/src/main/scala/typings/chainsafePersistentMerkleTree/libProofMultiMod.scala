package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProofMultiMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/multi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMultiProof(rootNode: Node, gindices: js.Array[Gindex]): js.Tuple3[
    js.Array[js.typedarray.Uint8Array], 
    js.Array[js.typedarray.Uint8Array], 
    js.Array[Gindex]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiProof")(rootNode.asInstanceOf[js.Any], gindices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[js.typedarray.Uint8Array], 
    js.Array[js.typedarray.Uint8Array], 
    js.Array[Gindex]
  ]]
  
  inline def createNodeFromMultiProof(
    leaves: js.Array[js.typedarray.Uint8Array],
    witnesses: js.Array[js.typedarray.Uint8Array],
    gindices: js.Array[Gindex]
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFromMultiProof")(leaves.asInstanceOf[js.Any], witnesses.asInstanceOf[js.Any], gindices.asInstanceOf[js.Any])).asInstanceOf[Node]
}
