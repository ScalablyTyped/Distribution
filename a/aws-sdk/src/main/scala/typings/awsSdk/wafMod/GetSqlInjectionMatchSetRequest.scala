package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSqlInjectionMatchSetRequest extends js.Object {
  /**
    * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to get. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId = js.native
}

object GetSqlInjectionMatchSetRequest {
  @scala.inline
  def apply(SqlInjectionMatchSetId: ResourceId): GetSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSqlInjectionMatchSetRequest]
  }
}

