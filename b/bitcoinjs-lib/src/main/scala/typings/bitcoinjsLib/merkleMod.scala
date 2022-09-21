package typings.bitcoinjsLib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object merkleMod {
  
  @JSImport("bitcoinjs-lib/src/merkle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fastMerkleRoot(values: js.Array[Buffer], digestFn: js.Function1[/* b */ Buffer, Buffer]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fastMerkleRoot")(values.asInstanceOf[js.Any], digestFn.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
