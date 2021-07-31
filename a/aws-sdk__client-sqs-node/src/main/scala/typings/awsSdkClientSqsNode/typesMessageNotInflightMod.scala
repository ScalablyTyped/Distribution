package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageNotInflightMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MessageNotInflightDetails> * / any */ trait MessageNotInflight
    extends StObject
       with ChangeMessageVisibilityExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight
  }
  object MessageNotInflight {
    
    @scala.inline
    def apply(): MessageNotInflight = {
      val __obj = js.Dynamic.literal(name = "MessageNotInflight")
      __obj.asInstanceOf[MessageNotInflight]
    }
    
    @scala.inline
    implicit class MessageNotInflightMutableBuilder[Self <: MessageNotInflight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageNotInflightDetails extends StObject
}
