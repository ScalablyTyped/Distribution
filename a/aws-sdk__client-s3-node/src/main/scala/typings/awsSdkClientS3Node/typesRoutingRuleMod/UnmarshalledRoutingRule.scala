package typings.awsSdkClientS3Node.typesRoutingRuleMod

import typings.awsSdkClientS3Node.typesConditionMod.UnmarshalledCondition
import typings.awsSdkClientS3Node.typesRedirectMod.UnmarshalledRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRoutingRule extends RoutingRule {
  
  /**
    * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
    */
  @JSName("Condition")
  var Condition_UnmarshalledRoutingRule: js.UndefOr[UnmarshalledCondition] = js.native
  
  /**
    * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
    */
  @JSName("Redirect")
  var Redirect_UnmarshalledRoutingRule: UnmarshalledRedirect = js.native
}
object UnmarshalledRoutingRule {
  
  @scala.inline
  def apply(Redirect: UnmarshalledRedirect): UnmarshalledRoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRoutingRule]
  }
  
  @scala.inline
  implicit class UnmarshalledRoutingRuleOps[Self <: UnmarshalledRoutingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRedirect(value: UnmarshalledRedirect): Self = this.set("Redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: UnmarshalledCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
  }
}
