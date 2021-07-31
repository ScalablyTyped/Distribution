package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMessageVisibilityBatchExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest
    - typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest
    - typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct
    - typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId
  */
  trait ChangeMessageVisibilityBatchExceptionsUnion extends StObject
  object ChangeMessageVisibilityBatchExceptionsUnion {
    
    @scala.inline
    def BatchEntryIdsNotDistinct(): typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct = {
      val __obj = js.Dynamic.literal(name = "BatchEntryIdsNotDistinct")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod.BatchEntryIdsNotDistinct]
    }
    
    @scala.inline
    def EmptyBatchRequest(): typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest = {
      val __obj = js.Dynamic.literal(name = "EmptyBatchRequest")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod.EmptyBatchRequest]
    }
    
    @scala.inline
    def InvalidBatchEntryId(): typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId = {
      val __obj = js.Dynamic.literal(name = "InvalidBatchEntryId")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesInvalidBatchEntryIdMod.InvalidBatchEntryId]
    }
    
    @scala.inline
    def TooManyEntriesInBatchRequest(): typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest = {
      val __obj = js.Dynamic.literal(name = "TooManyEntriesInBatchRequest")
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod.TooManyEntriesInBatchRequest]
    }
  }
}
