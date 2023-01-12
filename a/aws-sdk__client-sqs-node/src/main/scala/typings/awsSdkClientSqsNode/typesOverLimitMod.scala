package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOverLimitMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_OverLimitDetails> * / any */ trait OverLimit extends StObject {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit
  }
  object OverLimit {
    
    inline def apply(): OverLimit = {
      val __obj = js.Dynamic.literal(name = "OverLimit")
      __obj.asInstanceOf[OverLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverLimit] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverLimitDetails extends StObject
}
