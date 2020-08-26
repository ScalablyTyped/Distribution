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
  def apply(Enabled: AccessLogEnabled): AccessLog = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLog]
  }
  @scala.inline
  implicit class AccessLogOps[Self <: AccessLog] (val x: Self) extends AnyVal {
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
    def setEnabled(value: AccessLogEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmitInterval(value: AccessLogInterval): Self = this.set("EmitInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitInterval: Self = this.set("EmitInterval", js.undefined)
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    @scala.inline
    def setS3BucketPrefix(value: AccessLogPrefix): Self = this.set("S3BucketPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketPrefix: Self = this.set("S3BucketPrefix", js.undefined)
  }
  
}

