package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3MachineLearningModelResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.native
  /**
    * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
    */
  var S3Uri: js.UndefOr[string] = js.native
}

object S3MachineLearningModelResourceData {
  @scala.inline
  def apply(
    DestinationPath: string = null,
    OwnerSetting: ResourceDownloadOwnerSetting = null,
    S3Uri: string = null
  ): S3MachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    if (DestinationPath != null) __obj.updateDynamic("DestinationPath")(DestinationPath.asInstanceOf[js.Any])
    if (OwnerSetting != null) __obj.updateDynamic("OwnerSetting")(OwnerSetting.asInstanceOf[js.Any])
    if (S3Uri != null) __obj.updateDynamic("S3Uri")(S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3MachineLearningModelResourceData]
  }
}

