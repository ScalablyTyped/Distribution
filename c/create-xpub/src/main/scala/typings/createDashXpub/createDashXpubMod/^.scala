package typings.createDashXpub.createDashXpubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-xpub", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a Base58 encoded extended public key (xpub) for use in a
    * [BIP32 hierarchical deterministic wallet](https://github.com/bitcoin/bips/blob/master/bip-0032.mediawiki).
    *
    * Tip: If you're working with ledgerjs you can pass the output of
    * [`getWalletPublicKey()`](http://ledgerhq.github.io/ledgerjs/docs/#btcgetwalletpublickey) almost directly in.
    *
    * @returns A Base58 encoded extended public key.
    */
  def apply(options: Options): String = js.native
}

