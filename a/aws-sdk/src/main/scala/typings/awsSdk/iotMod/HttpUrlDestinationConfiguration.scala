package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpUrlDestinationConfiguration extends StObject {
  
  /**
    * The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
    */
  var confirmationUrl: Url = js.native
}
object HttpUrlDestinationConfiguration {
  
  @scala.inline
  def apply(confirmationUrl: Url): HttpUrlDestinationConfiguration = {
    val __obj = js.Dynamic.literal(confirmationUrl = confirmationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUrlDestinationConfiguration]
  }
  
  @scala.inline
  implicit class HttpUrlDestinationConfigurationMutableBuilder[Self <: HttpUrlDestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
  }
}
