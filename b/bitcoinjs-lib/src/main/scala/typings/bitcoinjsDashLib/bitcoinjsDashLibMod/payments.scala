package typings.bitcoinjsDashLib.bitcoinjsDashLibMod

import typings.bitcoinjsDashLib.Anon_Address
import typings.bitcoinjsDashLib.Anon_AddressHash
import typings.bitcoinjsDashLib.Anon_AddressHashInput
import typings.bitcoinjsDashLib.Anon_AddressHashInputNetwork
import typings.bitcoinjsDashLib.Anon_AddressHashInputOutput
import typings.bitcoinjsDashLib.Anon_DataNetwork
import typings.bitcoinjsDashLib.Anon_DataOutput
import typings.bitcoinjsDashLib.Anon_Input
import typings.bitcoinjsDashLib.Anon_InputM
import typings.bitcoinjsDashLib.Anon_InputNetwork
import typings.bitcoinjsDashLib.Anon_InputOutput
import typings.bitcoinjsDashLib.Anon_Validate
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "payments")
@js.native
object payments extends js.Object {
  @js.native
  class Redeem () extends js.Object {
    var input: js.UndefOr[Buffer] = js.native
    var network: js.UndefOr[Network] = js.native
    var output: js.UndefOr[Buffer] = js.native
    var witness: js.UndefOr[js.Array[Buffer]] = js.native
  }
  
  def p2data(a: Anon_DataNetwork): Anon_DataOutput = js.native
  def p2data(a: Anon_DataNetwork, opts: Anon_Validate): Anon_DataOutput = js.native
  def p2ms(a: Anon_Input): Anon_InputM = js.native
  def p2ms(a: Anon_Input, opts: Anon_Validate): Anon_InputM = js.native
  def p2pk(a: Anon_InputNetwork): Anon_InputOutput = js.native
  def p2pk(a: Anon_InputNetwork, opts: Anon_Validate): Anon_InputOutput = js.native
  def p2pkh(a: Anon_Address): Anon_AddressHash = js.native
  def p2pkh(a: Anon_Address, opts: Anon_Validate): Anon_AddressHash = js.native
  def p2sh(a: Anon_AddressHashInput): Anon_AddressHashInputOutput = js.native
  def p2sh(a: Anon_AddressHashInput, opts: Anon_Validate): Anon_AddressHashInputOutput = js.native
  def p2wpkh(a: Anon_AddressHashInputNetwork): Anon_AddressHash = js.native
  def p2wpkh(a: Anon_AddressHashInputNetwork, opts: Anon_Validate): Anon_AddressHash = js.native
  def p2wsh(a: Anon_AddressHashInput): Anon_AddressHashInputOutput = js.native
  def p2wsh(a: Anon_AddressHashInput, opts: Anon_Validate): Anon_AddressHashInputOutput = js.native
}

