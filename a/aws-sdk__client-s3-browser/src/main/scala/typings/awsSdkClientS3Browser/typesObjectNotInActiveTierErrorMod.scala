package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectNotInActiveTierErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ObjectNotInActiveTierErrorDetails> * / any */ @js.native
  trait ObjectNotInActiveTierError extends StObject {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError = js.native
  }
  object ObjectNotInActiveTierError {
    
    @scala.inline
    def apply(name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError): ObjectNotInActiveTierError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectNotInActiveTierError]
    }
    
    @scala.inline
    implicit class ObjectNotInActiveTierErrorMutableBuilder[Self <: ObjectNotInActiveTierError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ObjectNotInActiveTierErrorDetails extends StObject
}
