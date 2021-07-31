package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReferenceDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReferenceDoesNotExistExceptionDetails> * / any */ trait ReferenceDoesNotExistException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
  }
  object ReferenceDoesNotExistException {
    
    @scala.inline
    def apply(): ReferenceDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "ReferenceDoesNotExistException")
      __obj.asInstanceOf[ReferenceDoesNotExistException]
    }
    
    @scala.inline
    implicit class ReferenceDoesNotExistExceptionMutableBuilder[Self <: ReferenceDoesNotExistException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceDoesNotExistExceptionDetails extends StObject
}
