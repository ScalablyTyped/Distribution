package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def log(str: String): Unit
  def reportRunnerResults(runner: Runner): Unit
  def reportRunnerStarting(runner: Runner): Unit
  def reportSpecResults(spec: Spec): Unit
  def reportSpecStarting(spec: Spec): Unit
  def reportSuiteResults(suite: Suite): Unit
}

object Reporter {
  @scala.inline
  def apply(
    log: String => Unit,
    reportRunnerResults: Runner => Unit,
    reportRunnerStarting: Runner => Unit,
    reportSpecResults: Spec => Unit,
    reportSpecStarting: Spec => Unit,
    reportSuiteResults: Suite => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), reportRunnerResults = js.Any.fromFunction1(reportRunnerResults), reportRunnerStarting = js.Any.fromFunction1(reportRunnerStarting), reportSpecResults = js.Any.fromFunction1(reportSpecResults), reportSpecStarting = js.Any.fromFunction1(reportSpecStarting), reportSuiteResults = js.Any.fromFunction1(reportSuiteResults))
  
    __obj.asInstanceOf[Reporter]
  }
}

