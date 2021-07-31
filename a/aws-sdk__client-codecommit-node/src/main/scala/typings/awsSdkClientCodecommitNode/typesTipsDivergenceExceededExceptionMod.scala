package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTipsDivergenceExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TipsDivergenceExceededExceptionDetails> * / any */ trait TipsDivergenceExceededException
    extends StObject
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException
  }
  object TipsDivergenceExceededException {
    
    @scala.inline
    def apply(): TipsDivergenceExceededException = {
      val __obj = js.Dynamic.literal(name = "TipsDivergenceExceededException")
      __obj.asInstanceOf[TipsDivergenceExceededException]
    }
    
    @scala.inline
    implicit class TipsDivergenceExceededExceptionMutableBuilder[Self <: TipsDivergenceExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TipsDivergenceExceededExceptionDetails extends StObject
}
