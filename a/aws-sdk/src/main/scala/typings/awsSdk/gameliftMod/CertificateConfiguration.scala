package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateConfiguration extends js.Object {
  /**
    * Indicates whether a TLS/SSL certificate was generated for a fleet.     
    */
  var CertificateType: typings.awsSdk.gameliftMod.CertificateType = js.native
}

object CertificateConfiguration {
  @scala.inline
  def apply(CertificateType: CertificateType): CertificateConfiguration = {
    val __obj = js.Dynamic.literal(CertificateType = CertificateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateConfiguration]
  }
  @scala.inline
  implicit class CertificateConfigurationOps[Self <: CertificateConfiguration] (val x: Self) extends AnyVal {
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
    def setCertificateType(value: CertificateType): Self = this.set("CertificateType", value.asInstanceOf[js.Any])
  }
  
}

