package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetBlobExceptionsUnionMod.GetBlobExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBlobIdDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BlobIdDoesNotExistExceptionDetails> * / any */ trait BlobIdDoesNotExistException
    extends StObject
       with GetBlobExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdDoesNotExistException
  }
  object BlobIdDoesNotExistException {
    
    inline def apply(): BlobIdDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "BlobIdDoesNotExistException")
      __obj.asInstanceOf[BlobIdDoesNotExistException]
    }
    
    extension [Self <: BlobIdDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlobIdDoesNotExistExceptionDetails extends StObject
}
