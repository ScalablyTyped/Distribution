package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMS
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscorePutRecordsResultEntryMod._UnmarshalledPutRecordsResultEntry
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The encryption type used on the records. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.undefined
  /**
    * <p>The number of unsuccessfully processed records in a <code>PutRecords</code> request.</p>
    */
  var FailedRecordCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.</p>
    */
  var Records: js.Array[_UnmarshalledPutRecordsResultEntry]
}

object PutRecordsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Records: js.Array[_UnmarshalledPutRecordsResultEntry],
    EncryptionType: NONE | KMS | String = null,
    FailedRecordCount: Int | Double = null
  ): PutRecordsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, Records = Records)
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (FailedRecordCount != null) __obj.updateDynamic("FailedRecordCount")(FailedRecordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
}

