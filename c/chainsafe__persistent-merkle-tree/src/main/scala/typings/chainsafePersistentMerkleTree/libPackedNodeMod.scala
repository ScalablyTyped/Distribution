package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPackedNodeMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/packedNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packedNodeRootsToBytes(dataView: js.typedarray.DataView, start: Double, size: Double, nodes: js.Array[Node]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("packedNodeRootsToBytes")(dataView.asInstanceOf[js.Any], start.asInstanceOf[js.Any], size.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def packedRootsBytesToLeafNodes(dataView: js.typedarray.DataView, start: Double, end: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("packedRootsBytesToLeafNodes")(dataView.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def packedRootsBytesToNode(depth: Double, dataView: js.typedarray.DataView, start: Double, end: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("packedRootsBytesToNode")(depth.asInstanceOf[js.Any], dataView.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Node]
}
