package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Envelope. */
trait IEnvelope extends StObject {
  
  /** Envelope attachment */
  var attachment: js.UndefOr[IAttachment | Null] = js.undefined
  
  /** Envelope commandActionComplete */
  var commandActionComplete: js.UndefOr[ICommandActionComplete | Null] = js.undefined
  
  /** Envelope commandError */
  var commandError: js.UndefOr[String | Null] = js.undefined
  
  /** Envelope commandGenerateSnippet */
  var commandGenerateSnippet: js.UndefOr[ICommandGenerateSnippet | Null] = js.undefined
  
  /** Envelope commandInitializeTestCase */
  var commandInitializeTestCase: js.UndefOr[ICommandInitializeTestCase | Null] = js.undefined
  
  /** Envelope commandRunAfterTestCaseHook */
  var commandRunAfterTestCaseHook: js.UndefOr[ICommandRunAfterTestCaseHook | Null] = js.undefined
  
  /** Envelope commandRunAfterTestRunHooks */
  var commandRunAfterTestRunHooks: js.UndefOr[ICommandRunAfterTestRunHooks | Null] = js.undefined
  
  /** Envelope commandRunBeforeTestCaseHook */
  var commandRunBeforeTestCaseHook: js.UndefOr[ICommandRunBeforeTestCaseHook | Null] = js.undefined
  
  /** Envelope commandRunBeforeTestRunHooks */
  var commandRunBeforeTestRunHooks: js.UndefOr[ICommandRunBeforeTestRunHooks | Null] = js.undefined
  
  /** Envelope commandRunTestStep */
  var commandRunTestStep: js.UndefOr[ICommandRunTestStep | Null] = js.undefined
  
  /** Envelope commandStart */
  var commandStart: js.UndefOr[ICommandStart | Null] = js.undefined
  
  /** Envelope gherkinDocument */
  var gherkinDocument: js.UndefOr[IGherkinDocument | Null] = js.undefined
  
  /** Envelope hook */
  var hook: js.UndefOr[IHook | Null] = js.undefined
  
  /** Envelope pickle */
  var pickle: js.UndefOr[IPickle | Null] = js.undefined
  
  /** Envelope pickleAccepted */
  var pickleAccepted: js.UndefOr[IPickleAccepted | Null] = js.undefined
  
  /** Envelope pickleRejected */
  var pickleRejected: js.UndefOr[IPickleRejected | Null] = js.undefined
  
  /** Envelope source */
  var source: js.UndefOr[ISource | Null] = js.undefined
  
  /** Envelope stepDefinition */
  var stepDefinition: js.UndefOr[IStepDefinition | Null] = js.undefined
  
  /** Envelope testCase */
  var testCase: js.UndefOr[ITestCase | Null] = js.undefined
  
  /** Envelope testCaseFinished */
  var testCaseFinished: js.UndefOr[ITestCaseFinished | Null] = js.undefined
  
  /** Envelope testCasePrepared */
  var testCasePrepared: js.UndefOr[ITestCasePrepared | Null] = js.undefined
  
  /** Envelope testCaseStarted */
  var testCaseStarted: js.UndefOr[ITestCaseStarted | Null] = js.undefined
  
  /** Envelope testRunFinished */
  var testRunFinished: js.UndefOr[ITestRunFinished | Null] = js.undefined
  
  /** Envelope testRunStarted */
  var testRunStarted: js.UndefOr[ITestRunStarted | Null] = js.undefined
  
  /** Envelope testStepFinished */
  var testStepFinished: js.UndefOr[ITestStepFinished | Null] = js.undefined
  
  /** Envelope testStepStarted */
  var testStepStarted: js.UndefOr[ITestStepStarted | Null] = js.undefined
}
object IEnvelope {
  
  inline def apply(): IEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnvelope]
  }
  
  extension [Self <: IEnvelope](x: Self) {
    
    inline def setAttachment(value: IAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentNull: Self = StObject.set(x, "attachment", null)
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setCommandActionComplete(value: ICommandActionComplete): Self = StObject.set(x, "commandActionComplete", value.asInstanceOf[js.Any])
    
    inline def setCommandActionCompleteNull: Self = StObject.set(x, "commandActionComplete", null)
    
    inline def setCommandActionCompleteUndefined: Self = StObject.set(x, "commandActionComplete", js.undefined)
    
    inline def setCommandError(value: String): Self = StObject.set(x, "commandError", value.asInstanceOf[js.Any])
    
    inline def setCommandErrorNull: Self = StObject.set(x, "commandError", null)
    
    inline def setCommandErrorUndefined: Self = StObject.set(x, "commandError", js.undefined)
    
    inline def setCommandGenerateSnippet(value: ICommandGenerateSnippet): Self = StObject.set(x, "commandGenerateSnippet", value.asInstanceOf[js.Any])
    
    inline def setCommandGenerateSnippetNull: Self = StObject.set(x, "commandGenerateSnippet", null)
    
    inline def setCommandGenerateSnippetUndefined: Self = StObject.set(x, "commandGenerateSnippet", js.undefined)
    
    inline def setCommandInitializeTestCase(value: ICommandInitializeTestCase): Self = StObject.set(x, "commandInitializeTestCase", value.asInstanceOf[js.Any])
    
    inline def setCommandInitializeTestCaseNull: Self = StObject.set(x, "commandInitializeTestCase", null)
    
    inline def setCommandInitializeTestCaseUndefined: Self = StObject.set(x, "commandInitializeTestCase", js.undefined)
    
    inline def setCommandRunAfterTestCaseHook(value: ICommandRunAfterTestCaseHook): Self = StObject.set(x, "commandRunAfterTestCaseHook", value.asInstanceOf[js.Any])
    
    inline def setCommandRunAfterTestCaseHookNull: Self = StObject.set(x, "commandRunAfterTestCaseHook", null)
    
    inline def setCommandRunAfterTestCaseHookUndefined: Self = StObject.set(x, "commandRunAfterTestCaseHook", js.undefined)
    
    inline def setCommandRunAfterTestRunHooks(value: ICommandRunAfterTestRunHooks): Self = StObject.set(x, "commandRunAfterTestRunHooks", value.asInstanceOf[js.Any])
    
    inline def setCommandRunAfterTestRunHooksNull: Self = StObject.set(x, "commandRunAfterTestRunHooks", null)
    
    inline def setCommandRunAfterTestRunHooksUndefined: Self = StObject.set(x, "commandRunAfterTestRunHooks", js.undefined)
    
    inline def setCommandRunBeforeTestCaseHook(value: ICommandRunBeforeTestCaseHook): Self = StObject.set(x, "commandRunBeforeTestCaseHook", value.asInstanceOf[js.Any])
    
    inline def setCommandRunBeforeTestCaseHookNull: Self = StObject.set(x, "commandRunBeforeTestCaseHook", null)
    
    inline def setCommandRunBeforeTestCaseHookUndefined: Self = StObject.set(x, "commandRunBeforeTestCaseHook", js.undefined)
    
    inline def setCommandRunBeforeTestRunHooks(value: ICommandRunBeforeTestRunHooks): Self = StObject.set(x, "commandRunBeforeTestRunHooks", value.asInstanceOf[js.Any])
    
    inline def setCommandRunBeforeTestRunHooksNull: Self = StObject.set(x, "commandRunBeforeTestRunHooks", null)
    
    inline def setCommandRunBeforeTestRunHooksUndefined: Self = StObject.set(x, "commandRunBeforeTestRunHooks", js.undefined)
    
    inline def setCommandRunTestStep(value: ICommandRunTestStep): Self = StObject.set(x, "commandRunTestStep", value.asInstanceOf[js.Any])
    
    inline def setCommandRunTestStepNull: Self = StObject.set(x, "commandRunTestStep", null)
    
    inline def setCommandRunTestStepUndefined: Self = StObject.set(x, "commandRunTestStep", js.undefined)
    
    inline def setCommandStart(value: ICommandStart): Self = StObject.set(x, "commandStart", value.asInstanceOf[js.Any])
    
    inline def setCommandStartNull: Self = StObject.set(x, "commandStart", null)
    
    inline def setCommandStartUndefined: Self = StObject.set(x, "commandStart", js.undefined)
    
    inline def setGherkinDocument(value: IGherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
    
    inline def setGherkinDocumentNull: Self = StObject.set(x, "gherkinDocument", null)
    
    inline def setGherkinDocumentUndefined: Self = StObject.set(x, "gherkinDocument", js.undefined)
    
    inline def setHook(value: IHook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHookNull: Self = StObject.set(x, "hook", null)
    
    inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    inline def setPickle(value: IPickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    
    inline def setPickleAccepted(value: IPickleAccepted): Self = StObject.set(x, "pickleAccepted", value.asInstanceOf[js.Any])
    
    inline def setPickleAcceptedNull: Self = StObject.set(x, "pickleAccepted", null)
    
    inline def setPickleAcceptedUndefined: Self = StObject.set(x, "pickleAccepted", js.undefined)
    
    inline def setPickleNull: Self = StObject.set(x, "pickle", null)
    
    inline def setPickleRejected(value: IPickleRejected): Self = StObject.set(x, "pickleRejected", value.asInstanceOf[js.Any])
    
    inline def setPickleRejectedNull: Self = StObject.set(x, "pickleRejected", null)
    
    inline def setPickleRejectedUndefined: Self = StObject.set(x, "pickleRejected", js.undefined)
    
    inline def setPickleUndefined: Self = StObject.set(x, "pickle", js.undefined)
    
    inline def setSource(value: ISource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStepDefinition(value: IStepDefinition): Self = StObject.set(x, "stepDefinition", value.asInstanceOf[js.Any])
    
    inline def setStepDefinitionNull: Self = StObject.set(x, "stepDefinition", null)
    
    inline def setStepDefinitionUndefined: Self = StObject.set(x, "stepDefinition", js.undefined)
    
    inline def setTestCase(value: ITestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseFinished(value: ITestCaseFinished): Self = StObject.set(x, "testCaseFinished", value.asInstanceOf[js.Any])
    
    inline def setTestCaseFinishedNull: Self = StObject.set(x, "testCaseFinished", null)
    
    inline def setTestCaseFinishedUndefined: Self = StObject.set(x, "testCaseFinished", js.undefined)
    
    inline def setTestCaseNull: Self = StObject.set(x, "testCase", null)
    
    inline def setTestCasePrepared(value: ITestCasePrepared): Self = StObject.set(x, "testCasePrepared", value.asInstanceOf[js.Any])
    
    inline def setTestCasePreparedNull: Self = StObject.set(x, "testCasePrepared", null)
    
    inline def setTestCasePreparedUndefined: Self = StObject.set(x, "testCasePrepared", js.undefined)
    
    inline def setTestCaseStarted(value: ITestCaseStarted): Self = StObject.set(x, "testCaseStarted", value.asInstanceOf[js.Any])
    
    inline def setTestCaseStartedNull: Self = StObject.set(x, "testCaseStarted", null)
    
    inline def setTestCaseStartedUndefined: Self = StObject.set(x, "testCaseStarted", js.undefined)
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    inline def setTestRunFinished(value: ITestRunFinished): Self = StObject.set(x, "testRunFinished", value.asInstanceOf[js.Any])
    
    inline def setTestRunFinishedNull: Self = StObject.set(x, "testRunFinished", null)
    
    inline def setTestRunFinishedUndefined: Self = StObject.set(x, "testRunFinished", js.undefined)
    
    inline def setTestRunStarted(value: ITestRunStarted): Self = StObject.set(x, "testRunStarted", value.asInstanceOf[js.Any])
    
    inline def setTestRunStartedNull: Self = StObject.set(x, "testRunStarted", null)
    
    inline def setTestRunStartedUndefined: Self = StObject.set(x, "testRunStarted", js.undefined)
    
    inline def setTestStepFinished(value: ITestStepFinished): Self = StObject.set(x, "testStepFinished", value.asInstanceOf[js.Any])
    
    inline def setTestStepFinishedNull: Self = StObject.set(x, "testStepFinished", null)
    
    inline def setTestStepFinishedUndefined: Self = StObject.set(x, "testStepFinished", js.undefined)
    
    inline def setTestStepStarted(value: ITestStepStarted): Self = StObject.set(x, "testStepStarted", value.asInstanceOf[js.Any])
    
    inline def setTestStepStartedNull: Self = StObject.set(x, "testStepStarted", null)
    
    inline def setTestStepStartedUndefined: Self = StObject.set(x, "testStepStarted", js.undefined)
  }
}
