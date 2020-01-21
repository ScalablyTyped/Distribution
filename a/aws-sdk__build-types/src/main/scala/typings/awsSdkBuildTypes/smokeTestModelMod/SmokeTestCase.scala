package typings.awsSdkBuildTypes.smokeTestModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmokeTestCase extends js.Object {
  /**
    * Whether the test should expect an error-level (4xx or 5xx) HTTP status code.
    * If false, the status code is expected to be between 200 and 299, inclusive.
    */
  var errorExpectedFromService: Boolean
  /**
    * A hash of arguments to pass to the operation under test.
    */
  var input: js.Object
  /**
    * The operation under test.
    * This name must appear as an operation in the model of the service version under test.
    */
  var operationName: String
}

object SmokeTestCase {
  @scala.inline
  def apply(errorExpectedFromService: Boolean, input: js.Object, operationName: String): SmokeTestCase = {
    val __obj = js.Dynamic.literal(errorExpectedFromService = errorExpectedFromService.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmokeTestCase]
  }
}

