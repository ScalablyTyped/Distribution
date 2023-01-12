package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidDestinationCommitSpecifierExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidDestinationCommitSpecifierExceptionDetails> * / any */ trait InvalidDestinationCommitSpecifierException
    extends StObject
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDestinationCommitSpecifierException
  }
  object InvalidDestinationCommitSpecifierException {
    
    inline def apply(): InvalidDestinationCommitSpecifierException = {
      val __obj = js.Dynamic.literal(name = "InvalidDestinationCommitSpecifierException")
      __obj.asInstanceOf[InvalidDestinationCommitSpecifierException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidDestinationCommitSpecifierException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDestinationCommitSpecifierException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidDestinationCommitSpecifierExceptionDetails extends StObject
}
