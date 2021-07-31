package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typings.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typings.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
    - typings.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
    - typings.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typings.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
    - typings.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
    - typings.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
    - typings.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
    - typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
    - typings.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
    - typings.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
    - typings.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
    - typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
    - typings.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
    - typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
    - typings.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
    - typings.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
    - typings.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
    - typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
    - typings.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
    - typings.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
    - typings.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typings.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
    - typings.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
    - typings.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
    - typings.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
    - typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
    - typings.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
    - typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
    - typings.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
    - typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
    - typings.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput[typings.node.streamMod.Readable]
    - typings.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput[typings.node.streamMod.Readable]
  */
  type InputTypesUnion = _InputTypesUnion | UploadArchiveInput[Readable] | UploadMultipartPartInput[Readable]
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadInput(accountId: String, uploadId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    @scala.inline
    def AbortVaultLockInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput]
    }
    
    @scala.inline
    def AddTagsToVaultInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput]
    }
    
    @scala.inline
    def CompleteMultipartUploadInput(accountId: String, uploadId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    @scala.inline
    def CompleteVaultLockInput(accountId: String, lockId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], lockId = lockId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput]
    }
    
    @scala.inline
    def CreateVaultInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput]
    }
    
    @scala.inline
    def DeleteArchiveInput(accountId: String, archiveId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], archiveId = archiveId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput]
    }
    
    @scala.inline
    def DeleteVaultAccessPolicyInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput]
    }
    
    @scala.inline
    def DeleteVaultInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput]
    }
    
    @scala.inline
    def DeleteVaultNotificationsInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput]
    }
    
    @scala.inline
    def DescribeJobInput(accountId: String, jobId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput]
    }
    
    @scala.inline
    def DescribeVaultInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput]
    }
    
    @scala.inline
    def GetDataRetrievalPolicyInput(accountId: String): typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput]
    }
    
    @scala.inline
    def GetJobOutputInput(accountId: String, jobId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput]
    }
    
    @scala.inline
    def GetVaultAccessPolicyInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput]
    }
    
    @scala.inline
    def GetVaultLockInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput]
    }
    
    @scala.inline
    def GetVaultNotificationsInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput]
    }
    
    @scala.inline
    def InitiateJobInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput]
    }
    
    @scala.inline
    def InitiateMultipartUploadInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput]
    }
    
    @scala.inline
    def InitiateVaultLockInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput]
    }
    
    @scala.inline
    def ListJobsInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput]
    }
    
    @scala.inline
    def ListMultipartUploadsInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    @scala.inline
    def ListPartsInput(accountId: String, uploadId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput]
    }
    
    @scala.inline
    def ListProvisionedCapacityInput(accountId: String): typings.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput]
    }
    
    @scala.inline
    def ListTagsForVaultInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput]
    }
    
    @scala.inline
    def ListVaultsInput(accountId: String): typings.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput]
    }
    
    @scala.inline
    def PurchaseProvisionedCapacityInput(accountId: String): typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput]
    }
    
    @scala.inline
    def RemoveTagsFromVaultInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput]
    }
    
    @scala.inline
    def SetDataRetrievalPolicyInput(accountId: String): typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput]
    }
    
    @scala.inline
    def SetVaultAccessPolicyInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput]
    }
    
    @scala.inline
    def SetVaultNotificationsInput(accountId: String, vaultName: String): typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput]
    }
  }
}
