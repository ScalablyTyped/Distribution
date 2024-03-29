package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemCollectionSizeLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ItemCollectionSizeLimitExceededExceptionDetails> * / any */ trait ItemCollectionSizeLimitExceededException
    extends StObject
       with BatchWriteItemExceptionsUnion
       with DeleteItemExceptionsUnion
       with PutItemExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
  }
  object ItemCollectionSizeLimitExceededException {
    
    inline def apply(): ItemCollectionSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "ItemCollectionSizeLimitExceededException")
      __obj.asInstanceOf[ItemCollectionSizeLimitExceededException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemCollectionSizeLimitExceededException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ItemCollectionSizeLimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemCollectionSizeLimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>The total size of an item collection has exceeded the maximum limit of 10 gigabytes.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ItemCollectionSizeLimitExceededExceptionDetails {
    
    inline def apply(): ItemCollectionSizeLimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionSizeLimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemCollectionSizeLimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
