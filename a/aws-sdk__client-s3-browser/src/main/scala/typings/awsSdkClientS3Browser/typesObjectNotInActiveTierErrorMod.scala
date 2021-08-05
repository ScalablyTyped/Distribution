package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectNotInActiveTierErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ObjectNotInActiveTierErrorDetails> * / any */ trait ObjectNotInActiveTierError extends StObject {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError
  }
  object ObjectNotInActiveTierError {
    
    inline def apply(): ObjectNotInActiveTierError = {
      val __obj = js.Dynamic.literal(name = "ObjectNotInActiveTierError")
      __obj.asInstanceOf[ObjectNotInActiveTierError]
    }
    
    extension [Self <: ObjectNotInActiveTierError](x: Self) {
      
      inline def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectNotInActiveTierErrorDetails extends StObject
}
