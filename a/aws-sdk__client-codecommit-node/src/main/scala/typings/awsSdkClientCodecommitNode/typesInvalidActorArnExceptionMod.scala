package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidActorArnExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidActorArnExceptionDetails> * / any */ trait InvalidActorArnException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
  }
  object InvalidActorArnException {
    
    @scala.inline
    def apply(): InvalidActorArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidActorArnException")
      __obj.asInstanceOf[InvalidActorArnException]
    }
    
    @scala.inline
    implicit class InvalidActorArnExceptionMutableBuilder[Self <: InvalidActorArnException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidActorArnExceptionDetails extends StObject
}
