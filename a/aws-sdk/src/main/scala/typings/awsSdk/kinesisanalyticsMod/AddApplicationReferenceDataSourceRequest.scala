package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationReferenceDataSourceRequest extends StObject {
  
  /**
    * Name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName
  
  /**
    * Version of the application for which you are adding the reference data source. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  
  /**
    * The reference data source can be an object in your Amazon S3 bucket. Amazon Kinesis Analytics reads the object and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and the resulting in-application table that is created. You must also provide an IAM role with the necessary permissions that Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
    */
  var ReferenceDataSource: typings.awsSdk.kinesisanalyticsMod.ReferenceDataSource
}
object AddApplicationReferenceDataSourceRequest {
  
  inline def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    ReferenceDataSource: ReferenceDataSource
  ): AddApplicationReferenceDataSourceRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], ReferenceDataSource = ReferenceDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationReferenceDataSourceRequest]
  }
  
  extension [Self <: AddApplicationReferenceDataSourceRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataSource(value: ReferenceDataSource): Self = StObject.set(x, "ReferenceDataSource", value.asInstanceOf[js.Any])
  }
}
