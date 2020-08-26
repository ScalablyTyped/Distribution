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
  def apply(DataSourceArn: Arn, InputColumns: InputColumnList): S3Source = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
  @scala.inline
  implicit class S3SourceOps[Self <: S3Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourceArn(value: Arn): Self = this.set("DataSourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputColumnsVarargs(value: InputColumn*): Self = this.set("InputColumns", js.Array(value :_*))
    @scala.inline
    def setInputColumns(value: InputColumnList): Self = this.set("InputColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadSettings(value: UploadSettings): Self = this.set("UploadSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadSettings: Self = this.set("UploadSettings", js.undefined)
  }
  
}

