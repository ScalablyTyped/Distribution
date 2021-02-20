package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JiraParameters extends StObject {
  
  /**
    * The base URL of the Jira site.
    */
  var SiteBaseUrl: typings.awsSdk.quicksightMod.SiteBaseUrl = js.native
}
object JiraParameters {
  
  @scala.inline
  def apply(SiteBaseUrl: SiteBaseUrl): JiraParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JiraParameters]
  }
  
  @scala.inline
  implicit class JiraParametersMutableBuilder[Self <: JiraParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiteBaseUrl(value: SiteBaseUrl): Self = StObject.set(x, "SiteBaseUrl", value.asInstanceOf[js.Any])
  }
}
