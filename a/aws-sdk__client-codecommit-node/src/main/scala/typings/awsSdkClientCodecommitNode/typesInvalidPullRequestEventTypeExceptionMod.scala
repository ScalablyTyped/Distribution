package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidPullRequestEventTypeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidPullRequestEventTypeExceptionDetails> * / any */ trait InvalidPullRequestEventTypeException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestEventTypeException
  }
  object InvalidPullRequestEventTypeException {
    
    @scala.inline
    def apply(): InvalidPullRequestEventTypeException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestEventTypeException")
      __obj.asInstanceOf[InvalidPullRequestEventTypeException]
    }
    
    @scala.inline
    implicit class InvalidPullRequestEventTypeExceptionMutableBuilder[Self <: InvalidPullRequestEventTypeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestEventTypeException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidPullRequestEventTypeExceptionDetails extends StObject
}
