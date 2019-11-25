package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsConfiguration extends js.Object {
  var fetchStrategy: js.UndefOr[FetchStrategySymbol] = js.undefined
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.undefined
}

object QueryOptionsConfiguration {
  @scala.inline
  def apply(fetchStrategy: FetchStrategySymbol = null, mergeStrategy: MergeStrategySymbol = null): QueryOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (fetchStrategy != null) __obj.updateDynamic("fetchStrategy")(fetchStrategy.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsConfiguration]
  }
}

