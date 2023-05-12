package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterGetColorFnsMod.IColorFns
import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.ITestCaseAttempt
import typings.cucumberMessages.mod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersSummaryHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/summary_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatSummary(param0: IFormatSummaryRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSummary")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IFormatSummaryRequest extends StObject {
    
    var colorFns: IColorFns
    
    var testCaseAttempts: js.Array[ITestCaseAttempt]
    
    var testRunDuration: Duration
  }
  object IFormatSummaryRequest {
    
    inline def apply(colorFns: IColorFns, testCaseAttempts: js.Array[ITestCaseAttempt], testRunDuration: Duration): IFormatSummaryRequest = {
      val __obj = js.Dynamic.literal(colorFns = colorFns.asInstanceOf[js.Any], testCaseAttempts = testCaseAttempts.asInstanceOf[js.Any], testRunDuration = testRunDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormatSummaryRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormatSummaryRequest] (val x: Self) extends AnyVal {
      
      inline def setColorFns(value: IColorFns): Self = StObject.set(x, "colorFns", value.asInstanceOf[js.Any])
      
      inline def setTestCaseAttempts(value: js.Array[ITestCaseAttempt]): Self = StObject.set(x, "testCaseAttempts", value.asInstanceOf[js.Any])
      
      inline def setTestCaseAttemptsVarargs(value: ITestCaseAttempt*): Self = StObject.set(x, "testCaseAttempts", js.Array(value*))
      
      inline def setTestRunDuration(value: Duration): Self = StObject.set(x, "testRunDuration", value.asInstanceOf[js.Any])
    }
  }
}
