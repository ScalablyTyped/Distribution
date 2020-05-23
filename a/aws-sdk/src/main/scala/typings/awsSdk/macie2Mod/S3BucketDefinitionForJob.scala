package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketDefinitionForJob extends js.Object {
  /**
    * The unique identifier for the AWS account that owns one or more of the buckets. If specified, the job analyzes objects in all the buckets that are owned by the account and meet other conditions specified for the job.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * An array that lists the names of the buckets.
    */
  var buckets: js.UndefOr[listOfString] = js.native
}

object S3BucketDefinitionForJob {
  @scala.inline
  def apply(accountId: string = null, buckets: listOfString = null): S3BucketDefinitionForJob = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketDefinitionForJob]
  }
}

