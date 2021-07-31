package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationReferenceDataSourceRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The current application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  
  /**
    * The ID of the reference data source. When you add a reference data source to your application using the AddApplicationReferenceDataSource, Kinesis Data Analytics assigns an ID. You can use the DescribeApplication operation to get the reference ID. 
    */
  var ReferenceId: Id
}
object DeleteApplicationReferenceDataSourceRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    ReferenceId: Id
  ): DeleteApplicationReferenceDataSourceRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationReferenceDataSourceRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationReferenceDataSourceRequestMutableBuilder[Self <: DeleteApplicationReferenceDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceId(value: Id): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
  }
}
