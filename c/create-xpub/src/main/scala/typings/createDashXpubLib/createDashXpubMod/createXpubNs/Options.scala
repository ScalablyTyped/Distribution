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

