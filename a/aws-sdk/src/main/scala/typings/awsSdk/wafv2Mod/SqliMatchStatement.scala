package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqliMatchStatement extends js.Object {
  /**
    * The part of a web request that you want AWS WAF to inspect. For more information, see FieldToMatch. 
    */
  var FieldToMatch: typings.awsSdk.wafv2Mod.FieldToMatch = js.native
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all transformations on the content of the request component identified by FieldToMatch, starting from the lowest priority setting, before inspecting the content for a match.
    */
  var TextTransformations: typings.awsSdk.wafv2Mod.TextTransformations = js.native
}

object SqliMatchStatement {
  @scala.inline
  def apply(FieldToMatch: FieldToMatch, TextTransformations: TextTransformations): SqliMatchStatement = {
    val __obj = js.Dynamic.literal(FieldToMatch = FieldToMatch.asInstanceOf[js.Any], TextTransformations = TextTransformations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqliMatchStatement]
  }
}

