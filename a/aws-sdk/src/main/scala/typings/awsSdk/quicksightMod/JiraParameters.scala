package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JiraParameters extends StObject {
  
  /**
    * The base URL of the Jira site.
    */
  var SiteBaseUrl: typings.awsSdk.quicksightMod.SiteBaseUrl
}
object JiraParameters {
  
  inline def apply(SiteBaseUrl: SiteBaseUrl): JiraParameters = {
    val __obj = js.Dynamic.literal(SiteBaseUrl = SiteBaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JiraParameters]
  }
  
  extension [Self <: JiraParameters](x: Self) {
    
    inline def setSiteBaseUrl(value: SiteBaseUrl): Self = StObject.set(x, "SiteBaseUrl", value.asInstanceOf[js.Any])
  }
}
