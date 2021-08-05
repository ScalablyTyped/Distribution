package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergeOptionRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MergeOptionRequiredExceptionDetails> * / any */ trait MergeOptionRequiredException
    extends StObject
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MergeOptionRequiredException
  }
  object MergeOptionRequiredException {
    
    inline def apply(): MergeOptionRequiredException = {
      val __obj = js.Dynamic.literal(name = "MergeOptionRequiredException")
      __obj.asInstanceOf[MergeOptionRequiredException]
    }
    
    extension [Self <: MergeOptionRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MergeOptionRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MergeOptionRequiredExceptionDetails extends StObject
}
