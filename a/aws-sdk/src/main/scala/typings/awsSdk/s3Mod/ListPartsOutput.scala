package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsOutput extends js.Object {
  /**
    * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the prefix in the lifecycle rule matches the object name in the request, then the response includes this header indicating when the initiated multipart upload will become eligible for abort operation. For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy. The response will also include the x-amz-abort-rule-id header that will provide the ID of the lifecycle configuration rule that defines this action.
    */
  var AbortDate: js.UndefOr[typings.awsSdk.s3Mod.AbortDate] = js.native
  /**
    * This header is returned along with the x-amz-abort-date header. It identifies applicable lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
    */
  var AbortRuleId: js.UndefOr[typings.awsSdk.s3Mod.AbortRuleId] = js.native
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * Container element that identifies who initiated the multipart upload. If the initiator is an AWS account, this element provides the same information as the Owner element. If the initiator is an IAM User, this element provides the user ARN and display name.
    */
  var Initiator: js.UndefOr[typings.awsSdk.s3Mod.Initiator] = js.native
  /**
    *  Indicates whether the returned list of parts is truncated. A true value indicates that the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * Maximum number of parts that were allowed in the response.
    */
  var MaxParts: js.UndefOr[typings.awsSdk.s3Mod.MaxParts] = js.native
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var NextPartNumberMarker: js.UndefOr[typings.awsSdk.s3Mod.NextPartNumberMarker] = js.native
  /**
    *  Container element that identifies the object owner, after the object is created. If multipart upload is initiated by an IAM user, this element provides the parent account ID and display name.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var PartNumberMarker: js.UndefOr[typings.awsSdk.s3Mod.PartNumberMarker] = js.native
  /**
    *  Container for elements related to a particular part. A response can contain zero or more Part elements.
    */
  var Parts: js.UndefOr[typings.awsSdk.s3Mod.Parts] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.native
}

object ListPartsOutput {
  @scala.inline
  def apply(): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartsOutput]
  }
  @scala.inline
  implicit class ListPartsOutputOps[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
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
    def setAbortDate(value: AbortDate): Self = this.set("AbortDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortDate: Self = this.set("AbortDate", js.undefined)
    @scala.inline
    def setAbortRuleId(value: AbortRuleId): Self = this.set("AbortRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortRuleId: Self = this.set("AbortRuleId", js.undefined)
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setInitiator(value: Initiator): Self = this.set("Initiator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiator: Self = this.set("Initiator", js.undefined)
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setMaxParts(value: MaxParts): Self = this.set("MaxParts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParts: Self = this.set("MaxParts", js.undefined)
    @scala.inline
    def setNextPartNumberMarker(value: NextPartNumberMarker): Self = this.set("NextPartNumberMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPartNumberMarker: Self = this.set("NextPartNumberMarker", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setPartNumberMarker(value: PartNumberMarker): Self = this.set("PartNumberMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartNumberMarker: Self = this.set("PartNumberMarker", js.undefined)
    @scala.inline
    def setPartsVarargs(value: Part*): Self = this.set("Parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: Parts): Self = this.set("Parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("Parts", js.undefined)
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = this.set("UploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadId: Self = this.set("UploadId", js.undefined)
  }
  
}

