package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUrlDestinationProperties extends StObject {
  
  /**
    * The URL used to confirm the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.undefined
}
object HttpUrlDestinationProperties {
  
  @scala.inline
  def apply(): HttpUrlDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpUrlDestinationProperties]
  }
  
  @scala.inline
  implicit class HttpUrlDestinationPropertiesMutableBuilder[Self <: HttpUrlDestinationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUrlUndefined: Self = StObject.set(x, "confirmationUrl", js.undefined)
  }
}
