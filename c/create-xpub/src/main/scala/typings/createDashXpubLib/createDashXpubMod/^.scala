package typings
package createDashXpubLib.createDashXpubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-xpub", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Mainnet (xpub) version bytes.
    */
  val mainnet: createDashXpubLib.createDashXpubLibNumbers.`0x0488B21E` = js.native
  /**
    * Testnet (tpub) version bytes.
    */
  val testnet: createDashXpubLib.createDashXpubLibNumbers.`0x043587CF` = js.native
  /**
    * Creates a Base58 encoded extended public key (xpub) for use in a
    * [BIP32 hierarchical deterministic wallet](https://github.com/bitcoin/bips/blob/master/bip-0032.mediawiki).
    *
    * Tip: If you're working with ledgerjs you can pass the output of
    * [`getWalletPublicKey()`](http://ledgerhq.github.io/ledgerjs/docs/#btcgetwalletpublickey) almost directly in.
    *
    * @returns A Base58 encoded extended public key.
    */
  def apply(options: Options): java.lang.String = js.native
}

