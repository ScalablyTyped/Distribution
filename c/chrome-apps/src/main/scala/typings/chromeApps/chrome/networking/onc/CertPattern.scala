package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertPattern extends js.Object {
  /**
    * List of URIs to which the user can be directed in case
    * no certificates that match this pattern are found.
    */
  var EnrollmentURI: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set, pattern against which X.509 issuer settings should be matched.
    */
  var Issuer: js.UndefOr[IssuerSubjectPattern] = js.native
  /**
    * List of certificate issuer CA certificates.
    * A certificate must be signed by one of them in order to match this pattern.
    */
  var IssuerCARef: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set, pattern against which X.509 subject settings should be matched.
    */
  var IssuerSubjectPattern: js.UndefOr[typings.chromeApps.chrome.networking.onc.IssuerSubjectPattern] = js.native
}

object CertPattern {
  @scala.inline
  def apply(): CertPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertPattern]
  }
  @scala.inline
  implicit class CertPatternOps[Self <: CertPattern] (val x: Self) extends AnyVal {
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
    def setEnrollmentURIVarargs(value: String*): Self = this.set("EnrollmentURI", js.Array(value :_*))
    @scala.inline
    def setEnrollmentURI(value: js.Array[String]): Self = this.set("EnrollmentURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollmentURI: Self = this.set("EnrollmentURI", js.undefined)
    @scala.inline
    def setIssuer(value: IssuerSubjectPattern): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
    @scala.inline
    def setIssuerCARefVarargs(value: String*): Self = this.set("IssuerCARef", js.Array(value :_*))
    @scala.inline
    def setIssuerCARef(value: js.Array[String]): Self = this.set("IssuerCARef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuerCARef: Self = this.set("IssuerCARef", js.undefined)
    @scala.inline
    def setIssuerSubjectPattern(value: IssuerSubjectPattern): Self = this.set("IssuerSubjectPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuerSubjectPattern: Self = this.set("IssuerSubjectPattern", js.undefined)
  }
  
}

