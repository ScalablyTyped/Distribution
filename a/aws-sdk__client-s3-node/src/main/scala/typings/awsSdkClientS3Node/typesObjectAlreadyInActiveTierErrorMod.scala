package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectAlreadyInActiveTierErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ObjectAlreadyInActiveTierErrorDetails> * / any */ trait ObjectAlreadyInActiveTierError extends StObject {
    
    var name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError
  }
  object ObjectAlreadyInActiveTierError {
    
    @scala.inline
    def apply(): ObjectAlreadyInActiveTierError = {
      val __obj = js.Dynamic.literal(name = "ObjectAlreadyInActiveTierError")
      __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
    }
    
    @scala.inline
    implicit class ObjectAlreadyInActiveTierErrorMutableBuilder[Self <: ObjectAlreadyInActiveTierError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ObjectAlreadyInActiveTierError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectAlreadyInActiveTierErrorDetails extends StObject
}
