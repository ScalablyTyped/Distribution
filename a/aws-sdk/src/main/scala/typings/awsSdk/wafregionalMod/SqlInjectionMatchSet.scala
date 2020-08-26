package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSet extends js.Object {
  /**
    * The name, if any, of the SqlInjectionMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId = js.native
  /**
    * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
    */
  var SqlInjectionMatchTuples: typings.awsSdk.wafregionalMod.SqlInjectionMatchTuples = js.native
}

object SqlInjectionMatchSet {
  @scala.inline
  def apply(SqlInjectionMatchSetId: ResourceId, SqlInjectionMatchTuples: SqlInjectionMatchTuples): SqlInjectionMatchSet = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any], SqlInjectionMatchTuples = SqlInjectionMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSet]
  }
  @scala.inline
  implicit class SqlInjectionMatchSetOps[Self <: SqlInjectionMatchSet] (val x: Self) extends AnyVal {
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
    def setSqlInjectionMatchSetId(value: ResourceId): Self = this.set("SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSqlInjectionMatchTuplesVarargs(value: SqlInjectionMatchTuple*): Self = this.set("SqlInjectionMatchTuples", js.Array(value :_*))
    @scala.inline
    def setSqlInjectionMatchTuples(value: SqlInjectionMatchTuples): Self = this.set("SqlInjectionMatchTuples", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

