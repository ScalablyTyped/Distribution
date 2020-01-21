package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentRequest extends js.Object {
  /**
    * The S3 bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * The expression that is used to query the object.
    */
  var Expression: typings.awsSdk.s3Mod.Expression = js.native
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typings.awsSdk.s3Mod.ExpressionType = js.native
  /**
    * Describes the format of the data in the object that is being queried.
    */
  var InputSerialization: typings.awsSdk.s3Mod.InputSerialization = js.native
  /**
    * The object key.
    */
  var Key: ObjectKey = js.native
  /**
    * Describes the format of the data that you want Amazon S3 to return in response.
    */
  var OutputSerialization: typings.awsSdk.s3Mod.OutputSerialization = js.native
  /**
    * Specifies if periodic request progress information should be enabled.
    */
  var RequestProgress: js.UndefOr[typings.awsSdk.s3Mod.RequestProgress] = js.native
  /**
    * The SSE Algorithm used to encrypt the object. For more information, see Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * The SSE Customer Key. For more information, see Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.native
  /**
    * The SSE Customer Key MD5. For more information, see Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * Specifies the byte range of the object to get the records from. A record is processed when its first byte is contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616, Section 14.35.1 about how to specify the start and end of the range.  ScanRangemay be used in the following ways:    &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt; - process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)    &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; - process only the records starting after the byte 50    &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; - process only the records within the last 50 bytes of the file.  
    */
  var ScanRange: js.UndefOr[typings.awsSdk.s3Mod.ScanRange] = js.native
}

object SelectObjectContentRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    Key: ObjectKey,
    OutputSerialization: OutputSerialization,
    RequestProgress: RequestProgress = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    ScanRange: ScanRange = null
  ): SelectObjectContentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    if (RequestProgress != null) __obj.updateDynamic("RequestProgress")(RequestProgress.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (ScanRange != null) __obj.updateDynamic("ScanRange")(ScanRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentRequest]
  }
}

