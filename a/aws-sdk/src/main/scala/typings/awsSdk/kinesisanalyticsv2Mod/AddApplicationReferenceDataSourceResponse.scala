package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationReferenceDataSourceResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  
  /**
    * Describes reference data sources configured for the application. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.undefined
}
object AddApplicationReferenceDataSourceResponse {
  
  @scala.inline
  def apply(): AddApplicationReferenceDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
  }
  
  @scala.inline
  implicit class AddApplicationReferenceDataSourceResponseMutableBuilder[Self <: AddApplicationReferenceDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    @scala.inline
    def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = StObject.set(x, "ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDataSourceDescriptionsUndefined: Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.undefined)
    
    @scala.inline
    def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.Array(value :_*))
  }
}
