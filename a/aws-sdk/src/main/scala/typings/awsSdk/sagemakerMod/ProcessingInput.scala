package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingInput extends StObject {
  
  /**
    * When True, input operations such as data download are managed natively by the processing job application. When False (default), input operations are managed by Amazon SageMaker.
    */
  var AppManaged: js.UndefOr[typings.awsSdk.sagemakerMod.AppManaged] = js.undefined
  
  /**
    * Configuration for a Dataset Definition input. 
    */
  var DatasetDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.DatasetDefinition] = js.undefined
  
  /**
    * The name for the processing job input.
    */
  var InputName: String
  
  /**
    * Configuration for downloading input data from Amazon S3 into the processing container.
    */
  var S3Input: js.UndefOr[ProcessingS3Input] = js.undefined
}
object ProcessingInput {
  
  inline def apply(InputName: String): ProcessingInput = {
    val __obj = js.Dynamic.literal(InputName = InputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingInput]
  }
  
  extension [Self <: ProcessingInput](x: Self) {
    
    inline def setAppManaged(value: AppManaged): Self = StObject.set(x, "AppManaged", value.asInstanceOf[js.Any])
    
    inline def setAppManagedUndefined: Self = StObject.set(x, "AppManaged", js.undefined)
    
    inline def setDatasetDefinition(value: DatasetDefinition): Self = StObject.set(x, "DatasetDefinition", value.asInstanceOf[js.Any])
    
    inline def setDatasetDefinitionUndefined: Self = StObject.set(x, "DatasetDefinition", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "InputName", value.asInstanceOf[js.Any])
    
    inline def setS3Input(value: ProcessingS3Input): Self = StObject.set(x, "S3Input", value.asInstanceOf[js.Any])
    
    inline def setS3InputUndefined: Self = StObject.set(x, "S3Input", js.undefined)
  }
}
