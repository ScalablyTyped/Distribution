package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnsupportedOperationMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_UnsupportedOperationDetails> * / any */ trait UnsupportedOperation
    extends StObject
       with SendMessageBatchExceptionsUnion
       with SendMessageExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation
  }
  object UnsupportedOperation {
    
    inline def apply(): UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperation")
      __obj.asInstanceOf[UnsupportedOperation]
    }
    
    extension [Self <: UnsupportedOperation](x: Self) {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsupportedOperationDetails extends StObject
}
