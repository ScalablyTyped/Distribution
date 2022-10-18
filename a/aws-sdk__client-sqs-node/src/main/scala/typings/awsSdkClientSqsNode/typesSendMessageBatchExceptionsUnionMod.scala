package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageBatchExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
    - typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
    - typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
    - typings.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong
    - typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
    - typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
  */
  trait SendMessageBatchExceptionsUnion extends StObject
  object SendMessageBatchExceptionsUnion {
    
    inline def BatchEntryIdsNotDistinct(): typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = "BatchEntryIdsNotDistinct")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct]
    }
    
    inline def BatchRequestTooLong(): typings.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong = {
      val __obj = js.Dynamic.literal(name = "BatchRequestTooLong")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong]
    }
    
    inline def EmptyBatchRequest(): typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = "EmptyBatchRequest")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest]
    }
    
    inline def InvalidBatchEntryId(): typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId = {
      val __obj = js.Dynamic.literal(name = "InvalidBatchEntryId")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId]
    }
    
    inline def TooManyEntriesInBatchRequest(): typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = "TooManyEntriesInBatchRequest")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest]
    }
    
    inline def UnsupportedOperation(): typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperation")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation]
    }
  }
}
