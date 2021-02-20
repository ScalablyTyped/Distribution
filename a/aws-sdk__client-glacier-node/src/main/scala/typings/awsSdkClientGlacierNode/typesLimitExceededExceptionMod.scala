package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.createVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typings.awsSdkClientGlacierNode.purchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ @js.native
  trait LimitExceededException
    extends AddTagsToVaultExceptionsUnion
       with CreateVaultExceptionsUnion
       with PurchaseProvisionedCapacityExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException = js.native
  }
  object LimitExceededException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitExceededException]
    }
    
    @scala.inline
    implicit class LimitExceededExceptionMutableBuilder[Self <: LimitExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>400 Bad Request</p>
      */
    var code: js.UndefOr[String] = js.native
    
    /**
      * <p>Returned if the request results in a vault limit or tags limit being exceeded.</p>
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LimitExceededExceptionDetails {
    
    @scala.inline
    def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class LimitExceededExceptionDetailsMutableBuilder[Self <: LimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
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
