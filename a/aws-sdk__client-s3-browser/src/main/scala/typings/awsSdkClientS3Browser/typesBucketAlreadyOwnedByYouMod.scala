package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketAlreadyOwnedByYouMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BucketAlreadyOwnedByYouDetails> * / any */ trait BucketAlreadyOwnedByYou
    extends StObject
       with CreateBucketExceptionsUnion {
    
    var name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou
  }
  object BucketAlreadyOwnedByYou {
    
    inline def apply(): BucketAlreadyOwnedByYou = {
      val __obj = js.Dynamic.literal(name = "BucketAlreadyOwnedByYou")
      __obj.asInstanceOf[BucketAlreadyOwnedByYou]
    }
    
    extension [Self <: BucketAlreadyOwnedByYou](x: Self) {
      
      inline def setName(value: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BucketAlreadyOwnedByYouDetails extends StObject
}
