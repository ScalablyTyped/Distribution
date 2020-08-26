package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryCodeInput extends js.Object {
  /**
    * The entry point to use for the source code when running the canary. This value must end with the string .handler.
    */
  var Handler: String = js.native
  /**
    * If your canary script is located in S3, specify the full bucket name here. The bucket must already exist. Specify the full bucket name, including s3:// as the start of the bucket name.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The S3 key of your script. For more information, see Working with Amazon S3 Objects.
    */
  var S3Key: js.UndefOr[String] = js.native
  /**
    * The S3 version ID of your script.
    */
  var S3Version: js.UndefOr[String] = js.native
  /**
    * If you input your canary script directly into the canary instead of referring to an S3 location, the value of this parameter is the .zip file that contains the script. It can be up to 5 MB.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}

object CanaryCodeInput {
  @scala.inline
  def apply(Handler: String): CanaryCodeInput = {
    val __obj = js.Dynamic.literal(Handler = Handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryCodeInput]
  }
  @scala.inline
  implicit class CanaryCodeInputOps[Self <: CanaryCodeInput] (val x: Self) extends AnyVal {
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
    def setHandler(value: String): Self = this.set("Handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    @scala.inline
    def setS3Key(value: String): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
    @scala.inline
    def setS3Version(value: String): Self = this.set("S3Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Version: Self = this.set("S3Version", js.undefined)
    @scala.inline
    def setZipFile(value: _Blob): Self = this.set("ZipFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipFile: Self = this.set("ZipFile", js.undefined)
  }
  
}

