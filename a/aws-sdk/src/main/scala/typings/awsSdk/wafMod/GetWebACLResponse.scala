package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWebACLResponse extends StObject {
  
  /**
    * Information about the WebACL that you specified in the GetWebACL request. For more information, see the following topics:    WebACL: Contains DefaultAction, MetricName, Name, an array of Rule objects, and WebACLId     DefaultAction (Data type is WafAction): Contains Type     Rules: Contains an array of ActivatedRule objects, which contain Action, Priority, and RuleId     Action: Contains Type   
    */
  var WebACL: js.UndefOr[typings.awsSdk.wafMod.WebACL] = js.native
}
object GetWebACLResponse {
  
  @scala.inline
  def apply(): GetWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLResponse]
  }
  
  @scala.inline
  implicit class GetWebACLResponseMutableBuilder[Self <: GetWebACLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebACL(value: WebACL): Self = StObject.set(x, "WebACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLUndefined: Self = StObject.set(x, "WebACL", js.undefined)
  }
}
