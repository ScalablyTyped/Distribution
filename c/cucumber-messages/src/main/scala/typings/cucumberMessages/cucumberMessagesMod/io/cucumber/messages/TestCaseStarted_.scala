package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseStarted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted")
@js.native
/**
  * Constructs a new TestCaseStarted.
  * @param [properties] Properties to set
  */
class TestCaseStarted_ () extends ITestCaseStarted {
  def this(properties: ITestCaseStarted) = this()
  
  /**
    * The first attempt should have value 0, and for each retry the value
    * should increase by 1.
    */
  @JSName("attempt")
  var attempt_TestCaseStarted_ : Double = js.native
  
  /**
    * Because a `TestCase` can be run multiple times (in case of a retry),
    * we use this field to group messages relating to the same attempt.
    */
  @JSName("id")
  var id_TestCaseStarted_ : String = js.native
  
  /** TestCaseStarted testCaseId. */
  @JSName("testCaseId")
  var testCaseId_TestCaseStarted_ : String = js.native
  
  /**
    * Converts this TestCaseStarted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
