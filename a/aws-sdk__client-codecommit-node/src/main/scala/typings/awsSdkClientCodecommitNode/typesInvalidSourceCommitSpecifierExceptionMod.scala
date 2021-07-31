package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSourceCommitSpecifierExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSourceCommitSpecifierExceptionDetails> * / any */ trait InvalidSourceCommitSpecifierException
    extends StObject
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
  }
  object InvalidSourceCommitSpecifierException {
    
    @scala.inline
    def apply(): InvalidSourceCommitSpecifierException = {
      val __obj = js.Dynamic.literal(name = "InvalidSourceCommitSpecifierException")
      __obj.asInstanceOf[InvalidSourceCommitSpecifierException]
    }
    
    @scala.inline
    implicit class InvalidSourceCommitSpecifierExceptionMutableBuilder[Self <: InvalidSourceCommitSpecifierException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidSourceCommitSpecifierExceptionDetails extends StObject
}
