package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReportExportConfig extends js.Object {
  /**
    *  The name of the S3 bucket where the raw data of a report are exported. 
    */
  var bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    *  A boolean value that specifies if the results of a report are encrypted. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  The encryption key for the report's encrypted raw data. 
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The type of build output artifact to create. Valid values include:     NONE: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is not specified.     ZIP: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.   
    */
  var packaging: js.UndefOr[ReportPackagingType] = js.native
  /**
    *  The path to the exported report's raw data results. 
    */
  var path: js.UndefOr[String] = js.native
}

object S3ReportExportConfig {
  @scala.inline
  def apply(
    bucket: NonEmptyString = null,
    encryptionDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    encryptionKey: NonEmptyString = null,
    packaging: ReportPackagingType = null,
    path: String = null
  ): S3ReportExportConfig = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (packaging != null) __obj.updateDynamic("packaging")(packaging.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReportExportConfig]
  }
}

