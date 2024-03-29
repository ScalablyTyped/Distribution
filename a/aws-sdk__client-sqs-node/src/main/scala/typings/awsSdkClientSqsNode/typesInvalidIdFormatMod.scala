package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesDeleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidIdFormatMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidIdFormatDetails> * / any */ trait InvalidIdFormat
    extends StObject
       with DeleteMessageExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat
  }
  object InvalidIdFormat {
    
    inline def apply(): InvalidIdFormat = {
      val __obj = js.Dynamic.literal(name = "InvalidIdFormat")
      __obj.asInstanceOf[InvalidIdFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidIdFormat] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidIdFormatDetails extends StObject
}
