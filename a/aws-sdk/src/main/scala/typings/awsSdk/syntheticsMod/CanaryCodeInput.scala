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
  def apply(
    Handler: String,
    S3Bucket: String = null,
    S3Key: String = null,
    S3Version: String = null,
    ZipFile: _Blob = null
  ): CanaryCodeInput = {
    val __obj = js.Dynamic.literal(Handler = Handler.asInstanceOf[js.Any])
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    if (S3Version != null) __obj.updateDynamic("S3Version")(S3Version.asInstanceOf[js.Any])
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryCodeInput]
  }
}

