package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemCollectionSizeLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ItemCollectionSizeLimitExceededExceptionDetails> * / any */ @js.native
  trait ItemCollectionSizeLimitExceededException
    extends BatchWriteItemExceptionsUnion
       with DeleteItemExceptionsUnion
       with PutItemExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException = js.native
  }
  object ItemCollectionSizeLimitExceededException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
    ): ItemCollectionSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCollectionSizeLimitExceededException]
    }
    
    @scala.inline
    implicit class ItemCollectionSizeLimitExceededExceptionMutableBuilder[Self <: ItemCollectionSizeLimitExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ItemCollectionSizeLimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>The total size of an item collection has exceeded the maximum limit of 10 gigabytes.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ItemCollectionSizeLimitExceededExceptionDetails {
    
    @scala.inline
    def apply(): ItemCollectionSizeLimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionSizeLimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class ItemCollectionSizeLimitExceededExceptionDetailsMutableBuilder[Self <: ItemCollectionSizeLimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
