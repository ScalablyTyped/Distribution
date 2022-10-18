package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesCreateBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketAlreadyExistsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BucketAlreadyExistsDetails> * / any */ trait BucketAlreadyExists
    extends StObject
       with CreateBucketExceptionsUnion {
    
    var name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists
  }
  object BucketAlreadyExists {
    
    inline def apply(): BucketAlreadyExists = {
      val __obj = js.Dynamic.literal(name = "BucketAlreadyExists")
      __obj.asInstanceOf[BucketAlreadyExists]
    }
    
    extension [Self <: BucketAlreadyExists](x: Self) {
      
      inline def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BucketAlreadyExistsDetails extends StObject
}
