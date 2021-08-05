package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPolicyEnforcedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PolicyEnforcedExceptionDetails> * / any */ trait PolicyEnforcedException
    extends StObject
       with InitiateJobExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException
  }
  object PolicyEnforcedException {
    
    inline def apply(): PolicyEnforcedException = {
      val __obj = js.Dynamic.literal(name = "PolicyEnforcedException")
      __obj.asInstanceOf[PolicyEnforcedException]
    }
    
    extension [Self <: PolicyEnforcedException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyEnforcedExceptionDetails extends StObject {
    
    /**
      * <p>PolicyEnforcedException</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>InitiateJob request denied by current data retrieval policy.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PolicyEnforcedExceptionDetails {
    
    inline def apply(): PolicyEnforcedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyEnforcedExceptionDetails]
    }
    
    extension [Self <: PolicyEnforcedExceptionDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
