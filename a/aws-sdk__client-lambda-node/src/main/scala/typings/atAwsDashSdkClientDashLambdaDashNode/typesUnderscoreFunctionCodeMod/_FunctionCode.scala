package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionCodeMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FunctionCode extends js.Object {
  /**
    * <p>An Amazon S3 bucket in the same region as your function.</p>
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon S3 key of the deployment package.</p>
    */
  var S3Key: js.UndefOr[String] = js.undefined
  /**
    * <p>For versioned objects, the version of the deployment package object to use.</p>
    */
  var S3ObjectVersion: js.UndefOr[String] = js.undefined
  /**
    * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
    */
  var ZipFile: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
}

object _FunctionCode {
  @scala.inline
  def apply(
    S3Bucket: String = null,
    S3Key: String = null,
    S3ObjectVersion: String = null,
    ZipFile: ArrayBuffer | ArrayBufferView | String = null
  ): _FunctionCode = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    if (S3ObjectVersion != null) __obj.updateDynamic("S3ObjectVersion")(S3ObjectVersion)
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FunctionCode]
  }
}

