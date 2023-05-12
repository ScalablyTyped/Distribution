package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubtreeMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/subtree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subtreeFillToContents(nodes: js.Array[Node], depth: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeFillToContents")(nodes.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def subtreeFillToDepth(bottom: Node, depth: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeFillToDepth")(bottom.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def subtreeFillToLength(bottom: Node, depth: Double, length: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("subtreeFillToLength")(bottom.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Node]
}
