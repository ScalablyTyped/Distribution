package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Masks all rules that match the specified criteria.
  */
@js.native
trait IgnoreRules extends OnRequestActions {
  
  val instanceType: String = js.native
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.IgnoreRules = js.native
}
object IgnoreRules {
  
  @scala.inline
  def apply(instanceType: String, typeGuard: typings.chromeApps.chromeAppsStrings.IgnoreRules): IgnoreRules = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRules]
  }
  
  @scala.inline
  implicit class IgnoreRulesMutableBuilder[Self <: IgnoreRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.IgnoreRules): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
