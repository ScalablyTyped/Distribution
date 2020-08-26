package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleVersionRequest extends js.Object {
  /**
    * The description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The rule expression.
    */
  var expression: ruleExpression = js.native
  /**
    * The language.
    */
  var language: Language = js.native
  /**
    * The outcomes.
    */
  var outcomes: NonEmptyListOfStrings = js.native
  /**
    * The rule to update.
    */
  var rule: Rule = js.native
  /**
    * The tags to assign to the rule version.
    */
  var tags: js.UndefOr[tagList] = js.native
}

object UpdateRuleVersionRequest {
  @scala.inline
  def apply(expression: ruleExpression, language: Language, outcomes: NonEmptyListOfStrings, rule: Rule): UpdateRuleVersionRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleVersionRequest]
  }
  @scala.inline
  implicit class UpdateRuleVersionRequestOps[Self <: UpdateRuleVersionRequest] (val x: Self) extends AnyVal {
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
    def setExpression(value: ruleExpression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutcomesVarargs(value: String*): Self = this.set("outcomes", js.Array(value :_*))
    @scala.inline
    def setOutcomes(value: NonEmptyListOfStrings): Self = this.set("outcomes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: Rule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

