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
  @scala.inline
  implicit class SqliMatchStatementOps[Self <: SqliMatchStatement] (val x: Self) extends AnyVal {
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
    def setFieldToMatch(value: FieldToMatch): Self = this.set("FieldToMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextTransformationsVarargs(value: TextTransformation*): Self = this.set("TextTransformations", js.Array(value :_*))
    @scala.inline
    def setTextTransformations(value: TextTransformations): Self = this.set("TextTransformations", value.asInstanceOf[js.Any])
  }
  
}

