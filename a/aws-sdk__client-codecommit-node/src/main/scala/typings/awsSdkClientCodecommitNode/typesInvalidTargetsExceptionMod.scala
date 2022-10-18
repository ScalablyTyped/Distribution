package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidTargetsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidTargetsExceptionDetails> * / any */ trait InvalidTargetsException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetsException
  }
  object InvalidTargetsException {
    
    inline def apply(): InvalidTargetsException = {
      val __obj = js.Dynamic.literal(name = "InvalidTargetsException")
      __obj.asInstanceOf[InvalidTargetsException]
    }
    
    extension [Self <: InvalidTargetsException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidTargetsExceptionDetails extends StObject
}
