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

object typesInvalidParameterValueExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidParameterValueExceptionDetails> * / any */ trait InvalidParameterValueException
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
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InvalidParameterValueException
  }
  object InvalidParameterValueException {
    
    inline def apply(): InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[InvalidParameterValueException]
    }
    
    extension [Self <: InvalidParameterValueException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InvalidParameterValueException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidParameterValueExceptionDetails extends StObject {
    
    /**
      * <p>400 Bad Request</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returned if a parameter of the request is incorrectly specified.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InvalidParameterValueExceptionDetails {
    
    inline def apply(): InvalidParameterValueExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidParameterValueExceptionDetails]
    }
    
    extension [Self <: InvalidParameterValueExceptionDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
