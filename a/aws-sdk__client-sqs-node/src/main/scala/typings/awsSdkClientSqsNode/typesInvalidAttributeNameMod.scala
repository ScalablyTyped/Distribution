package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidAttributeNameMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidAttributeNameDetails> * / any */ @js.native
  trait InvalidAttributeName extends StObject {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName = js.native
  }
  object InvalidAttributeName {
    
    @scala.inline
    def apply(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName): InvalidAttributeName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidAttributeName]
    }
    
    @scala.inline
    implicit class InvalidAttributeNameMutableBuilder[Self <: InvalidAttributeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidAttributeNameDetails extends StObject
}
