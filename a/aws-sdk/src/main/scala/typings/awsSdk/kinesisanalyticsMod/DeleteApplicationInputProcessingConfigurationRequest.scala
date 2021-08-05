package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationInputProcessingConfigurationRequest extends StObject {
  
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName
  
  /**
    * The version ID of the Kinesis Analytics application.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  
  /**
    * The ID of the input configuration from which to delete the input processing configuration. You can get a list of the input IDs for an application by using the DescribeApplication operation.
    */
  var InputId: Id
}
object DeleteApplicationInputProcessingConfigurationRequest {
  
  inline def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, InputId: Id): DeleteApplicationInputProcessingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
  }
  
  extension [Self <: DeleteApplicationInputProcessingConfigurationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
  }
}
