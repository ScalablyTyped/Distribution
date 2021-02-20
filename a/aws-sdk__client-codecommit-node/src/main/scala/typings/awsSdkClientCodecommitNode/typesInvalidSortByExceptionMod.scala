package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSortByExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSortByExceptionDetails> * / any */ @js.native
  trait InvalidSortByException extends ListRepositoriesExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException = js.native
  }
  object InvalidSortByException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException): InvalidSortByException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidSortByException]
    }
    
    @scala.inline
    implicit class InvalidSortByExceptionMutableBuilder[Self <: InvalidSortByException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidSortByExceptionDetails extends StObject
}
