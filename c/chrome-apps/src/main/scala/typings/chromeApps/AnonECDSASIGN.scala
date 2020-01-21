package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.ecdsaSign
import typings.chromeApps.chromeAppsStrings.rsaSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonECDSASIGN extends js.Object {
  var ECDSA_SIGN: ecdsaSign
  var RSA_SIGN: rsaSign
}

object AnonECDSASIGN {
  @scala.inline
  def apply(ECDSA_SIGN: ecdsaSign, RSA_SIGN: rsaSign): AnonECDSASIGN = {
    val __obj = js.Dynamic.literal(ECDSA_SIGN = ECDSA_SIGN.asInstanceOf[js.Any], RSA_SIGN = RSA_SIGN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonECDSASIGN]
  }
}

