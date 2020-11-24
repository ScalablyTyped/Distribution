package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestingDataResult extends js.Object {
  
  /**
    * The testing dataset that was supplied for training.
    */
  var Input: js.UndefOr[TestingData] = js.native
  
  /**
    * The subset of the dataset that was actually tested. Some images (assets) might not be tested due to file formatting and other issues. 
    */
  var Output: js.UndefOr[TestingData] = js.native
  
  /**
    * The location of the data validation manifest. The data validation manifest is created for the test dataset during model training.
    */
  var Validation: js.UndefOr[ValidationData] = js.native
}
object TestingDataResult {
  
  @scala.inline
  def apply(): TestingDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingDataResult]
  }
  
  @scala.inline
  implicit class TestingDataResultOps[Self <: TestingDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInput(value: TestingData): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setOutput(value: TestingData): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    
    @scala.inline
    def setValidation(value: ValidationData): Self = this.set("Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("Validation", js.undefined)
  }
}
