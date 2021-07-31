package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsnotfoundexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSNotFoundExceptionDetails> * / any */ trait KMSNotFoundException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException
  }
  object KMSNotFoundException {
    
    @scala.inline
    def apply(): KMSNotFoundException = {
      val __obj = js.Dynamic.literal(name = "KMSNotFoundException")
      __obj.asInstanceOf[KMSNotFoundException]
    }
    
    @scala.inline
    implicit class KMSNotFoundExceptionMutableBuilder[Self <: KMSNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSNotFoundExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object KMSNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): KMSNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class KMSNotFoundExceptionDetailsMutableBuilder[Self <: KMSNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
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
