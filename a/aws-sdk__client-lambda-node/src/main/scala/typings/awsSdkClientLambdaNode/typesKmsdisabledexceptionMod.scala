package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsdisabledexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSDisabledExceptionDetails> * / any */ @js.native
  trait KMSDisabledException extends InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException = js.native
  }
  object KMSDisabledException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException): KMSDisabledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KMSDisabledException]
    }
    
    @scala.inline
    implicit class KMSDisabledExceptionMutableBuilder[Self <: KMSDisabledException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KMSDisabledExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
  }
  object KMSDisabledExceptionDetails {
    
    @scala.inline
    def apply(): KMSDisabledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSDisabledExceptionDetails]
    }
    
    @scala.inline
    implicit class KMSDisabledExceptionDetailsMutableBuilder[Self <: KMSDisabledExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
