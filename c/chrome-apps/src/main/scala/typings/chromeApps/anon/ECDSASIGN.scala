package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.ecdsaSign
import typings.chromeApps.chromeAppsStrings.rsaSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECDSASIGN extends js.Object {
  var ECDSA_SIGN: ecdsaSign = js.native
  var RSA_SIGN: rsaSign = js.native
}

object ECDSASIGN {
  @scala.inline
  def apply(ECDSA_SIGN: ecdsaSign, RSA_SIGN: rsaSign): ECDSASIGN = {
    val __obj = js.Dynamic.literal(ECDSA_SIGN = ECDSA_SIGN.asInstanceOf[js.Any], RSA_SIGN = RSA_SIGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDSASIGN]
  }
  @scala.inline
  implicit class ECDSASIGNOps[Self <: ECDSASIGN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setECDSA_SIGN(value: ecdsaSign): Self = this.set("ECDSA_SIGN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRSA_SIGN(value: rsaSign): Self = this.set("RSA_SIGN", value.asInstanceOf[js.Any])
  }
  
}

