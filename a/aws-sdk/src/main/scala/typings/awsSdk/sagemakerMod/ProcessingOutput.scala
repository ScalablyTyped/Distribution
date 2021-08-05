package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingOutput extends StObject {
  
  /**
    * The name for the processing job output.
    */
  var OutputName: String
  
  /**
    * Configuration for processing job outputs in Amazon S3.
    */
  var S3Output: ProcessingS3Output
}
object ProcessingOutput {
  
  inline def apply(OutputName: String, S3Output: ProcessingS3Output): ProcessingOutput = {
    val __obj = js.Dynamic.literal(OutputName = OutputName.asInstanceOf[js.Any], S3Output = S3Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOutput]
  }
  
  extension [Self <: ProcessingOutput](x: Self) {
    
    inline def setOutputName(value: String): Self = StObject.set(x, "OutputName", value.asInstanceOf[js.Any])
    
    inline def setS3Output(value: ProcessingS3Output): Self = StObject.set(x, "S3Output", value.asInstanceOf[js.Any])
  }
}
