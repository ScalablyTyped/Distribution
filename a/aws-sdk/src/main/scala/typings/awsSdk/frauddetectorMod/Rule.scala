package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: identifier = js.native
  
  /**
    * The rule ID.
    */
  var ruleId: identifier = js.native
  
  /**
    * The rule version.
    */
  var ruleVersion: wholeNumberVersionString = js.native
}
object Rule {
  
  @scala.inline
  def apply(detectorId: identifier, ruleId: identifier, ruleVersion: wholeNumberVersionString): Rule = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], ruleVersion = ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: identifier): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersion(value: wholeNumberVersionString): Self = this.set("ruleVersion", value.asInstanceOf[js.Any])
  }
}
