package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.createQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueNameExistsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueNameExistsDetails> * / any */ trait QueueNameExists
    extends StObject
       with CreateQueueExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists
  }
  object QueueNameExists {
    
    @scala.inline
    def apply(): QueueNameExists = {
      val __obj = js.Dynamic.literal(name = "QueueNameExists")
      __obj.asInstanceOf[QueueNameExists]
    }
    
    @scala.inline
    implicit class QueueNameExistsMutableBuilder[Self <: QueueNameExists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueNameExistsDetails extends StObject
}
