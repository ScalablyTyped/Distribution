package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witnesscommitmentOutputMod {
  
  object check {
    
    @JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", "check")
    @js.native
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", "check")
    @js.native
    def apply(script: Buffer): Boolean = js.native
    @JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", "check")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", "check.toJSON")
    @js.native
    def toJSON: js.Function0[String] = js.native
    @scala.inline
    def toJSON_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", "decode")
  @js.native
  def decode(buffer: Buffer): Buffer = js.native
  
  @JSImport("bitcoinjs-lib/types/templates/witnesscommitment/output", "encode")
  @js.native
  def encode(commitment: Buffer): Buffer = js.native
}
