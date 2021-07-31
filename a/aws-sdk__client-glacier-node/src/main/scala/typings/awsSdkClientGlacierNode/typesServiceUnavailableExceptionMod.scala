package typings.awsSdkClientGlacierNode

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServiceUnavailableExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ServiceUnavailableExceptionDetails> * / any */ trait ServiceUnavailableException
    extends StObject
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
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException
  }
  object ServiceUnavailableException {
    
    @scala.inline
    def apply(): ServiceUnavailableException = {
      val __obj = js.Dynamic.literal(name = "ServiceUnavailableException")
      __obj.asInstanceOf[ServiceUnavailableException]
    }
    
    @scala.inline
    implicit class ServiceUnavailableExceptionMutableBuilder[Self <: ServiceUnavailableException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceUnavailableExceptionDetails extends StObject {
    
    /**
      * <p>500 Internal Server Error</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returned if the service cannot complete the request.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Server</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ServiceUnavailableExceptionDetails {
    
    @scala.inline
    def apply(): ServiceUnavailableExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceUnavailableExceptionDetails]
    }
    
    @scala.inline
    implicit class ServiceUnavailableExceptionDetailsMutableBuilder[Self <: ServiceUnavailableExceptionDetails] (val x: Self) extends AnyVal {
      
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
