package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProcessing extends StObject {
  
  /**
    * A JSONPath expression used to select a portion of the input data to pass to the algorithm. Use the InputFilter parameter to exclude fields, such as an ID column, from the input. If you want SageMaker to pass the entire input dataset to the algorithm, accept the default value $. Examples: "$", "$[1:]", "$.features" 
    */
  var InputFilter: js.UndefOr[JsonPath] = js.undefined
  
  /**
    * Specifies the source of the data to join with the transformed data. The valid values are None and Input. The default value is None, which specifies not to join the input with the transformed data. If you want the batch transform job to join the original input data with the transformed data, set JoinSource to Input. You can specify OutputFilter as an additional filter to select a portion of the joined dataset and store it in the output file. For JSON or JSONLines objects, such as a JSON array, SageMaker adds the transformed data to the input JSON object in an attribute called SageMakerOutput. The joined result for JSON must be a key-value pair object. If the input is not a key-value pair object, SageMaker creates a new JSON file. In the new JSON file, and the input data is stored under the SageMakerInput key and the results are stored in SageMakerOutput. For CSV data, SageMaker takes each row as a JSON array and joins the transformed data with the input by appending each transformed row to the end of the input. The joined data has the original input data followed by the transformed data and the output is a CSV file. For information on how joining in applied, see Workflow for Associating Inferences with Input Records.
    */
  var JoinSource: js.UndefOr[typings.awsSdk.sagemakerMod.JoinSource] = js.undefined
  
  /**
    * A JSONPath expression used to select a portion of the joined dataset to save in the output file for a batch transform job. If you want SageMaker to store the entire input dataset in the output file, leave the default value, $. If you specify indexes that aren't within the dimension size of the joined dataset, you get an error. Examples: "$", "$[0,5:]", "$['id','SageMakerOutput']" 
    */
  var OutputFilter: js.UndefOr[JsonPath] = js.undefined
}
object DataProcessing {
  
  inline def apply(): DataProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataProcessing]
  }
  
  extension [Self <: DataProcessing](x: Self) {
    
    inline def setInputFilter(value: JsonPath): Self = StObject.set(x, "InputFilter", value.asInstanceOf[js.Any])
    
    inline def setInputFilterUndefined: Self = StObject.set(x, "InputFilter", js.undefined)
    
    inline def setJoinSource(value: JoinSource): Self = StObject.set(x, "JoinSource", value.asInstanceOf[js.Any])
    
    inline def setJoinSourceUndefined: Self = StObject.set(x, "JoinSource", js.undefined)
    
    inline def setOutputFilter(value: JsonPath): Self = StObject.set(x, "OutputFilter", value.asInstanceOf[js.Any])
    
    inline def setOutputFilterUndefined: Self = StObject.set(x, "OutputFilter", js.undefined)
  }
}
