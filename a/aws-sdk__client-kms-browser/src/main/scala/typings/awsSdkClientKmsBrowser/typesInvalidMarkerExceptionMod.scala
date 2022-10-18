package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesListAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
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
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException
  }
  object InvalidMarkerException {
    
    inline def apply(): InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = "InvalidMarkerException")
      __obj.asInstanceOf[InvalidMarkerException]
    }
    
    extension [Self <: InvalidMarkerException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidMarkerExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidMarkerExceptionDetails {
    
    inline def apply(): InvalidMarkerExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidMarkerExceptionDetails]
    }
    
    extension [Self <: InvalidMarkerExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
