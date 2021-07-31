package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConditionalCheckFailedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ConditionalCheckFailedExceptionDetails> * / any */ trait ConditionalCheckFailedException
    extends StObject
       with DeleteItemExceptionsUnion
       with PutItemExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ConditionalCheckFailedException
  }
  object ConditionalCheckFailedException {
    
    @scala.inline
    def apply(): ConditionalCheckFailedException = {
      val __obj = js.Dynamic.literal(name = "ConditionalCheckFailedException")
      __obj.asInstanceOf[ConditionalCheckFailedException]
    }
    
    @scala.inline
    implicit class ConditionalCheckFailedExceptionMutableBuilder[Self <: ConditionalCheckFailedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ConditionalCheckFailedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConditionalCheckFailedExceptionDetails extends StObject {
    
    /**
      * <p>The conditional request failed.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ConditionalCheckFailedExceptionDetails {
    
    @scala.inline
    def apply(): ConditionalCheckFailedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalCheckFailedExceptionDetails]
    }
    
    @scala.inline
    implicit class ConditionalCheckFailedExceptionDetailsMutableBuilder[Self <: ConditionalCheckFailedExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
