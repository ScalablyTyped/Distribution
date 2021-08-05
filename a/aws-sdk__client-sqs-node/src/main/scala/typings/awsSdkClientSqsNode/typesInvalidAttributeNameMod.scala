package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidAttributeNameMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidAttributeNameDetails> * / any */ trait InvalidAttributeName extends StObject {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName
  }
  object InvalidAttributeName {
    
    inline def apply(): InvalidAttributeName = {
      val __obj = js.Dynamic.literal(name = "InvalidAttributeName")
      __obj.asInstanceOf[InvalidAttributeName]
    }
    
    extension [Self <: InvalidAttributeName](x: Self) {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidAttributeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidAttributeNameDetails extends StObject
}
