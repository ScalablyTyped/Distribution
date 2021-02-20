package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesManualMergeRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ManualMergeRequiredExceptionDetails> * / any */ @js.native
  trait ManualMergeRequiredException extends MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException = js.native
  }
  object ManualMergeRequiredException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException
    ): ManualMergeRequiredException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManualMergeRequiredException]
    }
    
    @scala.inline
    implicit class ManualMergeRequiredExceptionMutableBuilder[Self <: ManualMergeRequiredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ManualMergeRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManualMergeRequiredExceptionDetails extends StObject
}
