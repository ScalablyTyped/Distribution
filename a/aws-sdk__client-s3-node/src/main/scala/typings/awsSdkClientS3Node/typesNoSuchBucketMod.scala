package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchBucketMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchBucketDetails> * / any */ trait NoSuchBucket extends StObject {
    
    var name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket
  }
  object NoSuchBucket {
    
    @scala.inline
    def apply(): NoSuchBucket = {
      val __obj = js.Dynamic.literal(name = "NoSuchBucket")
      __obj.asInstanceOf[NoSuchBucket]
    }
    
    @scala.inline
    implicit class NoSuchBucketMutableBuilder[Self <: NoSuchBucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchBucket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoSuchBucketDetails extends StObject
}
