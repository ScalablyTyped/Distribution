package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeContent extends js.Object {
  /**
    * Information about the Amazon S3 bucket containing the application code.
    */
  var S3ContentLocation: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ContentLocation] = js.native
  /**
    * The text-format code for a Java-based Kinesis Data Analytics application.
    */
  var TextContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.native
  /**
    * The zip-format code for a Java-based Kinesis Data Analytics application.
    */
  var ZipFileContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ZipFileContent] = js.native
}

object CodeContent {
  @scala.inline
  def apply(
    S3ContentLocation: S3ContentLocation = null,
    TextContent: TextContent = null,
    ZipFileContent: ZipFileContent = null
  ): CodeContent = {
    val __obj = js.Dynamic.literal()
    if (S3ContentLocation != null) __obj.updateDynamic("S3ContentLocation")(S3ContentLocation.asInstanceOf[js.Any])
    if (TextContent != null) __obj.updateDynamic("TextContent")(TextContent.asInstanceOf[js.Any])
    if (ZipFileContent != null) __obj.updateDynamic("ZipFileContent")(ZipFileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeContent]
  }
}

