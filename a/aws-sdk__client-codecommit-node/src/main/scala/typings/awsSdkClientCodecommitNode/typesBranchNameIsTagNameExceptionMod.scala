package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBranchNameIsTagNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BranchNameIsTagNameExceptionDetails> * / any */ trait BranchNameIsTagNameException
    extends StObject
       with DeleteFileExceptionsUnion
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
  }
  object BranchNameIsTagNameException {
    
    inline def apply(): BranchNameIsTagNameException = {
      val __obj = js.Dynamic.literal(name = "BranchNameIsTagNameException")
      __obj.asInstanceOf[BranchNameIsTagNameException]
    }
    
    extension [Self <: BranchNameIsTagNameException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchNameIsTagNameExceptionDetails extends StObject
}
