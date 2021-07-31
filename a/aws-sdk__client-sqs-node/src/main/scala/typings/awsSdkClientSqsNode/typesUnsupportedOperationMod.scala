package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.sendMessageExceptionsUnionMod.SendMessageExceptionsUnion
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
    
    @scala.inline
    def apply(): UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperation")
      __obj.asInstanceOf[UnsupportedOperation]
    }
    
    @scala.inline
    implicit class UnsupportedOperationMutableBuilder[Self <: UnsupportedOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.UnsupportedOperation): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsupportedOperationDetails extends StObject
}
