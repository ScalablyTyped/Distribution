package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeContentDescription extends js.Object {
  /**
    * The checksum that can be used to validate zip-format code.
    */
  var CodeMD5: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeMD5] = js.native
  /**
    * The size in bytes of the application code. Can be used to validate zip-format code.
    */
  var CodeSize: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeSize] = js.native
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon S3.
    */
  var S3ApplicationCodeLocationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ApplicationCodeLocationDescription] = js.native
  /**
    * The text-format code
    */
  var TextContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.native
}

object CodeContentDescription {
  @scala.inline
  def apply(
    CodeMD5: CodeMD5 = null,
    CodeSize: Int | Double = null,
    S3ApplicationCodeLocationDescription: S3ApplicationCodeLocationDescription = null,
    TextContent: TextContent = null
  ): CodeContentDescription = {
    val __obj = js.Dynamic.literal()
    if (CodeMD5 != null) __obj.updateDynamic("CodeMD5")(CodeMD5.asInstanceOf[js.Any])
    if (CodeSize != null) __obj.updateDynamic("CodeSize")(CodeSize.asInstanceOf[js.Any])
    if (S3ApplicationCodeLocationDescription != null) __obj.updateDynamic("S3ApplicationCodeLocationDescription")(S3ApplicationCodeLocationDescription.asInstanceOf[js.Any])
    if (TextContent != null) __obj.updateDynamic("TextContent")(TextContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeContentDescription]
  }
}

