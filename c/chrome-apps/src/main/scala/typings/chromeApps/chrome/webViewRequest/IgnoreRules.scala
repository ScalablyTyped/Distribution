package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Masks all rules that match the specified criteria.
  */
trait IgnoreRules
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.IgnoreRules
}
object IgnoreRules {
  
  @scala.inline
  def apply(instanceType: String): IgnoreRules = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "IgnoreRules")
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
