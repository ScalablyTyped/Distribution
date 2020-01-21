package typings.awsSdkClientLambdaNode.typesFunctionCodeMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledFunctionCode extends FunctionCode {
  /**
    * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
    */
  @JSName("ZipFile")
  var ZipFile_UnmarshalledFunctionCode: js.UndefOr[Uint8Array] = js.undefined
}

object UnmarshalledFunctionCode {
  @scala.inline
  def apply(
    S3Bucket: String = null,
    S3Key: String = null,
    S3ObjectVersion: String = null,
    ZipFile: Uint8Array = null
  ): UnmarshalledFunctionCode = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion.asInstanceOf[js.Any])
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledFunctionCode]
  }
}

