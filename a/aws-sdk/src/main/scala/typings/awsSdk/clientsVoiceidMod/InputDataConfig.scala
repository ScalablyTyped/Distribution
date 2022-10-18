package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDataConfig extends StObject {
  
  /**
    * The S3 location for the input manifest file that contains the list of individual enrollment or registration job requests.
    */
  var S3Uri: typings.awsSdk.clientsVoiceidMod.S3Uri
}
object InputDataConfig {
  
  inline def apply(S3Uri: S3Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  extension [Self <: InputDataConfig](x: Self) {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
