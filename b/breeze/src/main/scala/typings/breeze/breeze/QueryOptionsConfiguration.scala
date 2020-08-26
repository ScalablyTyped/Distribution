package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptionsConfiguration extends js.Object {
  var fetchStrategy: js.UndefOr[FetchStrategySymbol] = js.native
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.native
}

object QueryOptionsConfiguration {
  @scala.inline
  def apply(): QueryOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptionsConfiguration]
  }
  @scala.inline
  implicit class QueryOptionsConfigurationOps[Self <: QueryOptionsConfiguration] (val x: Self) extends AnyVal {
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
    def setFetchStrategy(value: FetchStrategySymbol): Self = this.set("fetchStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchStrategy: Self = this.set("fetchStrategy", js.undefined)
    @scala.inline
    def setMergeStrategy(value: MergeStrategySymbol): Self = this.set("mergeStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeStrategy: Self = this.set("mergeStrategy", js.undefined)
  }
  
}

