package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ECDSASIGN extends js.Object {
  var ECDSA_SIGN: chromeDashAppsLib.chromeDashAppsLibStrings.ecdsaSign
  var RSA_SIGN: chromeDashAppsLib.chromeDashAppsLibStrings.rsaSign
}

object Anon_ECDSASIGN {
  @scala.inline
  def apply(
    ECDSA_SIGN: chromeDashAppsLib.chromeDashAppsLibStrings.ecdsaSign,
    RSA_SIGN: chromeDashAppsLib.chromeDashAppsLibStrings.rsaSign
  ): Anon_ECDSASIGN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ECDSA_SIGN")(ECDSA_SIGN)
    __obj.updateDynamic("RSA_SIGN")(RSA_SIGN)
    __obj.asInstanceOf[Anon_ECDSASIGN]
  }
}

