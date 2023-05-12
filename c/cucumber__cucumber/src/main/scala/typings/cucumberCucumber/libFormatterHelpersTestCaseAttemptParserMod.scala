package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.ITestCaseAttempt
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderMod.default
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberCucumber.libTypesMod.ILineAndUri
import typings.cucumberMessages.mod.Attachment
import typings.cucumberMessages.mod.PickleStepArgument
import typings.cucumberMessages.mod.TestStepResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersTestCaseAttemptParserMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/test_case_attempt_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseTestCaseAttempt(param0: IParseTestCaseAttemptRequest): IParsedTestCaseAttempt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTestCaseAttempt")(param0.asInstanceOf[js.Any]).asInstanceOf[IParsedTestCaseAttempt]
  
  trait IParseTestCaseAttemptRequest extends StObject {
    
    var snippetBuilder: default
    
    var supportCodeLibrary: ISupportCodeLibrary
    
    var testCaseAttempt: ITestCaseAttempt
  }
  object IParseTestCaseAttemptRequest {
    
    inline def apply(
      snippetBuilder: default,
      supportCodeLibrary: ISupportCodeLibrary,
      testCaseAttempt: ITestCaseAttempt
    ): IParseTestCaseAttemptRequest = {
      val __obj = js.Dynamic.literal(snippetBuilder = snippetBuilder.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any], testCaseAttempt = testCaseAttempt.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParseTestCaseAttemptRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParseTestCaseAttemptRequest] (val x: Self) extends AnyVal {
      
      inline def setSnippetBuilder(value: default): Self = StObject.set(x, "snippetBuilder", value.asInstanceOf[js.Any])
      
      inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
      
      inline def setTestCaseAttempt(value: ITestCaseAttempt): Self = StObject.set(x, "testCaseAttempt", value.asInstanceOf[js.Any])
    }
  }
  
  trait IParsedTestCase extends StObject {
    
    var attempt: Double
    
    var name: String
    
    var sourceLocation: js.UndefOr[ILineAndUri] = js.undefined
    
    var worstTestStepResult: TestStepResult
  }
  object IParsedTestCase {
    
    inline def apply(attempt: Double, name: String, worstTestStepResult: TestStepResult): IParsedTestCase = {
      val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], worstTestStepResult = worstTestStepResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedTestCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParsedTestCase] (val x: Self) extends AnyVal {
      
      inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSourceLocation(value: ILineAndUri): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
      
      inline def setWorstTestStepResult(value: TestStepResult): Self = StObject.set(x, "worstTestStepResult", value.asInstanceOf[js.Any])
    }
  }
  
  trait IParsedTestCaseAttempt extends StObject {
    
    var testCase: IParsedTestCase
    
    var testSteps: js.Array[IParsedTestStep]
  }
  object IParsedTestCaseAttempt {
    
    inline def apply(testCase: IParsedTestCase, testSteps: js.Array[IParsedTestStep]): IParsedTestCaseAttempt = {
      val __obj = js.Dynamic.literal(testCase = testCase.asInstanceOf[js.Any], testSteps = testSteps.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedTestCaseAttempt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParsedTestCaseAttempt] (val x: Self) extends AnyVal {
      
      inline def setTestCase(value: IParsedTestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
      
      inline def setTestSteps(value: js.Array[IParsedTestStep]): Self = StObject.set(x, "testSteps", value.asInstanceOf[js.Any])
      
      inline def setTestStepsVarargs(value: IParsedTestStep*): Self = StObject.set(x, "testSteps", js.Array(value*))
    }
  }
  
  trait IParsedTestStep extends StObject {
    
    var actionLocation: js.UndefOr[ILineAndUri] = js.undefined
    
    var argument: js.UndefOr[PickleStepArgument] = js.undefined
    
    var attachments: js.Array[Attachment]
    
    var keyword: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var result: TestStepResult
    
    var snippet: js.UndefOr[String] = js.undefined
    
    var sourceLocation: js.UndefOr[ILineAndUri] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object IParsedTestStep {
    
    inline def apply(attachments: js.Array[Attachment], keyword: String, result: TestStepResult): IParsedTestStep = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedTestStep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParsedTestStep] (val x: Self) extends AnyVal {
      
      inline def setActionLocation(value: ILineAndUri): Self = StObject.set(x, "actionLocation", value.asInstanceOf[js.Any])
      
      inline def setActionLocationUndefined: Self = StObject.set(x, "actionLocation", js.undefined)
      
      inline def setArgument(value: PickleStepArgument): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResult(value: TestStepResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
      
      inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      
      inline def setSourceLocation(value: ILineAndUri): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
      
      inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
