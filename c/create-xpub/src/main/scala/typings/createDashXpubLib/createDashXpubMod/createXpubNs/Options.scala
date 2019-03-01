package typings
package createDashXpubLib.createDashXpubMod.createXpubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The chain code.
    */
  var chainCode: java.lang.String
  /**
    * The child number.
    */
  var childNumber: scala.Double
  /**
    * The depth of the derived key.
    */
  var depth: scala.Double
  /**
    * Network version bytes.
    * @default 0x0488B21E
    */
  var networkVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * The public key in compressed or uncompressed form.
    */
  var publicKey: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    chainCode: java.lang.String,
    childNumber: scala.Double,
    depth: scala.Double,
    publicKey: java.lang.String,
    networkVersion: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chainCode")(chainCode)
    __obj.updateDynamic("childNumber")(childNumber)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("publicKey")(publicKey)
    if (networkVersion != null) __obj.updateDynamic("networkVersion")(networkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

