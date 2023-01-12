package typings.awsSdkUtilErrorConstructor

import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-error-constructor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initServiceException(error: js.Error, option: ServiceExceptionOption): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initServiceException")(error.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ServiceExceptionOption extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /** a human readable description of this exception */
    var message: js.UndefOr[String] = js.undefined
    
    /** name of exception */
    var name: js.UndefOr[String] = js.undefined
    
    /** the name of the operation that throws the exception */
    var operationName: js.UndefOr[String] = js.undefined
    
    /** parsed exception object normalized according to its API model */
    var rawException: js.UndefOr[Any] = js.undefined
  }
  object ServiceExceptionOption {
    
    inline def apply($metadata: ResponseMetadata): ServiceExceptionOption = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceExceptionOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceExceptionOption] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      inline def setRawException(value: Any): Self = StObject.set(x, "rawException", value.asInstanceOf[js.Any])
      
      inline def setRawExceptionUndefined: Self = StObject.set(x, "rawException", js.undefined)
    }
  }
}
