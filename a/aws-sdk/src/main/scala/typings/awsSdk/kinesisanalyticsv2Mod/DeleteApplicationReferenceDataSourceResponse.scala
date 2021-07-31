package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationReferenceDataSourceResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The updated version ID of the application.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
}
object DeleteApplicationReferenceDataSourceResponse {
  
  @scala.inline
  def apply(): DeleteApplicationReferenceDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationReferenceDataSourceResponse]
  }
  
  @scala.inline
  implicit class DeleteApplicationReferenceDataSourceResponseMutableBuilder[Self <: DeleteApplicationReferenceDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
  }
}
