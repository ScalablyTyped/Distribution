package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartApplicationRequest extends StObject {
  
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName
  
  /**
    * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts reading the streaming source associated with the input. You can also specify where in the streaming source you want Amazon Kinesis Analytics to start reading.
    */
  var InputConfigurations: typings.awsSdk.kinesisanalyticsMod.InputConfigurations
}
object StartApplicationRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, InputConfigurations: InputConfigurations): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], InputConfigurations = InputConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  
  @scala.inline
  implicit class StartApplicationRequestMutableBuilder[Self <: StartApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigurations(value: InputConfigurations): Self = StObject.set(x, "InputConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigurationsVarargs(value: InputConfiguration*): Self = StObject.set(x, "InputConfigurations", js.Array(value :_*))
  }
}
