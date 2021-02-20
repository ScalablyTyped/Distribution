package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowParameters extends StObject {
  
  /**
    * URL of the base site.
    */
  var SiteBaseUrl: typings.awsSdk.quicksightMod.SiteBaseUrl = js.native
}
object ServiceNowParameters {
  
  @scala.inline
  def apply(SiteBaseUrl: SiteBaseUrl): ServiceNowParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowParameters]
  }
  
  @scala.inline
  implicit class ServiceNowParametersMutableBuilder[Self <: ServiceNowParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiteBaseUrl(value: SiteBaseUrl): Self = StObject.set(x, "SiteBaseUrl", value.asInstanceOf[js.Any])
  }
}
