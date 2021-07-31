package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidCommitExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidCommitExceptionDetails> * / any */ trait InvalidCommitException
    extends StObject
       with GetDifferencesExceptionsUnion
       with GetFileExceptionsUnion
       with GetFolderExceptionsUnion
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitException
  }
  object InvalidCommitException {
    
    @scala.inline
    def apply(): InvalidCommitException = {
      val __obj = js.Dynamic.literal(name = "InvalidCommitException")
      __obj.asInstanceOf[InvalidCommitException]
    }
    
    @scala.inline
    implicit class InvalidCommitExceptionMutableBuilder[Self <: InvalidCommitException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommitException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidCommitExceptionDetails extends StObject
}
