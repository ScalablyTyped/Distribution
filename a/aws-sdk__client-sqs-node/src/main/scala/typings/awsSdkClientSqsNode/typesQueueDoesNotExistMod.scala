package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueDoesNotExistMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueDoesNotExistDetails> * / any */ trait QueueDoesNotExist
    extends StObject
       with PurgeQueueExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist
  }
  object QueueDoesNotExist {
    
    inline def apply(): QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = "QueueDoesNotExist")
      __obj.asInstanceOf[QueueDoesNotExist]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueDoesNotExist] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueDoesNotExistDetails extends StObject
}
