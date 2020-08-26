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
  def apply(): CodeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContent]
  }
  @scala.inline
  implicit class CodeContentOps[Self <: CodeContent] (val x: Self) extends AnyVal {
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
    def setS3ContentLocation(value: S3ContentLocation): Self = this.set("S3ContentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3ContentLocation: Self = this.set("S3ContentLocation", js.undefined)
    @scala.inline
    def setTextContent(value: TextContent): Self = this.set("TextContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextContent: Self = this.set("TextContent", js.undefined)
    @scala.inline
    def setZipFileContent(value: ZipFileContent): Self = this.set("ZipFileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipFileContent: Self = this.set("ZipFileContent", js.undefined)
  }
  
}

