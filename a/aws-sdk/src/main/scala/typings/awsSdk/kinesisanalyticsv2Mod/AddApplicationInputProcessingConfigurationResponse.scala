package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddApplicationInputProcessingConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  
  /**
    * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to each input configuration that you add to your application.
    */
  var InputId: js.UndefOr[Id] = js.native
  
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run.
    */
  var InputProcessingConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfigurationDescription] = js.native
}
object AddApplicationInputProcessingConfigurationResponse {
  
  @scala.inline
  def apply(): AddApplicationInputProcessingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationInputProcessingConfigurationResponse]
  }
  
  @scala.inline
  implicit class AddApplicationInputProcessingConfigurationResponseMutableBuilder[Self <: AddApplicationInputProcessingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    @scala.inline
    def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdUndefined: Self = StObject.set(x, "InputId", js.undefined)
    
    @scala.inline
    def setInputProcessingConfigurationDescription(value: InputProcessingConfigurationDescription): Self = StObject.set(x, "InputProcessingConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationDescriptionUndefined: Self = StObject.set(x, "InputProcessingConfigurationDescription", js.undefined)
  }
}
