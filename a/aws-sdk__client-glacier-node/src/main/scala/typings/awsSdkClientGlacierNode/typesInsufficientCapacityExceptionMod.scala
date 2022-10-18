package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInsufficientCapacityExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InsufficientCapacityExceptionDetails> * / any */ trait InsufficientCapacityException
    extends StObject
       with InitiateJobExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
  }
  object InsufficientCapacityException {
    
    inline def apply(): InsufficientCapacityException = {
      val __obj = js.Dynamic.literal(name = "InsufficientCapacityException")
      __obj.asInstanceOf[InsufficientCapacityException]
    }
    
    extension [Self <: InsufficientCapacityException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsufficientCapacityExceptionDetails extends StObject {
    
    /**
      * _string shape
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * _string shape
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * _string shape
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InsufficientCapacityExceptionDetails {
    
    inline def apply(): InsufficientCapacityExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsufficientCapacityExceptionDetails]
    }
    
    extension [Self <: InsufficientCapacityExceptionDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
