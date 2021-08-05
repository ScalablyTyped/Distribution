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
  
  inline def apply(name: VariableName): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  extension [Self <: Variable](x: Self) {
    
    inline def setDatasetContentVersionValue(value: DatasetContentVersionValue): Self = StObject.set(x, "datasetContentVersionValue", value.asInstanceOf[js.Any])
    
    inline def setDatasetContentVersionValueUndefined: Self = StObject.set(x, "datasetContentVersionValue", js.undefined)
    
    inline def setDoubleValue(value: DoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setName(value: VariableName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputFileUriValue(value: OutputFileUriValue): Self = StObject.set(x, "outputFileUriValue", value.asInstanceOf[js.Any])
    
    inline def setOutputFileUriValueUndefined: Self = StObject.set(x, "outputFileUriValue", js.undefined)
    
    inline def setStringValue(value: StringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
