package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationInputResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  
  /**
    * Describes the application input configuration. 
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.undefined
}
object AddApplicationInputResponse {
  
  @scala.inline
  def apply(): AddApplicationInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationInputResponse]
  }
  
  @scala.inline
  implicit class AddApplicationInputResponseMutableBuilder[Self <: AddApplicationInputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    @scala.inline
    def setInputDescriptions(value: InputDescriptions): Self = StObject.set(x, "InputDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptionsUndefined: Self = StObject.set(x, "InputDescriptions", js.undefined)
    
    @scala.inline
    def setInputDescriptionsVarargs(value: InputDescription*): Self = StObject.set(x, "InputDescriptions", js.Array(value :_*))
  }
}
