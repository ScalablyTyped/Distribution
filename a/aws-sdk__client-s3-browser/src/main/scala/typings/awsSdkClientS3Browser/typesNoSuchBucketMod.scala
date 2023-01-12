package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchBucketMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchBucketDetails> * / any */ trait NoSuchBucket extends StObject {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchBucket
  }
  object NoSuchBucket {
    
    inline def apply(): NoSuchBucket = {
      val __obj = js.Dynamic.literal(name = "NoSuchBucket")
      __obj.asInstanceOf[NoSuchBucket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoSuchBucket] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchBucket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoSuchBucketDetails extends StObject
}
