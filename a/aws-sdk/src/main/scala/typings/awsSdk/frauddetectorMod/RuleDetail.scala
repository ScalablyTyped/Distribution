package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleDetail extends js.Object {
  
  /**
    * The rule ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * The timestamp of when the rule was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The rule expression.
    */
  var expression: js.UndefOr[ruleExpression] = js.native
  
  /**
    * The rule language.
    */
  var language: js.UndefOr[Language] = js.native
  
  /**
    * Timestamp of the last time the rule was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  
  /**
    * The rule outcomes.
    */
  var outcomes: js.UndefOr[NonEmptyListOfStrings] = js.native
  
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.native
  
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.native
}
object RuleDetail {
  
  @scala.inline
  def apply(): RuleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleDetail]
  }
  
  @scala.inline
  implicit class RuleDetailOps[Self <: RuleDetail] (val x: Self) extends AnyVal {
    
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    
    @scala.inline
    def setExpression(value: ruleExpression): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setOutcomesVarargs(value: String*): Self = this.set("outcomes", js.Array(value :_*))
    
    @scala.inline
    def setOutcomes(value: NonEmptyListOfStrings): Self = this.set("outcomes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcomes: Self = this.set("outcomes", js.undefined)
    
    @scala.inline
    def setRuleId(value: identifier): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
    
    @scala.inline
    def setRuleVersion(value: wholeNumberVersionString): Self = this.set("ruleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleVersion: Self = this.set("ruleVersion", js.undefined)
  }
}
