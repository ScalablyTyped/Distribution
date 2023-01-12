package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesActorDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ActorDoesNotExistExceptionDetails> * / any */ trait ActorDoesNotExistException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ActorDoesNotExistException
  }
  object ActorDoesNotExistException {
    
    inline def apply(): ActorDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "ActorDoesNotExistException")
      __obj.asInstanceOf[ActorDoesNotExistException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActorDoesNotExistException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ActorDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActorDoesNotExistExceptionDetails extends StObject
}
