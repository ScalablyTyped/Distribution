package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingInput extends StObject {
  
  /**
    * The name of the inputs for the processing job.
    */
  var InputName: String
  
  /**
    * The S3 inputs for the processing job. 
    */
  var S3Input: ProcessingS3Input
}
object ProcessingInput {
  
  inline def apply(InputName: String, S3Input: ProcessingS3Input): ProcessingInput = {
    val __obj = js.Dynamic.literal(InputName = InputName.asInstanceOf[js.Any], S3Input = S3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingInput]
  }
  
  extension [Self <: ProcessingInput](x: Self) {
    
    inline def setInputName(value: String): Self = StObject.set(x, "InputName", value.asInstanceOf[js.Any])
    
    inline def setS3Input(value: ProcessingS3Input): Self = StObject.set(x, "S3Input", value.asInstanceOf[js.Any])
  }
}
