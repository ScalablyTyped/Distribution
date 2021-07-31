package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsaccessdeniedexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSAccessDeniedExceptionDetails> * / any */ trait KMSAccessDeniedException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException
  }
  object KMSAccessDeniedException {
    
    @scala.inline
    def apply(): KMSAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "KMSAccessDeniedException")
      __obj.asInstanceOf[KMSAccessDeniedException]
    }
    
    @scala.inline
    implicit class KMSAccessDeniedExceptionMutableBuilder[Self <: KMSAccessDeniedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSAccessDeniedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object KMSAccessDeniedExceptionDetails {
    
    @scala.inline
    def apply(): KMSAccessDeniedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSAccessDeniedExceptionDetails]
    }
    
    @scala.inline
    implicit class KMSAccessDeniedExceptionDetailsMutableBuilder[Self <: KMSAccessDeniedExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
