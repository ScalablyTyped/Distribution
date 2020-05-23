package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var fetchStrategy: FetchStrategySymbol = js.native
  /** Whether query should return cached deleted entities (false by default) */
  var includeDeleted: Boolean = js.native
  var mergeStrategy: MergeStrategySymbol = js.native
  def setAsDefault(): Unit = js.native
  def using(config: FetchStrategySymbol): QueryOptions = js.native
  def using(config: MergeStrategySymbol): QueryOptions = js.native
  def using(config: QueryOptionsConfiguration): QueryOptions = js.native
}

