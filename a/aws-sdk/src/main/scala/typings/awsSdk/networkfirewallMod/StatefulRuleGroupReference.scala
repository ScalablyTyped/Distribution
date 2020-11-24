package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulRuleGroupReference extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the stateful rule group.
    */
  var ResourceArn: typings.awsSdk.networkfirewallMod.ResourceArn = js.native
}
object StatefulRuleGroupReference {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): StatefulRuleGroupReference = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulRuleGroupReference]
  }
  
  @scala.inline
  implicit class StatefulRuleGroupReferenceOps[Self <: StatefulRuleGroupReference] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
}
