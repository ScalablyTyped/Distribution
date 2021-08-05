package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidMergeOptionExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidMergeOptionExceptionDetails> * / any */ trait InvalidMergeOptionException
    extends StObject
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException
  }
  object InvalidMergeOptionException {
    
    inline def apply(): InvalidMergeOptionException = {
      val __obj = js.Dynamic.literal(name = "InvalidMergeOptionException")
      __obj.asInstanceOf[InvalidMergeOptionException]
    }
    
    extension [Self <: InvalidMergeOptionException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMergeOptionException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidMergeOptionExceptionDetails extends StObject
}
