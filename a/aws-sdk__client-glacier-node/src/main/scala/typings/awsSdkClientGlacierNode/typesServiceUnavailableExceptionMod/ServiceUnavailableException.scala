package typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod

import typings.awsSdkClientGlacierNode.abortMultipartUploadExceptionsUnionMod.AbortMultipartUploadExceptionsUnion
import typings.awsSdkClientGlacierNode.abortVaultLockExceptionsUnionMod.AbortVaultLockExceptionsUnion
import typings.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.completeMultipartUploadExceptionsUnionMod.CompleteMultipartUploadExceptionsUnion
import typings.awsSdkClientGlacierNode.completeVaultLockExceptionsUnionMod.CompleteVaultLockExceptionsUnion
import typings.awsSdkClientGlacierNode.createVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteArchiveExceptionsUnionMod.DeleteArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteVaultAccessPolicyExceptionsUnionMod.DeleteVaultAccessPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteVaultExceptionsUnionMod.DeleteVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteVaultNotificationsExceptionsUnionMod.DeleteVaultNotificationsExceptionsUnion
import typings.awsSdkClientGlacierNode.describeJobExceptionsUnionMod.DescribeJobExceptionsUnion
import typings.awsSdkClientGlacierNode.describeVaultExceptionsUnionMod.DescribeVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.getDataRetrievalPolicyExceptionsUnionMod.GetDataRetrievalPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.getJobOutputExceptionsUnionMod.GetJobOutputExceptionsUnion
import typings.awsSdkClientGlacierNode.getVaultAccessPolicyExceptionsUnionMod.GetVaultAccessPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.getVaultLockExceptionsUnionMod.GetVaultLockExceptionsUnion
import typings.awsSdkClientGlacierNode.getVaultNotificationsExceptionsUnionMod.GetVaultNotificationsExceptionsUnion
import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.awsSdkClientGlacierNode.initiateMultipartUploadExceptionsUnionMod.InitiateMultipartUploadExceptionsUnion
import typings.awsSdkClientGlacierNode.initiateVaultLockExceptionsUnionMod.InitiateVaultLockExceptionsUnion
import typings.awsSdkClientGlacierNode.listJobsExceptionsUnionMod.ListJobsExceptionsUnion
import typings.awsSdkClientGlacierNode.listMultipartUploadsExceptionsUnionMod.ListMultipartUploadsExceptionsUnion
import typings.awsSdkClientGlacierNode.listPartsExceptionsUnionMod.ListPartsExceptionsUnion
import typings.awsSdkClientGlacierNode.listProvisionedCapacityExceptionsUnionMod.ListProvisionedCapacityExceptionsUnion
import typings.awsSdkClientGlacierNode.listTagsForVaultExceptionsUnionMod.ListTagsForVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.listVaultsExceptionsUnionMod.ListVaultsExceptionsUnion
import typings.awsSdkClientGlacierNode.purchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typings.awsSdkClientGlacierNode.removeTagsFromVaultExceptionsUnionMod.RemoveTagsFromVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.setDataRetrievalPolicyExceptionsUnionMod.SetDataRetrievalPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.setVaultAccessPolicyExceptionsUnionMod.SetVaultAccessPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.setVaultNotificationsExceptionsUnionMod.SetVaultNotificationsExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceUnavailableException
  extends ServiceException[ServiceUnavailableExceptionDetails]
     with AbortMultipartUploadExceptionsUnion
     with AbortVaultLockExceptionsUnion
     with AddTagsToVaultExceptionsUnion
     with CompleteMultipartUploadExceptionsUnion
     with CompleteVaultLockExceptionsUnion
     with CreateVaultExceptionsUnion
     with DeleteArchiveExceptionsUnion
     with DeleteVaultAccessPolicyExceptionsUnion
     with DeleteVaultExceptionsUnion
     with DeleteVaultNotificationsExceptionsUnion
     with DescribeJobExceptionsUnion
     with DescribeVaultExceptionsUnion
     with GetDataRetrievalPolicyExceptionsUnion
     with GetJobOutputExceptionsUnion
     with GetVaultAccessPolicyExceptionsUnion
     with GetVaultLockExceptionsUnion
     with GetVaultNotificationsExceptionsUnion
     with InitiateJobExceptionsUnion
     with InitiateMultipartUploadExceptionsUnion
     with InitiateVaultLockExceptionsUnion
     with ListJobsExceptionsUnion
     with ListMultipartUploadsExceptionsUnion
     with ListPartsExceptionsUnion
     with ListProvisionedCapacityExceptionsUnion
     with ListTagsForVaultExceptionsUnion
     with ListVaultsExceptionsUnion
     with PurchaseProvisionedCapacityExceptionsUnion
     with RemoveTagsFromVaultExceptionsUnion
     with SetDataRetrievalPolicyExceptionsUnion
     with SetVaultAccessPolicyExceptionsUnion
     with SetVaultNotificationsExceptionsUnion
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  @JSName("name")
  var name_ServiceUnavailableException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException = js.native
}

object ServiceUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ServiceUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException
  ): ServiceUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceUnavailableException]
  }
  @scala.inline
  implicit class ServiceUnavailableExceptionOps[Self <: ServiceUnavailableException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

