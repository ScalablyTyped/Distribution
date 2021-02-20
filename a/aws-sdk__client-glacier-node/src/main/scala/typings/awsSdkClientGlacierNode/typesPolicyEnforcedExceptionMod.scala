package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPolicyEnforcedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PolicyEnforcedExceptionDetails> * / any */ @js.native
  trait PolicyEnforcedException extends InitiateJobExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException = js.native
  }
  object PolicyEnforcedException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException): PolicyEnforcedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyEnforcedException]
    }
    
    @scala.inline
    implicit class PolicyEnforcedExceptionMutableBuilder[Self <: PolicyEnforcedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyEnforcedExceptionDetails extends StObject {
    
    /**
      * <p>PolicyEnforcedException</p>
      */
    var code: js.UndefOr[String] = js.native
    
    /**
      * <p>InitiateJob request denied by current data retrieval policy.</p>
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PolicyEnforcedExceptionDetails {
    
    @scala.inline
    def apply(): PolicyEnforcedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyEnforcedExceptionDetails]
    }
    
    @scala.inline
    implicit class PolicyEnforcedExceptionDetailsMutableBuilder[Self <: PolicyEnforcedExceptionDetails] (val x: Self) extends AnyVal {
      
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
