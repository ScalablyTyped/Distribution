package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpUrlDestinationSummary extends js.Object {
  
  /**
    * The URL used to confirm ownership of or access to the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
}
object HttpUrlDestinationSummary {
  
  @scala.inline
  def apply(): HttpUrlDestinationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpUrlDestinationSummary]
  }
  
  @scala.inline
  implicit class HttpUrlDestinationSummaryOps[Self <: HttpUrlDestinationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfirmationUrl(value: Url): Self = this.set("confirmationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmationUrl: Self = this.set("confirmationUrl", js.undefined)
  }
}
