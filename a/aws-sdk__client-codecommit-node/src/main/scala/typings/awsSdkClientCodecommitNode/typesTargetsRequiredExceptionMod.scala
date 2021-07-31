package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTargetsRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TargetsRequiredExceptionDetails> * / any */ trait TargetsRequiredException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetsRequiredException
  }
  object TargetsRequiredException {
    
    @scala.inline
    def apply(): TargetsRequiredException = {
      val __obj = js.Dynamic.literal(name = "TargetsRequiredException")
      __obj.asInstanceOf[TargetsRequiredException]
    }
    
    @scala.inline
    implicit class TargetsRequiredExceptionMutableBuilder[Self <: TargetsRequiredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetsRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetsRequiredExceptionDetails extends StObject
}
