package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GluePolicy extends js.Object {
  
  /**
    * The date and time at which the policy was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Contains the hash value associated with this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.native
  
  /**
    * Contains the requested policy document, in JSON format.
    */
  var PolicyInJson: js.UndefOr[PolicyJsonString] = js.native
  
  /**
    * The date and time at which the policy was last updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.native
}
object GluePolicy {
  
  @scala.inline
  def apply(): GluePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GluePolicy]
  }
  
  @scala.inline
  implicit class GluePolicyOps[Self <: GluePolicy] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: Timestamp): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setPolicyHash(value: HashString): Self = this.set("PolicyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyHash: Self = this.set("PolicyHash", js.undefined)
    
    @scala.inline
    def setPolicyInJson(value: PolicyJsonString): Self = this.set("PolicyInJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyInJson: Self = this.set("PolicyInJson", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: Timestamp): Self = this.set("UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("UpdateTime", js.undefined)
  }
}
