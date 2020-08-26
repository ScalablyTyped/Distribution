package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the Rule.
    */
  var MetricName: js.UndefOr[typings.awsSdk.wafMod.MetricName] = js.native
  /**
    * The friendly name or description for the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a Rule.
    */
  var Predicates: typings.awsSdk.wafMod.Predicates = js.native
  /**
    * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
}

object Rule {
  @scala.inline
  def apply(Predicates: Predicates, RuleId: ResourceId): Rule = {
    val __obj = js.Dynamic.literal(Predicates = Predicates.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
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
    def setPredicatesVarargs(value: Predicate*): Self = this.set("Predicates", js.Array(value :_*))
    @scala.inline
    def setPredicates(value: Predicates): Self = this.set("Predicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: ResourceId): Self = this.set("RuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

