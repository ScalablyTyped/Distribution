package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInsufficientCapacityExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InsufficientCapacityExceptionDetails> * / any */ @js.native
  trait InsufficientCapacityException extends InitiateJobExceptionsUnion {
    
    var name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException = js.native
  }
  object InsufficientCapacityException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException): InsufficientCapacityException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsufficientCapacityException]
    }
    
    @scala.inline
    implicit class InsufficientCapacityExceptionMutableBuilder[Self <: InsufficientCapacityException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsufficientCapacityExceptionDetails extends StObject {
    
    /**
      * _string shape
      */
    var code: js.UndefOr[String] = js.native
    
    /**
      * _string shape
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * _string shape
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object InsufficientCapacityExceptionDetails {
    
    @scala.inline
    def apply(): InsufficientCapacityExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsufficientCapacityExceptionDetails]
    }
    
    @scala.inline
    implicit class InsufficientCapacityExceptionDetailsMutableBuilder[Self <: InsufficientCapacityExceptionDetails] (val x: Self) extends AnyVal {
      
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
