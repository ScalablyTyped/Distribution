package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.awsSdkClientKmsNode.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.awsSdkClientKmsNode.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidMarkerExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidMarkerExceptionDetails> * / any */ trait InvalidMarkerException
    extends StObject
       with ListAliasesExceptionsUnion
       with ListGrantsExceptionsUnion
       with ListKeysExceptionsUnion
       with ListResourceTagsExceptionsUnion
       with ListRetirableGrantsExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidMarkerException
  }
  object InvalidMarkerException {
    
    @scala.inline
    def apply(): InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = "InvalidMarkerException")
      __obj.asInstanceOf[InvalidMarkerException]
    }
    
    @scala.inline
    implicit class InvalidMarkerExceptionMutableBuilder[Self <: InvalidMarkerException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidMarkerException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidMarkerExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidMarkerExceptionDetails {
    
    @scala.inline
    def apply(): InvalidMarkerExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidMarkerExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidMarkerExceptionDetailsMutableBuilder[Self <: InvalidMarkerExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
