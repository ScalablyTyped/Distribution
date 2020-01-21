package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesResult extends js.Object {
  /**
    * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
    */
  var CertificatesInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificatesInfo] = js.native
  /**
    * Indicates whether another page of certificates is available when the number of available certificates exceeds the page limit.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListCertificatesResult {
  @scala.inline
  def apply(CertificatesInfo: CertificatesInfo = null, NextToken: NextToken = null): ListCertificatesResult = {
    val __obj = js.Dynamic.literal()
    if (CertificatesInfo != null) __obj.updateDynamic("CertificatesInfo")(CertificatesInfo.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesResult]
  }
}

