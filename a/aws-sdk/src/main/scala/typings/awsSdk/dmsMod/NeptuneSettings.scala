package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeptuneSettings extends js.Object {
  
  /**
    * The number of milliseconds for AWS DMS to wait to retry a bulk-load of migrated graph data to the Neptune target database before raising an error. The default is 250.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * If you want AWS Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to true. Then attach the appropriate IAM policy document to your service role specified by ServiceAccessRoleArn. The default is false.
    */
  var IamAuthEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The maximum size in kilobytes of migrated graph data stored in a .csv file before AWS DMS bulk-loads the data to the Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, AWS DMS clears the bucket, ready to store the next batch of migrated graph data.
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The number of times for AWS DMS to retry a bulk load of migrated graph data to the Neptune target database before raising an error. The default is 5.
    */
  var MaxRetryCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A folder path where you want AWS DMS to store migrated graph data in the S3 bucket specified by S3BucketName 
    */
  var S3BucketFolder: String = js.native
  
  /**
    * The name of the Amazon S3 bucket where AWS DMS can temporarily store migrated graph data in .csv files before bulk-loading it to the Neptune target database. AWS DMS maps the SQL source data to graph data before storing it in these .csv files.
    */
  var S3BucketName: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. For more information, see Creating an IAM Service Role for Accessing Amazon Neptune as a Target in the AWS Database Migration Service User Guide.  
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
}
object NeptuneSettings {
  
  @scala.inline
  def apply(S3BucketFolder: String, S3BucketName: String): NeptuneSettings = {
    val __obj = js.Dynamic.literal(S3BucketFolder = S3BucketFolder.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeptuneSettings]
  }
  
  @scala.inline
  implicit class NeptuneSettingsOps[Self <: NeptuneSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3BucketFolder(value: String): Self = this.set("S3BucketFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRetryDuration(value: IntegerOptional): Self = this.set("ErrorRetryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorRetryDuration: Self = this.set("ErrorRetryDuration", js.undefined)
    
    @scala.inline
    def setIamAuthEnabled(value: BooleanOptional): Self = this.set("IamAuthEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamAuthEnabled: Self = this.set("IamAuthEnabled", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: IntegerOptional): Self = this.set("MaxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("MaxFileSize", js.undefined)
    
    @scala.inline
    def setMaxRetryCount(value: IntegerOptional): Self = this.set("MaxRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetryCount: Self = this.set("MaxRetryCount", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("ServiceAccessRoleArn", js.undefined)
  }
}
