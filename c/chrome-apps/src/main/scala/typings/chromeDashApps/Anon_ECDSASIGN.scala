package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.ecdsaSign
import typings.chromeDashApps.chromeDashAppsStrings.rsaSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ECDSASIGN extends js.Object {
  var ECDSA_SIGN: ecdsaSign
  var RSA_SIGN: rsaSign
}

object Anon_ECDSASIGN {
  @scala.inline
  def apply(ECDSA_SIGN: ecdsaSign, RSA_SIGN: rsaSign): Anon_ECDSASIGN = {
    val __obj = js.Dynamic.literal(ECDSA_SIGN = ECDSA_SIGN.asInstanceOf[js.Any], RSA_SIGN = RSA_SIGN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ECDSASIGN]
  }
}

