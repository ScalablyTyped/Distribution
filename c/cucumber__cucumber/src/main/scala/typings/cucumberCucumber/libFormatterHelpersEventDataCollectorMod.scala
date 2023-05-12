package typings.cucumberCucumber

import typings.cucumberMessages.mod.Attachment
import typings.cucumberMessages.mod.Envelope
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.TestCase
import typings.cucumberMessages.mod.TestCaseFinished
import typings.cucumberMessages.mod.TestStepFinished
import typings.cucumberMessages.mod.TestStepResult
import typings.cucumberMessages.mod.UndefinedParameterType
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersEventDataCollectorMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/event_data_collector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventDataCollector {
    def this(eventBroadcaster: EventEmitter) = this()
    
    /* CompleteClass */
    override def getGherkinDocument(uri: String): GherkinDocument = js.native
    
    /* CompleteClass */
    override def getPickle(pickleId: String): Pickle = js.native
    
    /* CompleteClass */
    override def getTestCaseAttempt(testCaseStartedId: String): ITestCaseAttempt = js.native
    
    /* CompleteClass */
    override def getTestCaseAttempts(): js.Array[ITestCaseAttempt] = js.native
    
    /* private */ /* CompleteClass */
    var gherkinDocumentMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var initTestCaseAttempt: Any = js.native
    
    /* CompleteClass */
    override def parseEnvelope(envelope: Envelope): Unit = js.native
    
    /* private */ /* CompleteClass */
    var pickleMap: Any = js.native
    
    /* CompleteClass */
    override def storeAttachment(attachment: Attachment): Unit = js.native
    
    /* CompleteClass */
    override def storeTestCaseResult(param0: TestCaseFinished): Unit = js.native
    
    /* CompleteClass */
    override def storeTestStepResult(param0: TestStepFinished): Unit = js.native
    
    /* private */ /* CompleteClass */
    var testCaseAttemptDataMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var testCaseMap: Any = js.native
    
    /* CompleteClass */
    override val undefinedParameterTypes: js.Array[UndefinedParameterType] = js.native
  }
  
  trait EventDataCollector extends StObject {
    
    def getGherkinDocument(uri: String): GherkinDocument
    
    def getPickle(pickleId: String): Pickle
    
    def getTestCaseAttempt(testCaseStartedId: String): ITestCaseAttempt
    
    def getTestCaseAttempts(): js.Array[ITestCaseAttempt]
    
    /* private */ var gherkinDocumentMap: Any
    
    /* private */ var initTestCaseAttempt: Any
    
    def parseEnvelope(envelope: Envelope): Unit
    
    /* private */ var pickleMap: Any
    
    def storeAttachment(attachment: Attachment): Unit
    
    def storeTestCaseResult(param0: TestCaseFinished): Unit
    
    def storeTestStepResult(param0: TestStepFinished): Unit
    
    /* private */ var testCaseAttemptDataMap: Any
    
    /* private */ var testCaseMap: Any
    
    val undefinedParameterTypes: js.Array[UndefinedParameterType]
  }
  object EventDataCollector {
    
    inline def apply(
      getGherkinDocument: String => GherkinDocument,
      getPickle: String => Pickle,
      getTestCaseAttempt: String => ITestCaseAttempt,
      getTestCaseAttempts: () => js.Array[ITestCaseAttempt],
      gherkinDocumentMap: Any,
      initTestCaseAttempt: Any,
      parseEnvelope: Envelope => Unit,
      pickleMap: Any,
      storeAttachment: Attachment => Unit,
      storeTestCaseResult: TestCaseFinished => Unit,
      storeTestStepResult: TestStepFinished => Unit,
      testCaseAttemptDataMap: Any,
      testCaseMap: Any,
      undefinedParameterTypes: js.Array[UndefinedParameterType]
    ): EventDataCollector = {
      val __obj = js.Dynamic.literal(getGherkinDocument = js.Any.fromFunction1(getGherkinDocument), getPickle = js.Any.fromFunction1(getPickle), getTestCaseAttempt = js.Any.fromFunction1(getTestCaseAttempt), getTestCaseAttempts = js.Any.fromFunction0(getTestCaseAttempts), gherkinDocumentMap = gherkinDocumentMap.asInstanceOf[js.Any], initTestCaseAttempt = initTestCaseAttempt.asInstanceOf[js.Any], parseEnvelope = js.Any.fromFunction1(parseEnvelope), pickleMap = pickleMap.asInstanceOf[js.Any], storeAttachment = js.Any.fromFunction1(storeAttachment), storeTestCaseResult = js.Any.fromFunction1(storeTestCaseResult), storeTestStepResult = js.Any.fromFunction1(storeTestStepResult), testCaseAttemptDataMap = testCaseAttemptDataMap.asInstanceOf[js.Any], testCaseMap = testCaseMap.asInstanceOf[js.Any], undefinedParameterTypes = undefinedParameterTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDataCollector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventDataCollector] (val x: Self) extends AnyVal {
      
      inline def setGetGherkinDocument(value: String => GherkinDocument): Self = StObject.set(x, "getGherkinDocument", js.Any.fromFunction1(value))
      
      inline def setGetPickle(value: String => Pickle): Self = StObject.set(x, "getPickle", js.Any.fromFunction1(value))
      
      inline def setGetTestCaseAttempt(value: String => ITestCaseAttempt): Self = StObject.set(x, "getTestCaseAttempt", js.Any.fromFunction1(value))
      
      inline def setGetTestCaseAttempts(value: () => js.Array[ITestCaseAttempt]): Self = StObject.set(x, "getTestCaseAttempts", js.Any.fromFunction0(value))
      
      inline def setGherkinDocumentMap(value: Any): Self = StObject.set(x, "gherkinDocumentMap", value.asInstanceOf[js.Any])
      
      inline def setInitTestCaseAttempt(value: Any): Self = StObject.set(x, "initTestCaseAttempt", value.asInstanceOf[js.Any])
      
      inline def setParseEnvelope(value: Envelope => Unit): Self = StObject.set(x, "parseEnvelope", js.Any.fromFunction1(value))
      
      inline def setPickleMap(value: Any): Self = StObject.set(x, "pickleMap", value.asInstanceOf[js.Any])
      
      inline def setStoreAttachment(value: Attachment => Unit): Self = StObject.set(x, "storeAttachment", js.Any.fromFunction1(value))
      
      inline def setStoreTestCaseResult(value: TestCaseFinished => Unit): Self = StObject.set(x, "storeTestCaseResult", js.Any.fromFunction1(value))
      
      inline def setStoreTestStepResult(value: TestStepFinished => Unit): Self = StObject.set(x, "storeTestStepResult", js.Any.fromFunction1(value))
      
      inline def setTestCaseAttemptDataMap(value: Any): Self = StObject.set(x, "testCaseAttemptDataMap", value.asInstanceOf[js.Any])
      
      inline def setTestCaseMap(value: Any): Self = StObject.set(x, "testCaseMap", value.asInstanceOf[js.Any])
      
      inline def setUndefinedParameterTypes(value: js.Array[UndefinedParameterType]): Self = StObject.set(x, "undefinedParameterTypes", value.asInstanceOf[js.Any])
      
      inline def setUndefinedParameterTypesVarargs(value: UndefinedParameterType*): Self = StObject.set(x, "undefinedParameterTypes", js.Array(value*))
    }
  }
  
  trait ITestCaseAttempt extends StObject {
    
    var attempt: Double
    
    var gherkinDocument: GherkinDocument
    
    var pickle: Pickle
    
    var stepAttachments: Record[String, js.Array[Attachment]]
    
    var stepResults: Record[String, TestStepResult]
    
    var testCase: TestCase
    
    var willBeRetried: Boolean
    
    var worstTestStepResult: TestStepResult
  }
  object ITestCaseAttempt {
    
    inline def apply(
      attempt: Double,
      gherkinDocument: GherkinDocument,
      pickle: Pickle,
      stepAttachments: Record[String, js.Array[Attachment]],
      stepResults: Record[String, TestStepResult],
      testCase: TestCase,
      willBeRetried: Boolean,
      worstTestStepResult: TestStepResult
    ): ITestCaseAttempt = {
      val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any], stepAttachments = stepAttachments.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], willBeRetried = willBeRetried.asInstanceOf[js.Any], worstTestStepResult = worstTestStepResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestCaseAttempt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestCaseAttempt] (val x: Self) extends AnyVal {
      
      inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setStepAttachments(value: Record[String, js.Array[Attachment]]): Self = StObject.set(x, "stepAttachments", value.asInstanceOf[js.Any])
      
      inline def setStepResults(value: Record[String, TestStepResult]): Self = StObject.set(x, "stepResults", value.asInstanceOf[js.Any])
      
      inline def setTestCase(value: TestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
      
      inline def setWillBeRetried(value: Boolean): Self = StObject.set(x, "willBeRetried", value.asInstanceOf[js.Any])
      
      inline def setWorstTestStepResult(value: TestStepResult): Self = StObject.set(x, "worstTestStepResult", value.asInstanceOf[js.Any])
    }
  }
}
