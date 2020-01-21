package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedResults extends Result {
  var description: String
  var failedCount: Double
  var passedCount: Double
  var skipped: Boolean
  var totalCount: Double
  def addResult(result: Result): Unit
  def getItems(): js.Array[Result]
  def log(values: js.Any): Unit
  def passed(): Boolean
  def rollupCounts(result: NestedResults): Unit
}

object NestedResults {
  @scala.inline
  def apply(
    addResult: Result => Unit,
    description: String,
    failedCount: Double,
    getItems: () => js.Array[Result],
    log: js.Any => Unit,
    passed: () => Boolean,
    passedCount: Double,
    rollupCounts: NestedResults => Unit,
    skipped: Boolean,
    totalCount: Double,
    `type`: String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction1(addResult), description = description.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], getItems = js.Any.fromFunction0(getItems), log = js.Any.fromFunction1(log), passed = js.Any.fromFunction0(passed), passedCount = passedCount.asInstanceOf[js.Any], rollupCounts = js.Any.fromFunction1(rollupCounts), skipped = skipped.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedResults]
  }
}

