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
  
  @scala.inline
  def apply(): IEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnvelope]
  }
  
  @scala.inline
  implicit class IEnvelopeMutableBuilder[Self <: IEnvelope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: IAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentNull: Self = StObject.set(x, "attachment", null)
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    @scala.inline
    def setCommandActionComplete(value: ICommandActionComplete): Self = StObject.set(x, "commandActionComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandActionCompleteNull: Self = StObject.set(x, "commandActionComplete", null)
    
    @scala.inline
    def setCommandActionCompleteUndefined: Self = StObject.set(x, "commandActionComplete", js.undefined)
    
    @scala.inline
    def setCommandError(value: String): Self = StObject.set(x, "commandError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandErrorNull: Self = StObject.set(x, "commandError", null)
    
    @scala.inline
    def setCommandErrorUndefined: Self = StObject.set(x, "commandError", js.undefined)
    
    @scala.inline
    def setCommandGenerateSnippet(value: ICommandGenerateSnippet): Self = StObject.set(x, "commandGenerateSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandGenerateSnippetNull: Self = StObject.set(x, "commandGenerateSnippet", null)
    
    @scala.inline
    def setCommandGenerateSnippetUndefined: Self = StObject.set(x, "commandGenerateSnippet", js.undefined)
    
    @scala.inline
    def setCommandInitializeTestCase(value: ICommandInitializeTestCase): Self = StObject.set(x, "commandInitializeTestCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandInitializeTestCaseNull: Self = StObject.set(x, "commandInitializeTestCase", null)
    
    @scala.inline
    def setCommandInitializeTestCaseUndefined: Self = StObject.set(x, "commandInitializeTestCase", js.undefined)
    
    @scala.inline
    def setCommandRunAfterTestCaseHook(value: ICommandRunAfterTestCaseHook): Self = StObject.set(x, "commandRunAfterTestCaseHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandRunAfterTestCaseHookNull: Self = StObject.set(x, "commandRunAfterTestCaseHook", null)
    
    @scala.inline
    def setCommandRunAfterTestCaseHookUndefined: Self = StObject.set(x, "commandRunAfterTestCaseHook", js.undefined)
    
    @scala.inline
    def setCommandRunAfterTestRunHooks(value: ICommandRunAfterTestRunHooks): Self = StObject.set(x, "commandRunAfterTestRunHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandRunAfterTestRunHooksNull: Self = StObject.set(x, "commandRunAfterTestRunHooks", null)
    
    @scala.inline
    def setCommandRunAfterTestRunHooksUndefined: Self = StObject.set(x, "commandRunAfterTestRunHooks", js.undefined)
    
    @scala.inline
    def setCommandRunBeforeTestCaseHook(value: ICommandRunBeforeTestCaseHook): Self = StObject.set(x, "commandRunBeforeTestCaseHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandRunBeforeTestCaseHookNull: Self = StObject.set(x, "commandRunBeforeTestCaseHook", null)
    
    @scala.inline
    def setCommandRunBeforeTestCaseHookUndefined: Self = StObject.set(x, "commandRunBeforeTestCaseHook", js.undefined)
    
    @scala.inline
    def setCommandRunBeforeTestRunHooks(value: ICommandRunBeforeTestRunHooks): Self = StObject.set(x, "commandRunBeforeTestRunHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandRunBeforeTestRunHooksNull: Self = StObject.set(x, "commandRunBeforeTestRunHooks", null)
    
    @scala.inline
    def setCommandRunBeforeTestRunHooksUndefined: Self = StObject.set(x, "commandRunBeforeTestRunHooks", js.undefined)
    
    @scala.inline
    def setCommandRunTestStep(value: ICommandRunTestStep): Self = StObject.set(x, "commandRunTestStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandRunTestStepNull: Self = StObject.set(x, "commandRunTestStep", null)
    
    @scala.inline
    def setCommandRunTestStepUndefined: Self = StObject.set(x, "commandRunTestStep", js.undefined)
    
    @scala.inline
    def setCommandStart(value: ICommandStart): Self = StObject.set(x, "commandStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandStartNull: Self = StObject.set(x, "commandStart", null)
    
    @scala.inline
    def setCommandStartUndefined: Self = StObject.set(x, "commandStart", js.undefined)
    
    @scala.inline
    def setGherkinDocument(value: IGherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGherkinDocumentNull: Self = StObject.set(x, "gherkinDocument", null)
    
    @scala.inline
    def setGherkinDocumentUndefined: Self = StObject.set(x, "gherkinDocument", js.undefined)
    
    @scala.inline
    def setHook(value: IHook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookNull: Self = StObject.set(x, "hook", null)
    
    @scala.inline
    def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    @scala.inline
    def setPickle(value: IPickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleAccepted(value: IPickleAccepted): Self = StObject.set(x, "pickleAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleAcceptedNull: Self = StObject.set(x, "pickleAccepted", null)
    
    @scala.inline
    def setPickleAcceptedUndefined: Self = StObject.set(x, "pickleAccepted", js.undefined)
    
    @scala.inline
    def setPickleNull: Self = StObject.set(x, "pickle", null)
    
    @scala.inline
    def setPickleRejected(value: IPickleRejected): Self = StObject.set(x, "pickleRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleRejectedNull: Self = StObject.set(x, "pickleRejected", null)
    
    @scala.inline
    def setPickleRejectedUndefined: Self = StObject.set(x, "pickleRejected", js.undefined)
    
    @scala.inline
    def setPickleUndefined: Self = StObject.set(x, "pickle", js.undefined)
    
    @scala.inline
    def setSource(value: ISource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStepDefinition(value: IStepDefinition): Self = StObject.set(x, "stepDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDefinitionNull: Self = StObject.set(x, "stepDefinition", null)
    
    @scala.inline
    def setStepDefinitionUndefined: Self = StObject.set(x, "stepDefinition", js.undefined)
    
    @scala.inline
    def setTestCase(value: ITestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseFinished(value: ITestCaseFinished): Self = StObject.set(x, "testCaseFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseFinishedNull: Self = StObject.set(x, "testCaseFinished", null)
    
    @scala.inline
    def setTestCaseFinishedUndefined: Self = StObject.set(x, "testCaseFinished", js.undefined)
    
    @scala.inline
    def setTestCaseNull: Self = StObject.set(x, "testCase", null)
    
    @scala.inline
    def setTestCasePrepared(value: ITestCasePrepared): Self = StObject.set(x, "testCasePrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasePreparedNull: Self = StObject.set(x, "testCasePrepared", null)
    
    @scala.inline
    def setTestCasePreparedUndefined: Self = StObject.set(x, "testCasePrepared", js.undefined)
    
    @scala.inline
    def setTestCaseStarted(value: ITestCaseStarted): Self = StObject.set(x, "testCaseStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseStartedNull: Self = StObject.set(x, "testCaseStarted", null)
    
    @scala.inline
    def setTestCaseStartedUndefined: Self = StObject.set(x, "testCaseStarted", js.undefined)
    
    @scala.inline
    def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    @scala.inline
    def setTestRunFinished(value: ITestRunFinished): Self = StObject.set(x, "testRunFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunFinishedNull: Self = StObject.set(x, "testRunFinished", null)
    
    @scala.inline
    def setTestRunFinishedUndefined: Self = StObject.set(x, "testRunFinished", js.undefined)
    
    @scala.inline
    def setTestRunStarted(value: ITestRunStarted): Self = StObject.set(x, "testRunStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunStartedNull: Self = StObject.set(x, "testRunStarted", null)
    
    @scala.inline
    def setTestRunStartedUndefined: Self = StObject.set(x, "testRunStarted", js.undefined)
    
    @scala.inline
    def setTestStepFinished(value: ITestStepFinished): Self = StObject.set(x, "testStepFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStepFinishedNull: Self = StObject.set(x, "testStepFinished", null)
    
    @scala.inline
    def setTestStepFinishedUndefined: Self = StObject.set(x, "testStepFinished", js.undefined)
    
    @scala.inline
    def setTestStepStarted(value: ITestStepStarted): Self = StObject.set(x, "testStepStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStepStartedNull: Self = StObject.set(x, "testStepStarted", null)
    
    @scala.inline
    def setTestStepStartedUndefined: Self = StObject.set(x, "testStepStarted", js.undefined)
  }
}
