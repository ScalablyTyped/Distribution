package typings.atAwsDashSdkClientDashS3DashBrowser.typesListPartsOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInitiatorMod._UnmarshalledInitiator
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscorePartMod._UnmarshalledPart
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Date when multipart upload will become eligible for abort operation by lifecycle.</p>
    */
  var AbortDate: js.UndefOr[Date] = js.undefined
  /**
    * <p>Id of the lifecycle rule that makes a multipart upload eligible for abort operation.</p>
    */
  var AbortRuleId: js.UndefOr[String] = js.undefined
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  var Initiator: js.UndefOr[_UnmarshalledInitiator] = js.undefined
  /**
    * <p>Indicates whether the returned list of parts is truncated.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Object key for which the multipart upload was initiated.</p>
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * <p>Maximum number of parts that were allowed in the response.</p>
    */
  var MaxParts: js.UndefOr[Double] = js.undefined
  /**
    * <p>When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.</p>
    */
  var NextPartNumberMarker: js.UndefOr[Double] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[_UnmarshalledOwner] = js.undefined
  /**
    * <p>Part number after which listing begins.</p>
    */
  var PartNumberMarker: js.UndefOr[Double] = js.undefined
  /**
    * _Parts shape
    */
  var Parts: js.UndefOr[js.Array[_UnmarshalledPart]] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  /**
    * <p>Upload ID identifying the multipart upload whose parts are being listed.</p>
    */
  var UploadId: js.UndefOr[String] = js.undefined
}

object ListPartsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AbortDate: Date = null,
    AbortRuleId: String = null,
    Bucket: String = null,
    Initiator: _UnmarshalledInitiator = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    MaxParts: Int | Double = null,
    NextPartNumberMarker: Int | Double = null,
    Owner: _UnmarshalledOwner = null,
    PartNumberMarker: Int | Double = null,
    Parts: js.Array[_UnmarshalledPart] = null,
    RequestCharged: requester_ | String = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    UploadId: String = null
  ): ListPartsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AbortDate != null) __obj.updateDynamic("AbortDate")(AbortDate.asInstanceOf[js.Any])
    if (AbortRuleId != null) __obj.updateDynamic("AbortRuleId")(AbortRuleId.asInstanceOf[js.Any])
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (MaxParts != null) __obj.updateDynamic("MaxParts")(MaxParts.asInstanceOf[js.Any])
    if (NextPartNumberMarker != null) __obj.updateDynamic("NextPartNumberMarker")(NextPartNumberMarker.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (PartNumberMarker != null) __obj.updateDynamic("PartNumberMarker")(PartNumberMarker.asInstanceOf[js.Any])
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOutput]
  }
}

