package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesManualMergeRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ManualMergeRequiredExceptionDetails> * / any */ trait ManualMergeRequiredException
    extends StObject
       with MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException
  }
  object ManualMergeRequiredException {
    
    inline def apply(): ManualMergeRequiredException = {
      val __obj = js.Dynamic.literal(name = "ManualMergeRequiredException")
      __obj.asInstanceOf[ManualMergeRequiredException]
    }
    
    extension [Self <: ManualMergeRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ManualMergeRequiredExceptionDetails extends StObject
}
