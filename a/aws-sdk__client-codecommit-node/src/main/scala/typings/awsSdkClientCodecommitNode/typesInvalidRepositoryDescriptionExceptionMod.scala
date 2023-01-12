package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreateRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionExceptionsUnionMod.UpdateRepositoryDescriptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryDescriptionExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryDescriptionExceptionDetails> * / any */ trait InvalidRepositoryDescriptionException
    extends StObject
       with CreateRepositoryExceptionsUnion
       with UpdateRepositoryDescriptionExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException
  }
  object InvalidRepositoryDescriptionException {
    
    inline def apply(): InvalidRepositoryDescriptionException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryDescriptionException")
      __obj.asInstanceOf[InvalidRepositoryDescriptionException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidRepositoryDescriptionException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryDescriptionException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryDescriptionExceptionDetails extends StObject
}
