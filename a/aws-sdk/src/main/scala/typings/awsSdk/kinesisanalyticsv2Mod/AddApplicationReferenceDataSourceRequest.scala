package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationReferenceDataSourceRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The version of the application for which you are adding the reference data source. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * The reference data source can be an object in your Amazon S3 bucket. Kinesis Data Analytics reads the object and copies the data into the in-application table that is created. You provide an S3 bucket, object key name, and the resulting in-application table that is created. 
    */
  var ReferenceDataSource: typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSource = js.native
}

object AddApplicationReferenceDataSourceRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    ReferenceDataSource: ReferenceDataSource
  ): AddApplicationReferenceDataSourceRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], ReferenceDataSource = ReferenceDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationReferenceDataSourceRequest]
  }
  @scala.inline
  implicit class AddApplicationReferenceDataSourceRequestOps[Self <: AddApplicationReferenceDataSourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = this.set("CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceDataSource(value: ReferenceDataSource): Self = this.set("ReferenceDataSource", value.asInstanceOf[js.Any])
  }
  
}

