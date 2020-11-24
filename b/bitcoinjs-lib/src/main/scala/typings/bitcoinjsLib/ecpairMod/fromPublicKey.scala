package typings.bitcoinjsLib.ecpairMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/ecpair", "fromPublicKey")
@js.native
object fromPublicKey extends js.Object {
  
  def apply(buffer: Buffer): ECPair = js.native
  def apply(buffer: Buffer, options: ECPairOptions): ECPair = js.native
}
