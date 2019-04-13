package typings
package bitcoinjsDashLibLib.bitcoinjsDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", "payments")
@js.native
object paymentsNs extends js.Object {
  @js.native
  class Redeem () extends js.Object {
    var input: js.UndefOr[nodeLib.Buffer] = js.native
    var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.native
    var output: js.UndefOr[nodeLib.Buffer] = js.native
    var witness: js.UndefOr[js.Array[nodeLib.Buffer]] = js.native
  }
  
  def p2data(a: bitcoinjsDashLibLib.Anon_DataNetwork): bitcoinjsDashLibLib.Anon_DataOutput = js.native
  def p2data(a: bitcoinjsDashLibLib.Anon_DataNetwork, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_DataOutput = js.native
  def p2ms(a: bitcoinjsDashLibLib.Anon_Input): bitcoinjsDashLibLib.Anon_InputM = js.native
  def p2ms(a: bitcoinjsDashLibLib.Anon_Input, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_InputM = js.native
  def p2pk(a: bitcoinjsDashLibLib.Anon_InputNetwork): bitcoinjsDashLibLib.Anon_InputOutput = js.native
  def p2pk(a: bitcoinjsDashLibLib.Anon_InputNetwork, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_InputOutput = js.native
  def p2pkh(a: bitcoinjsDashLibLib.Anon_Address): bitcoinjsDashLibLib.Anon_AddressHash = js.native
  def p2pkh(a: bitcoinjsDashLibLib.Anon_Address, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_AddressHash = js.native
  def p2sh(a: bitcoinjsDashLibLib.Anon_AddressHashInput): bitcoinjsDashLibLib.Anon_AddressHashInputOutput = js.native
  def p2sh(a: bitcoinjsDashLibLib.Anon_AddressHashInput, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_AddressHashInputOutput = js.native
  def p2wpkh(a: bitcoinjsDashLibLib.Anon_AddressHashInputNetwork): bitcoinjsDashLibLib.Anon_AddressHash = js.native
  def p2wpkh(a: bitcoinjsDashLibLib.Anon_AddressHashInputNetwork, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_AddressHash = js.native
  def p2wsh(a: bitcoinjsDashLibLib.Anon_AddressHashInput): bitcoinjsDashLibLib.Anon_AddressHashInputOutput = js.native
  def p2wsh(a: bitcoinjsDashLibLib.Anon_AddressHashInput, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_AddressHashInputOutput = js.native
}

