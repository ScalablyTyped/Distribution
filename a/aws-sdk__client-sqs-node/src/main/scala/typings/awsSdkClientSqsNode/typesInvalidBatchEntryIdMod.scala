package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidBatchEntryIdMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidBatchEntryIdDetails> * / any */ trait InvalidBatchEntryId
    extends StObject
       with ChangeMessageVisibilityBatchExceptionsUnion
       with DeleteMessageBatchExceptionsUnion
       with SendMessageBatchExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidBatchEntryId
  }
  object InvalidBatchEntryId {
    
    inline def apply(): InvalidBatchEntryId = {
      val __obj = js.Dynamic.literal(name = "InvalidBatchEntryId")
      __obj.asInstanceOf[InvalidBatchEntryId]
    }
    
    extension [Self <: InvalidBatchEntryId](x: Self) {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidBatchEntryId): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidBatchEntryIdDetails extends StObject
}
