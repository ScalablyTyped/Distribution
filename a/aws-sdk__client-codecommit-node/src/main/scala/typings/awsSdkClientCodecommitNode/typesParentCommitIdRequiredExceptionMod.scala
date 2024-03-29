package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesParentCommitIdRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ParentCommitIdRequiredExceptionDetails> * / any */ trait ParentCommitIdRequiredException
    extends StObject
       with DeleteFileExceptionsUnion
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdRequiredException
  }
  object ParentCommitIdRequiredException {
    
    inline def apply(): ParentCommitIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "ParentCommitIdRequiredException")
      __obj.asInstanceOf[ParentCommitIdRequiredException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParentCommitIdRequiredException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParentCommitIdRequiredExceptionDetails extends StObject
}
