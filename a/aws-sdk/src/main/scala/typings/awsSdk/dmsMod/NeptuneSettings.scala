package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeptuneSettings extends js.Object {
  /**
    * The number of milliseconds for AWS DMS to wait to retry a bulk-load of migrated graph data to the Neptune target database before raising an error. The default is 250.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.native
  /**
    * If you want IAM authorization enabled for this endpoint, set this parameter to true and attach the appropriate role policy document to your service role specified by ServiceAccessRoleArn. The default is false.
    */
  var IamAuthEnabled: js.UndefOr[BooleanOptional] = js.native
  /**
    * The maximum size in KB of migrated graph data stored in a CSV file before AWS DMS bulk-loads the data to the Neptune target database. The default is 1048576 KB. If successful, AWS DMS clears the bucket, ready to store the next batch of migrated graph data.
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * The number of times for AWS DMS to retry a bulk-load of migrated graph data to the Neptune target database before raising an error. The default is 5.
    */
  var MaxRetryCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A folder path where you where you want AWS DMS to store migrated graph data in the S3 bucket specified by S3BucketName 
    */
  var S3BucketFolder: String = js.native
  /**
    * The name of the S3 bucket for AWS DMS to temporarily store migrated graph data in CSV files before bulk-loading it to the Neptune target database. AWS DMS maps the SQL source data to graph data before storing it in these CSV files.
    */
  var S3BucketName: String = js.native
  /**
    * The ARN of the service role you have created for the Neptune target endpoint. For more information, see https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole in the AWS Database Migration Service User Guide. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
}

object NeptuneSettings {
  @scala.inline
  def apply(
    S3BucketFolder: String,
    S3BucketName: String,
    ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined,
    IamAuthEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined,
    MaxRetryCount: js.UndefOr[IntegerOptional] = js.undefined,
    ServiceAccessRoleArn: String = null
  ): NeptuneSettings = {
    val __obj = js.Dynamic.literal(S3BucketFolder = S3BucketFolder.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    if (!js.isUndefined(ErrorRetryDuration)) __obj.updateDynamic("ErrorRetryDuration")(ErrorRetryDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IamAuthEnabled)) __obj.updateDynamic("IamAuthEnabled")(IamAuthEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxFileSize)) __obj.updateDynamic("MaxFileSize")(MaxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRetryCount)) __obj.updateDynamic("MaxRetryCount")(MaxRetryCount.get.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeptuneSettings]
  }
}

