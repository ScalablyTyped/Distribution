package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientKmsNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTagExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TagExceptionDetails> * / any */ trait TagException
    extends StObject
       with CreateKeyExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.TagException
  }
  object TagException {
    
    @scala.inline
    def apply(): TagException = {
      val __obj = js.Dynamic.literal(name = "TagException")
      __obj.asInstanceOf[TagException]
    }
    
    @scala.inline
    implicit class TagExceptionMutableBuilder[Self <: TagException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.TagException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TagExceptionDetails {
    
    @scala.inline
    def apply(): TagExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagExceptionDetails]
    }
    
    @scala.inline
    implicit class TagExceptionDetailsMutableBuilder[Self <: TagExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
