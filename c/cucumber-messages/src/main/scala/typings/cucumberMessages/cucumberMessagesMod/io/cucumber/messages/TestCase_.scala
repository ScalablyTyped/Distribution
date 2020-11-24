package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCase. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase")
@js.native
/**
  * Constructs a new TestCase.
  * @param [properties] Properties to set
  */
class TestCase_ () extends ITestCase {
  def this(properties: ITestCase) = this()
  
  /** TestCase id. */
  @JSName("id")
  var id_TestCase_ : String = js.native
  
  /** TestCase pickleId. */
  @JSName("pickleId")
  var pickleId_TestCase_ : String = js.native
  
  /** TestCase testSteps. */
  @JSName("testSteps")
  var testSteps_TestCase_ : js.Array[ITestStep] = js.native
  
  /**
    * Converts this TestCase to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
