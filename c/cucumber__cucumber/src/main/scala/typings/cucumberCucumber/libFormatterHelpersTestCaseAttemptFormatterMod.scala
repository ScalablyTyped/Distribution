package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterGetColorFnsMod.IColorFns
import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.ITestCaseAttempt
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersTestCaseAttemptFormatterMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/test_case_attempt_formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatTestCaseAttempt(param0: IFormatTestCaseAttemptRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestCaseAttempt")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IFormatTestCaseAttemptRequest extends StObject {
    
    var colorFns: IColorFns
    
    var printAttachments: js.UndefOr[Boolean] = js.undefined
    
    var snippetBuilder: default
    
    var supportCodeLibrary: ISupportCodeLibrary
    
    var testCaseAttempt: ITestCaseAttempt
  }
  object IFormatTestCaseAttemptRequest {
    
    inline def apply(
      colorFns: IColorFns,
      snippetBuilder: default,
      supportCodeLibrary: ISupportCodeLibrary,
      testCaseAttempt: ITestCaseAttempt
    ): IFormatTestCaseAttemptRequest = {
      val __obj = js.Dynamic.literal(colorFns = colorFns.asInstanceOf[js.Any], snippetBuilder = snippetBuilder.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any], testCaseAttempt = testCaseAttempt.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormatTestCaseAttemptRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormatTestCaseAttemptRequest] (val x: Self) extends AnyVal {
      
      inline def setColorFns(value: IColorFns): Self = StObject.set(x, "colorFns", value.asInstanceOf[js.Any])
      
      inline def setPrintAttachments(value: Boolean): Self = StObject.set(x, "printAttachments", value.asInstanceOf[js.Any])
      
      inline def setPrintAttachmentsUndefined: Self = StObject.set(x, "printAttachments", js.undefined)
      
      inline def setSnippetBuilder(value: default): Self = StObject.set(x, "snippetBuilder", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
      
      inline def setTestCaseAttempt(value: ITestCaseAttempt): Self = StObject.set(x, "testCaseAttempt", value.asInstanceOf[js.Any])
    }
  }
}
