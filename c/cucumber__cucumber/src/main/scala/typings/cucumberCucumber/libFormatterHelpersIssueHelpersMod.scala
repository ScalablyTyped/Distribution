package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterGetColorFnsMod.IColorFns
import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.ITestCaseAttempt
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.mod.TestStepResult
import typings.cucumberMessages.mod.UndefinedParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersIssueHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/issue_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatIssue(param0: IFormatIssueRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatUndefinedParameterType(parameterType: UndefinedParameterType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUndefinedParameterType")(parameterType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatUndefinedParameterTypes(undefinedParameterTypes: js.Array[UndefinedParameterType]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUndefinedParameterTypes")(undefinedParameterTypes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isFailure(result: TestStepResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFailure")(result.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFailure(result: TestStepResult, willBeRetried: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFailure")(result.asInstanceOf[js.Any], willBeRetried.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIssue(result: TestStepResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssue")(result.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWarning(result: TestStepResult): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWarning")(result.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isWarning(result: TestStepResult, willBeRetried: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWarning")(result.asInstanceOf[js.Any], willBeRetried.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IFormatIssueRequest extends StObject {
    
    var colorFns: IColorFns
    
    var number: Double
    
    var printAttachments: js.UndefOr[Boolean] = js.undefined
    
    var snippetBuilder: default
    
    var supportCodeLibrary: ISupportCodeLibrary
    
    var testCaseAttempt: ITestCaseAttempt
  }
  object IFormatIssueRequest {
    
    inline def apply(
      colorFns: IColorFns,
      number: Double,
      snippetBuilder: default,
      supportCodeLibrary: ISupportCodeLibrary,
      testCaseAttempt: ITestCaseAttempt
    ): IFormatIssueRequest = {
      val __obj = js.Dynamic.literal(colorFns = colorFns.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], snippetBuilder = snippetBuilder.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any], testCaseAttempt = testCaseAttempt.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormatIssueRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFormatIssueRequest] (val x: Self) extends AnyVal {
      
      inline def setColorFns(value: IColorFns): Self = StObject.set(x, "colorFns", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPrintAttachments(value: Boolean): Self = StObject.set(x, "printAttachments", value.asInstanceOf[js.Any])
      
      inline def setPrintAttachmentsUndefined: Self = StObject.set(x, "printAttachments", js.undefined)
      
      inline def setSnippetBuilder(value: default): Self = StObject.set(x, "snippetBuilder", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
      
      inline def setTestCaseAttempt(value: ITestCaseAttempt): Self = StObject.set(x, "testCaseAttempt", value.asInstanceOf[js.Any])
    }
  }
}
