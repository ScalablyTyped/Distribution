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
  def apply(
    bucket: BucketName,
    key: BucketKeyExpression,
    roleArn: RoleArn,
    glueConfiguration: GlueConfiguration = null
  ): S3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (glueConfiguration != null) __obj.updateDynamic("glueConfiguration")(glueConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationConfiguration]
  }
}

