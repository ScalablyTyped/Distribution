package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteItemExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException
    - typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
    - typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait DeleteItemExceptionsUnion extends StObject
  object DeleteItemExceptionsUnion {
    
    inline def ConditionalCheckFailedException(): typings.awsSdkClientDynamodbBrowser.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException = {
      val __obj = js.Dynamic.literal(name = "ConditionalCheckFailedException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def ItemCollectionSizeLimitExceededException(): typings.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "ItemCollectionSizeLimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException]
    }
    
    inline def ProvisionedThroughputExceededException(): typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = "ProvisionedThroughputExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
