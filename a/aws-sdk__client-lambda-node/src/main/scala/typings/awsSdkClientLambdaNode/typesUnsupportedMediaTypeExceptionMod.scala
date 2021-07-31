package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnsupportedMediaTypeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_UnsupportedMediaTypeExceptionDetails> * / any */ trait UnsupportedMediaTypeException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
  }
  object UnsupportedMediaTypeException {
    
    @scala.inline
    def apply(): UnsupportedMediaTypeException = {
      val __obj = js.Dynamic.literal(name = "UnsupportedMediaTypeException")
      __obj.asInstanceOf[UnsupportedMediaTypeException]
    }
    
    @scala.inline
    implicit class UnsupportedMediaTypeExceptionMutableBuilder[Self <: UnsupportedMediaTypeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsupportedMediaTypeExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object UnsupportedMediaTypeExceptionDetails {
    
    @scala.inline
    def apply(): UnsupportedMediaTypeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsupportedMediaTypeExceptionDetails]
    }
    
    @scala.inline
    implicit class UnsupportedMediaTypeExceptionDetailsMutableBuilder[Self <: UnsupportedMediaTypeExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
