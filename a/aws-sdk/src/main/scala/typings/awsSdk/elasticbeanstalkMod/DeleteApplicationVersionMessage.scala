package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationVersionMessage extends js.Object {
  /**
    * The name of the application to which the version belongs.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * Set to true to delete the source bundle from your storage bucket. Otherwise, the application version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
    */
  var DeleteSourceBundle: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.DeleteSourceBundle] = js.native
  /**
    * The label of the version to delete.
    */
  var VersionLabel: typings.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}

object DeleteApplicationVersionMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    VersionLabel: VersionLabel,
    DeleteSourceBundle: js.UndefOr[Boolean] = js.undefined
  ): DeleteApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteSourceBundle)) __obj.updateDynamic("DeleteSourceBundle")(DeleteSourceBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVersionMessage]
  }
}

