package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMessageBatchExceptionsUnionMod {
  
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
    
    @scala.inline
    def BatchEntryIdsNotDistinct(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct): typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct]
    }
    
    @scala.inline
    def BatchRequestTooLong(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong): typings.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesBatchRequestTooLongMod.BatchRequestTooLong]
    }
    
    @scala.inline
    def EmptyBatchRequest(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest): typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest]
    }
    
    @scala.inline
    def InvalidBatchEntryId(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidBatchEntryId): typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId]
    }
    
    @scala.inline
    def TooManyEntriesInBatchRequest(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest): typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest]
    }
    
    @scala.inline
    def UnsupportedOperation(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation): typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation]
    }
  }
}
