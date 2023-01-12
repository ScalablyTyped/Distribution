package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBlobIdRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BlobIdRequiredExceptionDetails> * / any */ trait BlobIdRequiredException
    extends StObject
       with GetBlobExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException
  }
  object BlobIdRequiredException {
    
    inline def apply(): BlobIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "BlobIdRequiredException")
      __obj.asInstanceOf[BlobIdRequiredException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlobIdRequiredException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlobIdRequiredExceptionDetails extends StObject
}
