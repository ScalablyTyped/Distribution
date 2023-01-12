package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reporter extends StObject {
  
  def log(str: String): Unit
  
  def reportRunnerResults(runner: Runner): Unit
  
  def reportRunnerStarting(runner: Runner): Unit
  
  def reportSpecResults(spec: Spec): Unit
  
  def reportSpecStarting(spec: Spec): Unit
  
  def reportSuiteResults(suite: Suite): Unit
}
object Reporter {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setReportRunnerResults(value: Runner => Unit): Self = StObject.set(x, "reportRunnerResults", js.Any.fromFunction1(value))
    
    inline def setReportRunnerStarting(value: Runner => Unit): Self = StObject.set(x, "reportRunnerStarting", js.Any.fromFunction1(value))
    
    inline def setReportSpecResults(value: Spec => Unit): Self = StObject.set(x, "reportSpecResults", js.Any.fromFunction1(value))
    
    inline def setReportSpecStarting(value: Spec => Unit): Self = StObject.set(x, "reportSpecStarting", js.Any.fromFunction1(value))
    
    inline def setReportSuiteResults(value: Suite => Unit): Self = StObject.set(x, "reportSuiteResults", js.Any.fromFunction1(value))
  }
}
