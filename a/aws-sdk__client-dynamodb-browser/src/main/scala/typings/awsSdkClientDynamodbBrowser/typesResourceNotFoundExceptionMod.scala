package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesListTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ trait ResourceNotFoundException
    extends StObject
       with BatchGetItemExceptionsUnion
       with BatchWriteItemExceptionsUnion
       with DeleteItemExceptionsUnion
       with DeleteTableExceptionsUnion
       with DescribeTableExceptionsUnion
       with DescribeTimeToLiveExceptionsUnion
       with GetItemExceptionsUnion
       with ListTagsOfResourceExceptionsUnion
       with PutItemExceptionsUnion
       with QueryExceptionsUnion
       with ScanExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateItemExceptionsUnion
       with UpdateTableExceptionsUnion
       with UpdateTimeToLiveExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException
  }
  object ResourceNotFoundException {
    
    inline def apply(): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    extension [Self <: ResourceNotFoundException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * <p>The resource which is being requested does not exist.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ResourceNotFoundExceptionDetails {
    
    inline def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    extension [Self <: ResourceNotFoundExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
