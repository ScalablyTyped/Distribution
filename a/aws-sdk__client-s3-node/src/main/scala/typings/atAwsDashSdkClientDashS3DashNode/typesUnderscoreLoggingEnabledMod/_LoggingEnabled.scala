package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLoggingEnabledMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTargetGrantMod._TargetGrant
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LoggingEnabled extends js.Object {
  /**
    * <p>Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.</p>
    */
  var TargetBucket: String
  /**
    * _TargetGrants shape
    */
  var TargetGrants: js.UndefOr[js.Array[_TargetGrant] | Iterable[_TargetGrant]] = js.undefined
  /**
    * <p>This element lets you specify a prefix for the keys that the log files will be stored under.</p>
    */
  var TargetPrefix: String
}

object _LoggingEnabled {
  @scala.inline
  def apply(
    TargetBucket: String,
    TargetPrefix: String,
    TargetGrants: js.Array[_TargetGrant] | Iterable[_TargetGrant] = null
  ): _LoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket, TargetPrefix = TargetPrefix)
    if (TargetGrants != null) __obj.updateDynamic("TargetGrants")(TargetGrants.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LoggingEnabled]
  }
}

