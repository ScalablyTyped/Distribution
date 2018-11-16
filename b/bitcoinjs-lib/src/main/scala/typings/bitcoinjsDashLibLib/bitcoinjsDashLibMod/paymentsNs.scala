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
  
  def p2data(a: bitcoinjsDashLibLib.Anon_Data): bitcoinjsDashLibLib.Anon_DataOutput = js.native
  def p2data(a: bitcoinjsDashLibLib.Anon_Data, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_DataOutput = js.native
  def p2ms(a: bitcoinjsDashLibLib.Anon_NetworkN): bitcoinjsDashLibLib.Anon_N = js.native
  def p2ms(a: bitcoinjsDashLibLib.Anon_NetworkN, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_N = js.native
  def p2pk(a: bitcoinjsDashLibLib.Anon_NetworkPubkeySignature): bitcoinjsDashLibLib.Anon_PubkeySignature = js.native
  def p2pk(a: bitcoinjsDashLibLib.Anon_NetworkPubkeySignature, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_PubkeySignature = js.native
  def p2pkh(a: bitcoinjsDashLibLib.Anon_NetworkPubkey): bitcoinjsDashLibLib.Anon_Pubkey = js.native
  def p2pkh(a: bitcoinjsDashLibLib.Anon_NetworkPubkey, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_Pubkey = js.native
  def p2sh(a: bitcoinjsDashLibLib.Anon_NetworkRedeem): bitcoinjsDashLibLib.Anon_Redeem = js.native
  def p2sh(a: bitcoinjsDashLibLib.Anon_NetworkRedeem, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_Redeem = js.native
  def p2wpkh(a: bitcoinjsDashLibLib.Anon_Network): bitcoinjsDashLibLib.Anon_Pubkey = js.native
  def p2wpkh(a: bitcoinjsDashLibLib.Anon_Network, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_Pubkey = js.native
  def p2wsh(a: bitcoinjsDashLibLib.Anon_NetworkRedeem): bitcoinjsDashLibLib.Anon_Redeem = js.native
  def p2wsh(a: bitcoinjsDashLibLib.Anon_NetworkRedeem, opts: bitcoinjsDashLibLib.Anon_Validate): bitcoinjsDashLibLib.Anon_Redeem = js.native
}

