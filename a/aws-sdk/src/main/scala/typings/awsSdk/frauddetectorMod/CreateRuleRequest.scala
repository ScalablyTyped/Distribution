package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleRequest extends js.Object {
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector ID for the rule's parent detector.
    */
  var detectorId: identifier = js.native
  /**
    * The rule expression.
    */
  var expression: ruleExpression = js.native
  /**
    * The language of the rule.
    */
  var language: Language = js.native
  /**
    * The outcome or outcomes returned when the rule expression matches.
    */
  var outcomes: NonEmptyListOfStrings = js.native
  /**
    * The rule ID.
    */
  var ruleId: identifier = js.native
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}

object CreateRuleRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    expression: ruleExpression,
    language: Language,
    outcomes: NonEmptyListOfStrings,
    ruleId: identifier
  ): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
  @scala.inline
  implicit class CreateRuleRequestOps[Self <: CreateRuleRequest] (val x: Self) extends AnyVal {
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
    def setExpression(value: ruleExpression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutcomesVarargs(value: String*): Self = this.set("outcomes", js.Array(value :_*))
    @scala.inline
    def setOutcomes(value: NonEmptyListOfStrings): Self = this.set("outcomes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: identifier): Self = this.set("ruleId", value.asInstanceOf[js.Any])
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

