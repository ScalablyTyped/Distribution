package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTipOfSourceReferenceIsDifferentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TipOfSourceReferenceIsDifferentExceptionDetails> * / any */ trait TipOfSourceReferenceIsDifferentException
    extends StObject
       with MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
  }
  object TipOfSourceReferenceIsDifferentException {
    
    @scala.inline
    def apply(): TipOfSourceReferenceIsDifferentException = {
      val __obj = js.Dynamic.literal(name = "TipOfSourceReferenceIsDifferentException")
      __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
    }
    
    @scala.inline
    implicit class TipOfSourceReferenceIsDifferentExceptionMutableBuilder[Self <: TipOfSourceReferenceIsDifferentException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TipOfSourceReferenceIsDifferentExceptionDetails extends StObject
}
