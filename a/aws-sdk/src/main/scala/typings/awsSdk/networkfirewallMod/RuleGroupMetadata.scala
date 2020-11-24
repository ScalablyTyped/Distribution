package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupMetadata extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group.
    */
  var Arn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}
object RuleGroupMetadata {
  
  @scala.inline
  def apply(): RuleGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupMetadata]
  }
  
  @scala.inline
  implicit class RuleGroupMetadataOps[Self <: RuleGroupMetadata] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ResourceArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
