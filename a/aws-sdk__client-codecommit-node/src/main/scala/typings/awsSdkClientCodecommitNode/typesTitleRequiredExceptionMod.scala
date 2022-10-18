package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTitleRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TitleRequiredExceptionDetails> * / any */ trait TitleRequiredException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with UpdatePullRequestTitleExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException
  }
  object TitleRequiredException {
    
    inline def apply(): TitleRequiredException = {
      val __obj = js.Dynamic.literal(name = "TitleRequiredException")
      __obj.asInstanceOf[TitleRequiredException]
    }
    
    extension [Self <: TitleRequiredException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TitleRequiredException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TitleRequiredExceptionDetails extends StObject
}
