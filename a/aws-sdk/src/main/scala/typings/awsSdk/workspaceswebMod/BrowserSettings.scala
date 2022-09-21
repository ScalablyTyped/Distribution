package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSettings extends StObject {
  
  /**
    * A list of web portal ARNs that this browser settings is associated with.
    */
  var associatedPortalArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * A JSON string containing Chrome Enterprise policies that will be applied to all streaming sessions.
    */
  var browserPolicy: js.UndefOr[BrowserPolicy] = js.undefined
  
  /**
    * The ARN of the browser settings.
    */
  var browserSettingsArn: ARN
}
object BrowserSettings {
  
  inline def apply(browserSettingsArn: ARN): BrowserSettings = {
    val __obj = js.Dynamic.literal(browserSettingsArn = browserSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserSettings]
  }
  
  extension [Self <: BrowserSettings](x: Self) {
    
    inline def setAssociatedPortalArns(value: ArnList): Self = StObject.set(x, "associatedPortalArns", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPortalArnsUndefined: Self = StObject.set(x, "associatedPortalArns", js.undefined)
    
    inline def setAssociatedPortalArnsVarargs(value: ARN*): Self = StObject.set(x, "associatedPortalArns", js.Array(value*))
    
    inline def setBrowserPolicy(value: BrowserPolicy): Self = StObject.set(x, "browserPolicy", value.asInstanceOf[js.Any])
    
    inline def setBrowserPolicyUndefined: Self = StObject.set(x, "browserPolicy", js.undefined)
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
  }
}
