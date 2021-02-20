package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpUrlDestinationSummary extends StObject {
  
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
  implicit class HttpUrlDestinationSummaryMutableBuilder[Self <: HttpUrlDestinationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUrlUndefined: Self = StObject.set(x, "confirmationUrl", js.undefined)
  }
}
