package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConditionalCheckFailedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ConditionalCheckFailedExceptionDetails> * / any */ @js.native
  trait ConditionalCheckFailedException
    extends DeleteItemExceptionsUnion
       with PutItemExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ConditionalCheckFailedException = js.native
  }
  object ConditionalCheckFailedException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ConditionalCheckFailedException
    ): ConditionalCheckFailedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionalCheckFailedException]
    }
    
    @scala.inline
    implicit class ConditionalCheckFailedExceptionMutableBuilder[Self <: ConditionalCheckFailedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ConditionalCheckFailedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionalCheckFailedExceptionDetails extends StObject {
    
    /**
      * <p>The conditional request failed.</p>
      */
    var message: js.UndefOr[String] = js.native
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
