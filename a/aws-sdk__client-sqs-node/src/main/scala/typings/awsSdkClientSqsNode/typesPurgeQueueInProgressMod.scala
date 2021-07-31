package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.purgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPurgeQueueInProgressMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PurgeQueueInProgressDetails> * / any */ trait PurgeQueueInProgress
    extends StObject
       with PurgeQueueExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress
  }
  object PurgeQueueInProgress {
    
    @scala.inline
    def apply(): PurgeQueueInProgress = {
      val __obj = js.Dynamic.literal(name = "PurgeQueueInProgress")
      __obj.asInstanceOf[PurgeQueueInProgress]
    }
    
    @scala.inline
    implicit class PurgeQueueInProgressMutableBuilder[Self <: PurgeQueueInProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.PurgeQueueInProgress): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PurgeQueueInProgressDetails extends StObject
}
