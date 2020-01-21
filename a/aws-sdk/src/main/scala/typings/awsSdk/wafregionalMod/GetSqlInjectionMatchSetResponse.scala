package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSqlInjectionMatchSetResponse extends js.Object {
  /**
    * Information about the SqlInjectionMatchSet that you specified in the GetSqlInjectionMatchSet request. For more information, see the following topics:    SqlInjectionMatchSet: Contains Name, SqlInjectionMatchSetId, and an array of SqlInjectionMatchTuple objects    SqlInjectionMatchTuple: Each SqlInjectionMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var SqlInjectionMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.SqlInjectionMatchSet] = js.native
}

object GetSqlInjectionMatchSetResponse {
  @scala.inline
  def apply(SqlInjectionMatchSet: SqlInjectionMatchSet = null): GetSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (SqlInjectionMatchSet != null) __obj.updateDynamic("SqlInjectionMatchSet")(SqlInjectionMatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSqlInjectionMatchSetResponse]
  }
}

