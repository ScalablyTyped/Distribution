package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
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
    
    inline def apply(): InvalidPullRequestEventTypeException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestEventTypeException")
      __obj.asInstanceOf[InvalidPullRequestEventTypeException]
    }
    
    extension [Self <: InvalidPullRequestEventTypeException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestEventTypeException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidPullRequestEventTypeExceptionDetails extends StObject
}
