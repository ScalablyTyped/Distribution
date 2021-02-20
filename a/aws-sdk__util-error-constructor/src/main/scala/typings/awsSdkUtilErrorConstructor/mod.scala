package typings.awsSdkUtilErrorConstructor

import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-error-constructor", "initServiceException")
  @js.native
  def initServiceException(error: Error, option: ServiceExceptionOption): js.Any = js.native
  
  @js.native
  trait ServiceExceptionOption extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /** a human readable description of this exception */
    var message: js.UndefOr[String] = js.native
    
    /** name of exception */
    var name: js.UndefOr[String] = js.native
    
    /** the name of the operation that throws the exception */
    var operationName: js.UndefOr[String] = js.native
    
    /** parsed exception object normalized according to its API model */
    var rawException: js.UndefOr[js.Any] = js.native
  }
  object ServiceExceptionOption {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ServiceExceptionOption = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceExceptionOption]
    }
    
    @scala.inline
    implicit class ServiceExceptionOptionMutableBuilder[Self <: ServiceExceptionOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      @scala.inline
      def setRawException(value: js.Any): Self = StObject.set(x, "rawException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawExceptionUndefined: Self = StObject.set(x, "rawException", js.undefined)
    }
  }
}
