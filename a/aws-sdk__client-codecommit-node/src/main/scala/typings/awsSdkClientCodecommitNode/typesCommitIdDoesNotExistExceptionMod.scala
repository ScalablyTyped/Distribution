package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetCommitExceptionsUnionMod.GetCommitExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommitIdDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommitIdDoesNotExistExceptionDetails> * / any */ trait CommitIdDoesNotExistException
    extends StObject
       with GetCommitExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdDoesNotExistException
  }
  object CommitIdDoesNotExistException {
    
    inline def apply(): CommitIdDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "CommitIdDoesNotExistException")
      __obj.asInstanceOf[CommitIdDoesNotExistException]
    }
    
    extension [Self <: CommitIdDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitIdDoesNotExistExceptionDetails extends StObject
}
