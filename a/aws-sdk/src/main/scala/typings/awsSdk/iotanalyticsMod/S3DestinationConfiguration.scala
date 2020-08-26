package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DestinationConfiguration extends js.Object {
  /**
    * The name of the Amazon S3 bucket to which data set contents are delivered.
    */
  var bucket: BucketName = js.native
  /**
    * Configuration information for coordination with the AWS Glue ETL (extract, transform and load) service.
    */
  var glueConfiguration: js.UndefOr[GlueConfiguration] = js.native
  /**
    * The key of the data set contents object. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). To produce a unique key, you can use "!{iotanalytics:scheduledTime}" to insert the time of the scheduled SQL query run, or "!{iotanalytics:versioned} to insert a unique hash identifying the data set, for example: "/DataSet/!{iotanalytics:scheduledTime}/!{iotanalytics:versioned}.csv".
    */
  var key: BucketKeyExpression = js.native
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue resources.
    */
  var roleArn: RoleArn = js.native
}

object S3DestinationConfiguration {
  @scala.inline
  def apply(bucket: BucketName, key: BucketKeyExpression, roleArn: RoleArn): S3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationConfiguration]
  }
  @scala.inline
  implicit class S3DestinationConfigurationOps[Self <: S3DestinationConfiguration] (val x: Self) extends AnyVal {
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
    def setBucket(value: BucketName): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: BucketKeyExpression): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlueConfiguration(value: GlueConfiguration): Self = this.set("glueConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlueConfiguration: Self = this.set("glueConfiguration", js.undefined)
  }
  
}

