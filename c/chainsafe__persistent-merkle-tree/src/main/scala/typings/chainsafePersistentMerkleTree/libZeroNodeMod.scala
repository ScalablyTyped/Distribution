package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libZeroNodeMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/zeroNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zeroNode(height: Double): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroNode")(height.asInstanceOf[js.Any]).asInstanceOf[Node]
}
