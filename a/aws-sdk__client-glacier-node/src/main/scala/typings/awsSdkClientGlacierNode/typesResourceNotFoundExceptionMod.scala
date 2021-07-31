package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.abortMultipartUploadExceptionsUnionMod.AbortMultipartUploadExceptionsUnion
import typings.awsSdkClientGlacierNode.abortVaultLockExceptionsUnionMod.AbortVaultLockExceptionsUnion
import typings.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.completeMultipartUploadExceptionsUnionMod.CompleteMultipartUploadExceptionsUnion
import typings.awsSdkClientGlacierNode.completeVaultLockExceptionsUnionMod.CompleteVaultLockExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteArchiveExceptionsUnionMod.DeleteArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteVaultAccessPolicyExceptionsUnionMod.DeleteVaultAccessPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteVaultExceptionsUnionMod.DeleteVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.deleteVaultNotificationsExceptionsUnionMod.DeleteVaultNotificationsExceptionsUnion
import typings.awsSdkClientGlacierNode.describeJobExceptionsUnionMod.DescribeJobExceptionsUnion
import typings.awsSdkClientGlacierNode.describeVaultExceptionsUnionMod.DescribeVaultExceptionsUnion
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
import typings.awsSdkClientGlacierNode.listTagsForVaultExceptionsUnionMod.ListTagsForVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.listVaultsExceptionsUnionMod.ListVaultsExceptionsUnion
import typings.awsSdkClientGlacierNode.removeTagsFromVaultExceptionsUnionMod.RemoveTagsFromVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.setVaultAccessPolicyExceptionsUnionMod.SetVaultAccessPolicyExceptionsUnion
import typings.awsSdkClientGlacierNode.setVaultNotificationsExceptionsUnionMod.SetVaultNotificationsExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typings.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ trait ResourceNotFoundException
    extends StObject
       with AbortMultipartUploadExceptionsUnion
       with AbortVaultLockExceptionsUnion
       with AddTagsToVaultExceptionsUnion
       with CompleteMultipartUploadExceptionsUnion
       with CompleteVaultLockExceptionsUnion
       with DeleteArchiveExceptionsUnion
       with DeleteVaultAccessPolicyExceptionsUnion
       with DeleteVaultExceptionsUnion
       with DeleteVaultNotificationsExceptionsUnion
       with DescribeJobExceptionsUnion
       with DescribeVaultExceptionsUnion
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
       with ListTagsForVaultExceptionsUnion
       with ListVaultsExceptionsUnion
       with RemoveTagsFromVaultExceptionsUnion
       with SetVaultAccessPolicyExceptionsUnion
       with SetVaultNotificationsExceptionsUnion
       with UploadArchiveExceptionsUnion
       with UploadMultipartPartExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
  }
  object ResourceNotFoundException {
    
    @scala.inline
    def apply(): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionMutableBuilder[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * <p>404 Not Found</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResourceNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionDetailsMutableBuilder[Self <: ResourceNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
