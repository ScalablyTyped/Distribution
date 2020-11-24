package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Envelope. */
@js.native
trait IEnvelope extends js.Object {
  
  /** Envelope attachment */
  var attachment: js.UndefOr[IAttachment | Null] = js.native
  
  /** Envelope commandActionComplete */
  var commandActionComplete: js.UndefOr[ICommandActionComplete | Null] = js.native
  
  /** Envelope commandError */
  var commandError: js.UndefOr[String | Null] = js.native
  
  /** Envelope commandGenerateSnippet */
  var commandGenerateSnippet: js.UndefOr[ICommandGenerateSnippet | Null] = js.native
  
  /** Envelope commandInitializeTestCase */
  var commandInitializeTestCase: js.UndefOr[ICommandInitializeTestCase | Null] = js.native
  
  /** Envelope commandRunAfterTestCaseHook */
  var commandRunAfterTestCaseHook: js.UndefOr[ICommandRunAfterTestCaseHook | Null] = js.native
  
  /** Envelope commandRunAfterTestRunHooks */
  var commandRunAfterTestRunHooks: js.UndefOr[ICommandRunAfterTestRunHooks | Null] = js.native
  
  /** Envelope commandRunBeforeTestCaseHook */
  var commandRunBeforeTestCaseHook: js.UndefOr[ICommandRunBeforeTestCaseHook | Null] = js.native
  
  /** Envelope commandRunBeforeTestRunHooks */
  var commandRunBeforeTestRunHooks: js.UndefOr[ICommandRunBeforeTestRunHooks | Null] = js.native
  
  /** Envelope commandRunTestStep */
  var commandRunTestStep: js.UndefOr[ICommandRunTestStep | Null] = js.native
  
  /** Envelope commandStart */
  var commandStart: js.UndefOr[ICommandStart | Null] = js.native
  
  /** Envelope gherkinDocument */
  var gherkinDocument: js.UndefOr[IGherkinDocument | Null] = js.native
  
  /** Envelope hook */
  var hook: js.UndefOr[IHook | Null] = js.native
  
  /** Envelope pickle */
  var pickle: js.UndefOr[IPickle | Null] = js.native
  
  /** Envelope pickleAccepted */
  var pickleAccepted: js.UndefOr[IPickleAccepted | Null] = js.native
  
  /** Envelope pickleRejected */
  var pickleRejected: js.UndefOr[IPickleRejected | Null] = js.native
  
  /** Envelope source */
  var source: js.UndefOr[ISource | Null] = js.native
  
  /** Envelope stepDefinition */
  var stepDefinition: js.UndefOr[IStepDefinition | Null] = js.native
  
  /** Envelope testCase */
  var testCase: js.UndefOr[ITestCase | Null] = js.native
  
  /** Envelope testCaseFinished */
  var testCaseFinished: js.UndefOr[ITestCaseFinished | Null] = js.native
  
  /** Envelope testCasePrepared */
  var testCasePrepared: js.UndefOr[ITestCasePrepared | Null] = js.native
  
  /** Envelope testCaseStarted */
  var testCaseStarted: js.UndefOr[ITestCaseStarted | Null] = js.native
  
  /** Envelope testRunFinished */
  var testRunFinished: js.UndefOr[ITestRunFinished | Null] = js.native
  
  /** Envelope testRunStarted */
  var testRunStarted: js.UndefOr[ITestRunStarted | Null] = js.native
  
  /** Envelope testStepFinished */
  var testStepFinished: js.UndefOr[ITestStepFinished | Null] = js.native
  
  /** Envelope testStepStarted */
  var testStepStarted: js.UndefOr[ITestStepStarted | Null] = js.native
}
object IEnvelope {
  
  @scala.inline
  def apply(): IEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnvelope]
  }
  
  @scala.inline
  implicit class IEnvelopeOps[Self <: IEnvelope] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: IAttachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    
    @scala.inline
    def setAttachmentNull: Self = this.set("attachment", null)
    
    @scala.inline
    def setCommandActionComplete(value: ICommandActionComplete): Self = this.set("commandActionComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandActionComplete: Self = this.set("commandActionComplete", js.undefined)
    
    @scala.inline
    def setCommandActionCompleteNull: Self = this.set("commandActionComplete", null)
    
    @scala.inline
    def setCommandError(value: String): Self = this.set("commandError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandError: Self = this.set("commandError", js.undefined)
    
    @scala.inline
    def setCommandErrorNull: Self = this.set("commandError", null)
    
    @scala.inline
    def setCommandGenerateSnippet(value: ICommandGenerateSnippet): Self = this.set("commandGenerateSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandGenerateSnippet: Self = this.set("commandGenerateSnippet", js.undefined)
    
    @scala.inline
    def setCommandGenerateSnippetNull: Self = this.set("commandGenerateSnippet", null)
    
    @scala.inline
    def setCommandInitializeTestCase(value: ICommandInitializeTestCase): Self = this.set("commandInitializeTestCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandInitializeTestCase: Self = this.set("commandInitializeTestCase", js.undefined)
    
    @scala.inline
    def setCommandInitializeTestCaseNull: Self = this.set("commandInitializeTestCase", null)
    
    @scala.inline
    def setCommandRunAfterTestCaseHook(value: ICommandRunAfterTestCaseHook): Self = this.set("commandRunAfterTestCaseHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandRunAfterTestCaseHook: Self = this.set("commandRunAfterTestCaseHook", js.undefined)
    
    @scala.inline
    def setCommandRunAfterTestCaseHookNull: Self = this.set("commandRunAfterTestCaseHook", null)
    
    @scala.inline
    def setCommandRunAfterTestRunHooks(value: ICommandRunAfterTestRunHooks): Self = this.set("commandRunAfterTestRunHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandRunAfterTestRunHooks: Self = this.set("commandRunAfterTestRunHooks", js.undefined)
    
    @scala.inline
    def setCommandRunAfterTestRunHooksNull: Self = this.set("commandRunAfterTestRunHooks", null)
    
    @scala.inline
    def setCommandRunBeforeTestCaseHook(value: ICommandRunBeforeTestCaseHook): Self = this.set("commandRunBeforeTestCaseHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandRunBeforeTestCaseHook: Self = this.set("commandRunBeforeTestCaseHook", js.undefined)
    
    @scala.inline
    def setCommandRunBeforeTestCaseHookNull: Self = this.set("commandRunBeforeTestCaseHook", null)
    
    @scala.inline
    def setCommandRunBeforeTestRunHooks(value: ICommandRunBeforeTestRunHooks): Self = this.set("commandRunBeforeTestRunHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandRunBeforeTestRunHooks: Self = this.set("commandRunBeforeTestRunHooks", js.undefined)
    
    @scala.inline
    def setCommandRunBeforeTestRunHooksNull: Self = this.set("commandRunBeforeTestRunHooks", null)
    
    @scala.inline
    def setCommandRunTestStep(value: ICommandRunTestStep): Self = this.set("commandRunTestStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandRunTestStep: Self = this.set("commandRunTestStep", js.undefined)
    
    @scala.inline
    def setCommandRunTestStepNull: Self = this.set("commandRunTestStep", null)
    
    @scala.inline
    def setCommandStart(value: ICommandStart): Self = this.set("commandStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandStart: Self = this.set("commandStart", js.undefined)
    
    @scala.inline
    def setCommandStartNull: Self = this.set("commandStart", null)
    
    @scala.inline
    def setGherkinDocument(value: IGherkinDocument): Self = this.set("gherkinDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGherkinDocument: Self = this.set("gherkinDocument", js.undefined)
    
    @scala.inline
    def setGherkinDocumentNull: Self = this.set("gherkinDocument", null)
    
    @scala.inline
    def setHook(value: IHook): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    
    @scala.inline
    def setHookNull: Self = this.set("hook", null)
    
    @scala.inline
    def setPickle(value: IPickle): Self = this.set("pickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickle: Self = this.set("pickle", js.undefined)
    
    @scala.inline
    def setPickleNull: Self = this.set("pickle", null)
    
    @scala.inline
    def setPickleAccepted(value: IPickleAccepted): Self = this.set("pickleAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleAccepted: Self = this.set("pickleAccepted", js.undefined)
    
    @scala.inline
    def setPickleAcceptedNull: Self = this.set("pickleAccepted", null)
    
    @scala.inline
    def setPickleRejected(value: IPickleRejected): Self = this.set("pickleRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleRejected: Self = this.set("pickleRejected", js.undefined)
    
    @scala.inline
    def setPickleRejectedNull: Self = this.set("pickleRejected", null)
    
    @scala.inline
    def setSource(value: ISource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setStepDefinition(value: IStepDefinition): Self = this.set("stepDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepDefinition: Self = this.set("stepDefinition", js.undefined)
    
    @scala.inline
    def setStepDefinitionNull: Self = this.set("stepDefinition", null)
    
    @scala.inline
    def setTestCase(value: ITestCase): Self = this.set("testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCase: Self = this.set("testCase", js.undefined)
    
    @scala.inline
    def setTestCaseNull: Self = this.set("testCase", null)
    
    @scala.inline
    def setTestCaseFinished(value: ITestCaseFinished): Self = this.set("testCaseFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseFinished: Self = this.set("testCaseFinished", js.undefined)
    
    @scala.inline
    def setTestCaseFinishedNull: Self = this.set("testCaseFinished", null)
    
    @scala.inline
    def setTestCasePrepared(value: ITestCasePrepared): Self = this.set("testCasePrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCasePrepared: Self = this.set("testCasePrepared", js.undefined)
    
    @scala.inline
    def setTestCasePreparedNull: Self = this.set("testCasePrepared", null)
    
    @scala.inline
    def setTestCaseStarted(value: ITestCaseStarted): Self = this.set("testCaseStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseStarted: Self = this.set("testCaseStarted", js.undefined)
    
    @scala.inline
    def setTestCaseStartedNull: Self = this.set("testCaseStarted", null)
    
    @scala.inline
    def setTestRunFinished(value: ITestRunFinished): Self = this.set("testRunFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRunFinished: Self = this.set("testRunFinished", js.undefined)
    
    @scala.inline
    def setTestRunFinishedNull: Self = this.set("testRunFinished", null)
    
    @scala.inline
    def setTestRunStarted(value: ITestRunStarted): Self = this.set("testRunStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRunStarted: Self = this.set("testRunStarted", js.undefined)
    
    @scala.inline
    def setTestRunStartedNull: Self = this.set("testRunStarted", null)
    
    @scala.inline
    def setTestStepFinished(value: ITestStepFinished): Self = this.set("testStepFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestStepFinished: Self = this.set("testStepFinished", js.undefined)
    
    @scala.inline
    def setTestStepFinishedNull: Self = this.set("testStepFinished", null)
    
    @scala.inline
    def setTestStepStarted(value: ITestStepStarted): Self = this.set("testStepStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestStepStarted: Self = this.set("testStepStarted", js.undefined)
    
    @scala.inline
    def setTestStepStartedNull: Self = this.set("testStepStarted", null)
  }
}
