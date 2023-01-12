package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
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
    
    inline def apply(): TipOfSourceReferenceIsDifferentException = {
      val __obj = js.Dynamic.literal(name = "TipOfSourceReferenceIsDifferentException")
      __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TipOfSourceReferenceIsDifferentException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TipOfSourceReferenceIsDifferentExceptionDetails extends StObject
}
