package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReferenceTypeNotSupportedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReferenceTypeNotSupportedExceptionDetails> * / any */ trait ReferenceTypeNotSupportedException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException
  }
  object ReferenceTypeNotSupportedException {
    
    @scala.inline
    def apply(): ReferenceTypeNotSupportedException = {
      val __obj = js.Dynamic.literal(name = "ReferenceTypeNotSupportedException")
      __obj.asInstanceOf[ReferenceTypeNotSupportedException]
    }
    
    @scala.inline
    implicit class ReferenceTypeNotSupportedExceptionMutableBuilder[Self <: ReferenceTypeNotSupportedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceTypeNotSupportedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceTypeNotSupportedExceptionDetails extends StObject
}
