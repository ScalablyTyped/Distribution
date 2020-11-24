package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConfigRuleRequest extends js.Object {
  
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: typings.awsSdk.configserviceMod.ConfigRule = js.native
  
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}
object PutConfigRuleRequest {
  
  @scala.inline
  def apply(ConfigRule: ConfigRule): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
  
  @scala.inline
  implicit class PutConfigRuleRequestOps[Self <: PutConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigRule(value: ConfigRule): Self = this.set("ConfigRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagsList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
