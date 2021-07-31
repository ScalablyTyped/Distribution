package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigRuleRequest extends StObject {
  
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: typings.awsSdk.configserviceMod.ConfigRule
  
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
}
object PutConfigRuleRequest {
  
  @scala.inline
  def apply(ConfigRule: ConfigRule): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
  
  @scala.inline
  implicit class PutConfigRuleRequestMutableBuilder[Self <: PutConfigRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRule(value: ConfigRule): Self = StObject.set(x, "ConfigRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
