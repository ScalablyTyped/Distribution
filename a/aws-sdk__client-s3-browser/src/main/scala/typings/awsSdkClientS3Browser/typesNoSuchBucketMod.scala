package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchBucketMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchBucketDetails> * / any */ @js.native
  trait NoSuchBucket extends StObject {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchBucket = js.native
  }
  object NoSuchBucket {
    
    @scala.inline
    def apply(name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchBucket): NoSuchBucket = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoSuchBucket]
    }
    
    @scala.inline
    implicit class NoSuchBucketMutableBuilder[Self <: NoSuchBucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchBucket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoSuchBucketDetails extends StObject
}
