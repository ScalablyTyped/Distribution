package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingRule extends StObject {
  
  /**
    * A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
    */
  var Condition: js.UndefOr[typings.awsSdk.s3Mod.Condition] = js.undefined
  
  /**
    * Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can specify a different error code to return.
    */
  var Redirect: typings.awsSdk.s3Mod.Redirect
}
object RoutingRule {
  
  @scala.inline
  def apply(Redirect: Redirect): RoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingRule]
  }
  
  @scala.inline
  implicit class RoutingRuleMutableBuilder[Self <: RoutingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setRedirect(value: Redirect): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
  }
}
