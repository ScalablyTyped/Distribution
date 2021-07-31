package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebACLSummary extends StObject {
  
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: ResourceName
  
  /**
    * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}
object WebACLSummary {
  
  @scala.inline
  def apply(Name: ResourceName, WebACLId: ResourceId): WebACLSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACLSummary]
  }
  
  @scala.inline
  implicit class WebACLSummaryMutableBuilder[Self <: WebACLSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
