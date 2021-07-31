package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingDataResult extends StObject {
  
  /**
    * The testing dataset that was supplied for training.
    */
  var Input: js.UndefOr[TestingData] = js.undefined
  
  /**
    * The subset of the dataset that was actually tested. Some images (assets) might not be tested due to file formatting and other issues. 
    */
  var Output: js.UndefOr[TestingData] = js.undefined
  
  /**
    * The location of the data validation manifest. The data validation manifest is created for the test dataset during model training.
    */
  var Validation: js.UndefOr[ValidationData] = js.undefined
}
object TestingDataResult {
  
  @scala.inline
  def apply(): TestingDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingDataResult]
  }
  
  @scala.inline
  implicit class TestingDataResultMutableBuilder[Self <: TestingDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: TestingData): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setOutput(value: TestingData): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    @scala.inline
    def setValidation(value: ValidationData): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "Validation", js.undefined)
  }
}
