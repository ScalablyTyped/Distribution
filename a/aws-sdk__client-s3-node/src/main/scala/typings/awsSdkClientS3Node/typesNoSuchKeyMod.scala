package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchKeyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchKeyDetails> * / any */ trait NoSuchKey extends StObject {
    
    var name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchKey
  }
  object NoSuchKey {
    
    inline def apply(): NoSuchKey = {
      val __obj = js.Dynamic.literal(name = "NoSuchKey")
      __obj.asInstanceOf[NoSuchKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoSuchKey] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoSuchKeyDetails extends StObject
}
