package typings.chromeApps.chrome.certificateProvider

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateInfo extends js.Object {
  
  /**
    * Must be the DER encoding of a X.509 certificate. Currently, only
    * certificates of RSA keys are supported.
    */
  var certificate: js.UndefOr[ArrayBuffer] = js.native
  
  /**
    * Must be set to all hashes supported for this certificate. This app
    * will only be asked for signatures of digests calculated with one of these
    * hash algorithms. This should be in order of decreasing hash preference.
    * @see Hash
    */
  var supportedHashes: js.UndefOr[js.Array[Hash]] = js.native
}
object CertificateInfo {
  
  @scala.inline
  def apply(): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateInfo]
  }
  
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: ArrayBuffer): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setSupportedHashesVarargs(value: Hash*): Self = this.set("supportedHashes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedHashes(value: js.Array[Hash]): Self = this.set("supportedHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedHashes: Self = this.set("supportedHashes", js.undefined)
  }
}
