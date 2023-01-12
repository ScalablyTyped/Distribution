package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesParentCommitIdOutdatedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ParentCommitIdOutdatedExceptionDetails> * / any */ trait ParentCommitIdOutdatedException
    extends StObject
       with DeleteFileExceptionsUnion
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
  }
  object ParentCommitIdOutdatedException {
    
    inline def apply(): ParentCommitIdOutdatedException = {
      val __obj = js.Dynamic.literal(name = "ParentCommitIdOutdatedException")
      __obj.asInstanceOf[ParentCommitIdOutdatedException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParentCommitIdOutdatedException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdOutdatedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParentCommitIdOutdatedExceptionDetails extends StObject
}
