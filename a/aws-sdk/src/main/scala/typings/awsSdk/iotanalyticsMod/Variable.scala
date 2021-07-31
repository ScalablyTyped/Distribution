package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variable extends StObject {
  
  /**
    * The value of the variable as a structure that specifies a dataset content version.
    */
  var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.undefined
  
  /**
    * The value of the variable as a double (numeric).
    */
  var doubleValue: js.UndefOr[DoubleValue] = js.undefined
  
  /**
    * The name of the variable.
    */
  var name: VariableName
  
  /**
    * The value of the variable as a structure that specifies an output file URI.
    */
  var outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.undefined
  
  /**
    * The value of the variable as a string.
    */
  var stringValue: js.UndefOr[StringValue] = js.undefined
}
object Variable {
  
  @scala.inline
  def apply(name: VariableName): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  @scala.inline
  implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetContentVersionValue(value: DatasetContentVersionValue): Self = StObject.set(x, "datasetContentVersionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetContentVersionValueUndefined: Self = StObject.set(x, "datasetContentVersionValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: DoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setName(value: VariableName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFileUriValue(value: OutputFileUriValue): Self = StObject.set(x, "outputFileUriValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFileUriValueUndefined: Self = StObject.set(x, "outputFileUriValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: StringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
