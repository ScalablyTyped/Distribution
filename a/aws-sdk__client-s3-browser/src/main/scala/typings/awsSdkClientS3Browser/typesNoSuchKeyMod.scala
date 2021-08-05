package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchKeyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchKeyDetails> * / any */ trait NoSuchKey extends StObject {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey
  }
  object NoSuchKey {
    
    inline def apply(): NoSuchKey = {
      val __obj = js.Dynamic.literal(name = "NoSuchKey")
      __obj.asInstanceOf[NoSuchKey]
    }
    
    extension [Self <: NoSuchKey](x: Self) {
      
      inline def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoSuchKeyDetails extends StObject
}
