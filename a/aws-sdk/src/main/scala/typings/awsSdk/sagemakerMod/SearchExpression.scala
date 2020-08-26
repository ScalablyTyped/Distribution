package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchExpression extends js.Object {
  /**
    * A list of filter objects.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * A list of nested filter objects.
    */
  var NestedFilters: js.UndefOr[NestedFiltersList] = js.native
  /**
    * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists to be satisfied for the entire search expression to be true, specify And. If only a single conditional statement needs to be true for the entire search expression to be true, specify Or. The default value is And.
    */
  var Operator: js.UndefOr[BooleanOperator] = js.native
  /**
    * A list of search expression objects.
    */
  var SubExpressions: js.UndefOr[SearchExpressionList] = js.native
}

object SearchExpression {
  @scala.inline
  def apply(): SearchExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchExpression]
  }
  @scala.inline
  implicit class SearchExpressionOps[Self <: SearchExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setNestedFiltersVarargs(value: NestedFilters*): Self = this.set("NestedFilters", js.Array(value :_*))
    @scala.inline
    def setNestedFilters(value: NestedFiltersList): Self = this.set("NestedFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedFilters: Self = this.set("NestedFilters", js.undefined)
    @scala.inline
    def setOperator(value: BooleanOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("Operator", js.undefined)
    @scala.inline
    def setSubExpressionsVarargs(value: SearchExpression*): Self = this.set("SubExpressions", js.Array(value :_*))
    @scala.inline
    def setSubExpressions(value: SearchExpressionList): Self = this.set("SubExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubExpressions: Self = this.set("SubExpressions", js.undefined)
  }
  
}

