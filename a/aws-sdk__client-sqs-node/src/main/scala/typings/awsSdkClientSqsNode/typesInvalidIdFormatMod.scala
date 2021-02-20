package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidIdFormatMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidIdFormatDetails> * / any */ @js.native
  trait InvalidIdFormat extends DeleteMessageExceptionsUnion {
    
    var name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat = js.native
  }
  object InvalidIdFormat {
    
    @scala.inline
    def apply(name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): InvalidIdFormat = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidIdFormat]
    }
    
    @scala.inline
    implicit class InvalidIdFormatMutableBuilder[Self <: InvalidIdFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidIdFormatDetails extends StObject
}
