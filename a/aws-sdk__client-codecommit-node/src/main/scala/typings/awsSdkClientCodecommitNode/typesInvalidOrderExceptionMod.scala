package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidOrderExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidOrderExceptionDetails> * / any */ @js.native
  trait InvalidOrderException extends ListRepositoriesExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException = js.native
  }
  object InvalidOrderException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException): InvalidOrderException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidOrderException]
    }
    
    @scala.inline
    implicit class InvalidOrderExceptionMutableBuilder[Self <: InvalidOrderException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidOrderExceptionDetails extends StObject
}
