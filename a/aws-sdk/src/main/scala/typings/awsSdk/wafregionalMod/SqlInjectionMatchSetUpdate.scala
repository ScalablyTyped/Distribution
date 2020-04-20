package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSetUpdate extends js.Object {
  /**
    * Specify INSERT to add a SqlInjectionMatchSetUpdate to a SqlInjectionMatchSet. Use DELETE to remove a SqlInjectionMatchSetUpdate from a SqlInjectionMatchSet.
    */
  var Action: ChangeAction = js.native
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var SqlInjectionMatchTuple: typings.awsSdk.wafregionalMod.SqlInjectionMatchTuple = js.native
}

object SqlInjectionMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, SqlInjectionMatchTuple: SqlInjectionMatchTuple): SqlInjectionMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], SqlInjectionMatchTuple = SqlInjectionMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetUpdate]
  }
}

