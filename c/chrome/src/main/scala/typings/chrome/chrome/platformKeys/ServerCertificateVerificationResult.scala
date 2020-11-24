package typings.chrome.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerCertificateVerificationResult extends js.Object {
  
  /**
    * If the trust verification failed, this array contains the errors reported by the underlying network layer. Otherwise, this array is empty.
    * Note: This list is meant for debugging only and may not contain all relevant errors. The errors returned may change in future revisions of this API, and are not guaranteed to be forwards or backwards compatible.
    */
  var debug_errors: js.Array[String] = js.native
  
  /** The result of the trust verification: true if trust for the given verification details could be established and false if trust is rejected for any reason. */
  var trusted: Boolean = js.native
}
object ServerCertificateVerificationResult {
  
  @scala.inline
  def apply(debug_errors: js.Array[String], trusted: Boolean): ServerCertificateVerificationResult = {
    val __obj = js.Dynamic.literal(debug_errors = debug_errors.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateVerificationResult]
  }
  
  @scala.inline
  implicit class ServerCertificateVerificationResultOps[Self <: ServerCertificateVerificationResult] (val x: Self) extends AnyVal {
    
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
    def setDebug_errorsVarargs(value: String*): Self = this.set("debug_errors", js.Array(value :_*))
    
    @scala.inline
    def setDebug_errors(value: js.Array[String]): Self = this.set("debug_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
  }
}
