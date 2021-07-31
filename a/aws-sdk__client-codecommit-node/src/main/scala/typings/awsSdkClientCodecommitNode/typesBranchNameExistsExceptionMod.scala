package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBranchNameExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BranchNameExistsExceptionDetails> * / any */ trait BranchNameExistsException
    extends StObject
       with CreateBranchExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
  }
  object BranchNameExistsException {
    
    @scala.inline
    def apply(): BranchNameExistsException = {
      val __obj = js.Dynamic.literal(name = "BranchNameExistsException")
      __obj.asInstanceOf[BranchNameExistsException]
    }
    
    @scala.inline
    implicit class BranchNameExistsExceptionMutableBuilder[Self <: BranchNameExistsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchNameExistsExceptionDetails extends StObject
}
