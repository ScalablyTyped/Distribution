package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReportCreationInput extends js.Object {
  /**
    * The name of the Amazon S3 bucket where the report will be stored; for example:  awsexamplebucket  For more information on S3 bucket requirements, including an example bucket policy, see the example S3 bucket policy on this page.
    */
  var S3Bucket: typings.awsSdk.resourcegroupstaggingapiMod.S3Bucket = js.native
}

object StartReportCreationInput {
  @scala.inline
  def apply(S3Bucket: S3Bucket): StartReportCreationInput = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReportCreationInput]
  }
}

