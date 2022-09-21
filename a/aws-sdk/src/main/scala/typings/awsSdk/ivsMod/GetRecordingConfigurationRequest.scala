package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecordingConfigurationRequest extends StObject {
  
  /**
    * ARN of the recording configuration to be retrieved.
    */
  var arn: RecordingConfigurationArn
}
object GetRecordingConfigurationRequest {
  
  inline def apply(arn: RecordingConfigurationArn): GetRecordingConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordingConfigurationRequest]
  }
  
  extension [Self <: GetRecordingConfigurationRequest](x: Self) {
    
    inline def setArn(value: RecordingConfigurationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
