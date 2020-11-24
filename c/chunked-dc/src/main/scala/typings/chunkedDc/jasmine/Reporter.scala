package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reporter extends js.Object {
  
  def log(str: String): Unit = js.native
  
  def reportRunnerResults(runner: Runner): Unit = js.native
  
  def reportRunnerStarting(runner: Runner): Unit = js.native
  
  def reportSpecResults(spec: Spec): Unit = js.native
  
  def reportSpecStarting(spec: Spec): Unit = js.native
  
  def reportSuiteResults(suite: Suite): Unit = js.native
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
  
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    
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
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportRunnerResults(value: Runner => Unit): Self = this.set("reportRunnerResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportRunnerStarting(value: Runner => Unit): Self = this.set("reportRunnerStarting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportSpecResults(value: Spec => Unit): Self = this.set("reportSpecResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportSpecStarting(value: Spec => Unit): Self = this.set("reportSpecStarting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportSuiteResults(value: Suite => Unit): Self = this.set("reportSuiteResults", js.Any.fromFunction1(value))
  }
}
