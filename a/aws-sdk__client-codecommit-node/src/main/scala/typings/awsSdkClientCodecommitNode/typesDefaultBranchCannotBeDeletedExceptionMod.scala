package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDefaultBranchCannotBeDeletedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DefaultBranchCannotBeDeletedExceptionDetails> * / any */ trait DefaultBranchCannotBeDeletedException
    extends StObject
       with DeleteBranchExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException
  }
  object DefaultBranchCannotBeDeletedException {
    
    inline def apply(): DefaultBranchCannotBeDeletedException = {
      val __obj = js.Dynamic.literal(name = "DefaultBranchCannotBeDeletedException")
      __obj.asInstanceOf[DefaultBranchCannotBeDeletedException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultBranchCannotBeDeletedException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultBranchCannotBeDeletedExceptionDetails extends StObject
}
