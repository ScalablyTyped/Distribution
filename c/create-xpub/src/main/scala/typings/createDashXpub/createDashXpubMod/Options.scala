package typings.createDashXpub.createDashXpubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The chain code.
    */
  var chainCode: String
  /**
    * The child number.
    */
  var childNumber: Double
  /**
    * The depth of the derived key.
    */
  var depth: Double
  /**
    * Network version bytes.
    * @default 0x0488B21E
    */
  var networkVersion: js.UndefOr[Double] = js.undefined
  /**
    * The public key in compressed or uncompressed form.
    */
  var publicKey: String
}

object Options {
  @scala.inline
  def apply(
    chainCode: String,
    childNumber: Double,
    depth: Double,
    publicKey: String,
    networkVersion: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNumber = childNumber.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    if (networkVersion != null) __obj.updateDynamic("networkVersion")(networkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

