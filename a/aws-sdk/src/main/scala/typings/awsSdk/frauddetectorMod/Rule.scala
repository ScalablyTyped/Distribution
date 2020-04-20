package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var ruleVersion: nonEmptyString = js.native
}

object Rule {
  @scala.inline
  def apply(detectorId: identifier, ruleId: identifier, ruleVersion: nonEmptyString): Rule = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], ruleVersion = ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

