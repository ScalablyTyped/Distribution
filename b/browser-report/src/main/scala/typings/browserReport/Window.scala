package typings.browserReport

import typings.std.ErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def browserReport(result: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, js.Any]): Unit
  
  def browserReportSync(): ReportResult
}
object Window {
  
  @scala.inline
  def apply(
    browserReport: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, js.Any] => Unit,
    browserReportSync: () => ReportResult
  ): Window = {
    val __obj = js.Dynamic.literal(browserReport = js.Any.fromFunction1(browserReport), browserReportSync = js.Any.fromFunction0(browserReportSync))
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserReport(value: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, js.Any] => Unit): Self = StObject.set(x, "browserReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBrowserReportSync(value: () => ReportResult): Self = StObject.set(x, "browserReportSync", js.Any.fromFunction0(value))
  }
}
