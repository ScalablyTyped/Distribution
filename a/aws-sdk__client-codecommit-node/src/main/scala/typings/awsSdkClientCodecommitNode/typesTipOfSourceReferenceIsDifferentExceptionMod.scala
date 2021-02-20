package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTipOfSourceReferenceIsDifferentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TipOfSourceReferenceIsDifferentExceptionDetails> * / any */ @js.native
  trait TipOfSourceReferenceIsDifferentException extends MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException = js.native
  }
  object TipOfSourceReferenceIsDifferentException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
    ): TipOfSourceReferenceIsDifferentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
  
  @js.native
  trait TipOfSourceReferenceIsDifferentExceptionDetails extends StObject
}
