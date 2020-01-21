package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/classify", JSImport.Namespace)
@js.native
object classifyMod extends js.Object {
  def input(script: Buffer): String = js.native
  def input(script: Buffer, allowIncomplete: Boolean): String = js.native
  def output(script: Buffer): String = js.native
  def witness(script: js.Array[Buffer]): String = js.native
  def witness(script: js.Array[Buffer], allowIncomplete: Boolean): String = js.native
  @js.native
  object types extends js.Object {
    var NONSTANDARD: String = js.native
    var NULLDATA: String = js.native
    var P2MS: String = js.native
    var P2PK: String = js.native
    var P2PKH: String = js.native
    var P2SH: String = js.native
    var P2WPKH: String = js.native
    var P2WSH: String = js.native
    var WITNESS_COMMITMENT: String = js.native
  }
  
}

