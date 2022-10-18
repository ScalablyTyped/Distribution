package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueDeletedRecentlyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueDeletedRecentlyDetails> * / any */ trait QueueDeletedRecently
    extends StObject
       with CreateQueueExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently
  }
  object QueueDeletedRecently {
    
    inline def apply(): QueueDeletedRecently = {
      val __obj = js.Dynamic.literal(name = "QueueDeletedRecently")
      __obj.asInstanceOf[QueueDeletedRecently]
    }
    
    extension [Self <: QueueDeletedRecently](x: Self) {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDeletedRecently): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueDeletedRecentlyDetails extends StObject
}
