package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Source extends js.Object {
  /**
    * The amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn = js.native
  /**
    * A physical table type for as S3 data source.
    */
  var InputColumns: InputColumnList = js.native
  /**
    * Information about the format for the S3 source file or files.
    */
  var UploadSettings: js.UndefOr[typings.awsSdk.quicksightMod.UploadSettings] = js.native
}

object S3Source {
  @scala.inline
  def apply(DataSourceArn: Arn, InputColumns: InputColumnList, UploadSettings: UploadSettings = null): S3Source = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any])
    if (UploadSettings != null) __obj.updateDynamic("UploadSettings")(UploadSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
}

