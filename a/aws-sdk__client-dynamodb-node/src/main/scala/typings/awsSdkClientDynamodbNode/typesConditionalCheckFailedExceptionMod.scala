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
    
    inline def apply(): ConditionalCheckFailedException = {
      val __obj = js.Dynamic.literal(name = "ConditionalCheckFailedException")
      __obj.asInstanceOf[ConditionalCheckFailedException]
    }
    
    extension [Self <: ConditionalCheckFailedException](x: Self) {
      
      inline def setName(
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
    
    inline def apply(): ConditionalCheckFailedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalCheckFailedExceptionDetails]
    }
    
    extension [Self <: ConditionalCheckFailedExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
