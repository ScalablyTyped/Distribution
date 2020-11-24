package typings.chromeApps.chrome.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectDetails extends js.Object {
  
  /**
    * If given, the *selectClientCertificates* operates on this
    * list. Otherwise, obtains the list of all certificates from the platform's
    * certificate stores that are available to this extensions.
    * Entries that the extension doesn't have permission for or which doesn't
    * match the request, are removed.
    */
  var clientCerts: js.UndefOr[js.Array[ArrayBuffer]] = js.native
  
  /** If true, the filtered list is presented to the user to manually select a
    * certificate and thereby granting the extension access to the
    * certificate(s) and key(s).Only the selected certificate(s) will be
    * returned. If is false, the list is reduced to all certificates that the
    * extension has been granted access to (automatically or manually). */
  var interactive: Boolean = js.native
  
  /** Only certificates that match this request will be returned. */
  var request: ClientCertificateRequest = js.native
}
object SelectDetails {
  
  @scala.inline
  def apply(interactive: Boolean, request: ClientCertificateRequest): SelectDetails = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectDetails]
  }
  
  @scala.inline
  implicit class SelectDetailsOps[Self <: SelectDetails] (val x: Self) extends AnyVal {
    
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
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ClientCertificateRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertsVarargs(value: ArrayBuffer*): Self = this.set("clientCerts", js.Array(value :_*))
    
    @scala.inline
    def setClientCerts(value: js.Array[ArrayBuffer]): Self = this.set("clientCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCerts: Self = this.set("clientCerts", js.undefined)
  }
}
