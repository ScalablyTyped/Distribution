package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCodeStorageExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CodeStorageExceededExceptionDetails> * / any */ trait CodeStorageExceededException
    extends StObject
       with CreateFunctionExceptionsUnion
       with PublishVersionExceptionsUnion
       with UpdateFunctionCodeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException
  }
  object CodeStorageExceededException {
    
    @scala.inline
    def apply(): CodeStorageExceededException = {
      val __obj = js.Dynamic.literal(name = "CodeStorageExceededException")
      __obj.asInstanceOf[CodeStorageExceededException]
    }
    
    @scala.inline
    implicit class CodeStorageExceededExceptionMutableBuilder[Self <: CodeStorageExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeStorageExceededExceptionDetails extends StObject {
    
    /**
      * <p>The exception type.</p>
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object CodeStorageExceededExceptionDetails {
    
    @scala.inline
    def apply(): CodeStorageExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeStorageExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class CodeStorageExceededExceptionDetailsMutableBuilder[Self <: CodeStorageExceededExceptionDetails] (val x: Self) extends AnyVal {
      
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
