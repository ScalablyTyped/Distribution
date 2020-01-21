package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSigningJobResponse extends js.Object {
  /**
    * Date and time that the signing job was completed.
    */
  var completedAt: js.UndefOr[CompletedAt] = js.native
  /**
    * Date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * The ID of the signing job on output.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * A list of any overrides that were applied to the signing operation.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  /**
    * The microcontroller platform to which your signed code image will be distributed.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * The name of the profile that initiated the signing operation.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.native
  /**
    * Name of the S3 bucket where the signed code image is saved by code signing.
    */
  var signedObject: js.UndefOr[SignedObject] = js.native
  /**
    * Amazon Resource Name (ARN) of your code signing certificate.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  /**
    * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified for use in your signing job. 
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  /**
    * The object that contains the name of your S3 bucket or your raw code.
    */
  var source: js.UndefOr[Source] = js.native
  /**
    * Status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.native
  /**
    * String value that contains the status reason.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
}

object DescribeSigningJobResponse {
  @scala.inline
  def apply(
    completedAt: CompletedAt = null,
    createdAt: CreatedAt = null,
    jobId: JobId = null,
    overrides: SigningPlatformOverrides = null,
    platformId: PlatformId = null,
    profileName: ProfileName = null,
    requestedBy: RequestedBy = null,
    signedObject: SignedObject = null,
    signingMaterial: SigningMaterial = null,
    signingParameters: SigningParameters = null,
    source: Source = null,
    status: SigningStatus = null,
    statusReason: StatusReason = null
  ): DescribeSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    if (completedAt != null) __obj.updateDynamic("completedAt")(completedAt.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (platformId != null) __obj.updateDynamic("platformId")(platformId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (requestedBy != null) __obj.updateDynamic("requestedBy")(requestedBy.asInstanceOf[js.Any])
    if (signedObject != null) __obj.updateDynamic("signedObject")(signedObject.asInstanceOf[js.Any])
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial.asInstanceOf[js.Any])
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSigningJobResponse]
  }
}

