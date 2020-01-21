package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessLog extends js.Object {
  /**
    * The interval for publishing the access logs. You can specify an interval of either 5 minutes or 60 minutes. Default: 60 minutes
    */
  var EmitInterval: js.UndefOr[AccessLogInterval] = js.native
  /**
    * Specifies whether access logs are enabled for the load balancer.
    */
  var Enabled: AccessLogEnabled = js.native
  /**
    * The name of the Amazon S3 bucket where the access logs are stored.
    */
  var S3BucketName: js.UndefOr[typings.awsSdk.elbMod.S3BucketName] = js.native
  /**
    * The logical hierarchy you created for your Amazon S3 bucket, for example my-bucket-prefix/prod. If the prefix is not provided, the log is placed at the root level of the bucket.
    */
  var S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.native
}

object AccessLog {
  @scala.inline
  def apply(
    Enabled: AccessLogEnabled,
    EmitInterval: Int | Double = null,
    S3BucketName: S3BucketName = null,
    S3BucketPrefix: AccessLogPrefix = null
  ): AccessLog = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (EmitInterval != null) __obj.updateDynamic("EmitInterval")(EmitInterval.asInstanceOf[js.Any])
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    if (S3BucketPrefix != null) __obj.updateDynamic("S3BucketPrefix")(S3BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLog]
  }
}

