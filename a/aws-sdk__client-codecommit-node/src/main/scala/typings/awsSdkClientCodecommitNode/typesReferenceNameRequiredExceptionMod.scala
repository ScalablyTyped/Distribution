package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReferenceNameRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReferenceNameRequiredExceptionDetails> * / any */ trait ReferenceNameRequiredException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException
  }
  object ReferenceNameRequiredException {
    
    inline def apply(): ReferenceNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "ReferenceNameRequiredException")
      __obj.asInstanceOf[ReferenceNameRequiredException]
    }
    
    extension [Self <: ReferenceNameRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceNameRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceNameRequiredExceptionDetails extends StObject
}
