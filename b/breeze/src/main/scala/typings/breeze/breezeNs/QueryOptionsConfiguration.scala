package typings.breeze.breezeNs

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
    if (fetchStrategy != null) __obj.updateDynamic("fetchStrategy")(fetchStrategy)
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy)
    __obj.asInstanceOf[QueryOptionsConfiguration]
  }
}

