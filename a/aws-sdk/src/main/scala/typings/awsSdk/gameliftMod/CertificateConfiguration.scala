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
}

