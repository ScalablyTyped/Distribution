package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReceiptHandleIsInvalidMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReceiptHandleIsInvalidDetails> * / any */ trait ReceiptHandleIsInvalid
    extends StObject
       with ChangeMessageVisibilityExceptionsUnion
       with DeleteMessageExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid
  }
  object ReceiptHandleIsInvalid {
    
    inline def apply(): ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = "ReceiptHandleIsInvalid")
      __obj.asInstanceOf[ReceiptHandleIsInvalid]
    }
    
    extension [Self <: ReceiptHandleIsInvalid](x: Self) {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptHandleIsInvalidDetails extends StObject
}
