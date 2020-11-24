package typings.awsSdkBuildTypes.smokeTestModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmokeTestCase extends js.Object {
  
  /**
    * Whether the test should expect an error-level (4xx or 5xx) HTTP status code.
    * If false, the status code is expected to be between 200 and 299, inclusive.
    */
  var errorExpectedFromService: Boolean = js.native
  
  /**
    * A hash of arguments to pass to the operation under test.
    */
  var input: js.Object = js.native
  
  /**
    * The operation under test.
    * This name must appear as an operation in the model of the service version under test.
    */
  var operationName: String = js.native
}
object SmokeTestCase {
  
  @scala.inline
  def apply(errorExpectedFromService: Boolean, input: js.Object, operationName: String): SmokeTestCase = {
    val __obj = js.Dynamic.literal(errorExpectedFromService = errorExpectedFromService.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmokeTestCase]
  }
  
  @scala.inline
  implicit class SmokeTestCaseOps[Self <: SmokeTestCase] (val x: Self) extends AnyVal {
    
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
    def setErrorExpectedFromService(value: Boolean): Self = this.set("errorExpectedFromService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: js.Object): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
  }
}
