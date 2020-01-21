package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedRule extends js.Object {
  /**
    * The name of the rule to exclude.
    */
  var Name: EntityName = js.native
}

object ExcludedRule {
  @scala.inline
  def apply(Name: EntityName): ExcludedRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcludedRule]
  }
}

