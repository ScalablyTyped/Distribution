package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidTitleExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidTitleExceptionDetails> * / any */ trait InvalidTitleException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with UpdatePullRequestTitleExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTitleException
  }
  object InvalidTitleException {
    
    @scala.inline
    def apply(): InvalidTitleException = {
      val __obj = js.Dynamic.literal(name = "InvalidTitleException")
      __obj.asInstanceOf[InvalidTitleException]
    }
    
    @scala.inline
    implicit class InvalidTitleExceptionMutableBuilder[Self <: InvalidTitleException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTitleException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidTitleExceptionDetails extends StObject
}
