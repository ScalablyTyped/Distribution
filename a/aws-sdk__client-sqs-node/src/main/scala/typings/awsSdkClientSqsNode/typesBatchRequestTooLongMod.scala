package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchRequestTooLongMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BatchRequestTooLongDetails> * / any */ trait BatchRequestTooLong
    extends StObject
       with SendMessageBatchExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong
  }
  object BatchRequestTooLong {
    
    inline def apply(): BatchRequestTooLong = {
      val __obj = js.Dynamic.literal(name = "BatchRequestTooLong")
      __obj.asInstanceOf[BatchRequestTooLong]
    }
    
    extension [Self <: BatchRequestTooLong](x: Self) {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchRequestTooLongDetails extends StObject
}
