package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintStatement extends js.Object {
  /**
    * The operator to use to compare the request part to the size setting. 
    */
  var ComparisonOperator: typings.awsSdk.wafv2Mod.ComparisonOperator = js.native
  /**
    * The part of a web request that you want AWS WAF to inspect. For more information, see FieldToMatch. 
    */
  var FieldToMatch: typings.awsSdk.wafv2Mod.FieldToMatch = js.native
  /**
    * The size, in byte, to compare to the request part, after any transformations.
    */
  var Size: typings.awsSdk.wafv2Mod.Size = js.native
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all transformations on the content identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typings.awsSdk.wafv2Mod.TextTransformations = js.native
}

object SizeConstraintStatement {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    FieldToMatch: FieldToMatch,
    Size: Size,
    TextTransformations: TextTransformations
  ): SizeConstraintStatement = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], FieldToMatch = FieldToMatch.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SizeConstraintStatement]
  }
}

