package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ProvisionedThroughputExceededExceptionDetails> * / any */ trait ProvisionedThroughputExceededException
    extends StObject
       with BatchGetItemExceptionsUnion
       with BatchWriteItemExceptionsUnion
       with DeleteItemExceptionsUnion
       with GetItemExceptionsUnion
       with PutItemExceptionsUnion
       with QueryExceptionsUnion
       with ScanExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ProvisionedThroughputExceededException
  }
  object ProvisionedThroughputExceededException {
    
    inline def apply(): ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = "ProvisionedThroughputExceededException")
      __obj.asInstanceOf[ProvisionedThroughputExceededException]
    }
    
    extension [Self <: ProvisionedThroughputExceededException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ProvisionedThroughputExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvisionedThroughputExceededExceptionDetails extends StObject {
    
    /**
      * <p>You exceeded your maximum allowed provisioned throughput.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ProvisionedThroughputExceededExceptionDetails {
    
    inline def apply(): ProvisionedThroughputExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputExceededExceptionDetails]
    }
    
    extension [Self <: ProvisionedThroughputExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
