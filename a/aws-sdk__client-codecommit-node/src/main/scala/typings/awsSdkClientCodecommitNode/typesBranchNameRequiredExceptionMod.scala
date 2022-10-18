package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreateBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesDeleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBranchNameRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BranchNameRequiredExceptionDetails> * / any */ trait BranchNameRequiredException
    extends StObject
       with CreateBranchExceptionsUnion
       with DeleteBranchExceptionsUnion
       with DeleteFileExceptionsUnion
       with GetBranchExceptionsUnion
       with PutFileExceptionsUnion
       with UpdateDefaultBranchExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
  }
  object BranchNameRequiredException {
    
    inline def apply(): BranchNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "BranchNameRequiredException")
      __obj.asInstanceOf[BranchNameRequiredException]
    }
    
    extension [Self <: BranchNameRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchNameRequiredExceptionDetails extends StObject
}
