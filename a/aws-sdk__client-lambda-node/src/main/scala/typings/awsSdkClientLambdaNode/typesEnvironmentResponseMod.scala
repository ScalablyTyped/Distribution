package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.EnvironmentError
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.UnmarshalledEnvironmentError
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvironmentResponseMod {
  
  @js.native
  trait EnvironmentResponse extends StObject {
    
    /**
      * <p>Error messages for environment variables that could not be applied.</p>
      */
    var Error: js.UndefOr[EnvironmentError] = js.native
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    var Variables: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  }
  object EnvironmentResponse {
    
    @scala.inline
    def apply(): EnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentResponse]
    }
    
    @scala.inline
    implicit class EnvironmentResponseMutableBuilder[Self <: EnvironmentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: EnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      @scala.inline
      def setVariables(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEnvironmentResponse extends EnvironmentResponse {
    
    /**
      * <p>Error messages for environment variables that could not be applied.</p>
      */
    @JSName("Error")
    var Error_UnmarshalledEnvironmentResponse: js.UndefOr[UnmarshalledEnvironmentError] = js.native
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    @JSName("Variables")
    var Variables_UnmarshalledEnvironmentResponse: js.UndefOr[StringDictionary[String]] = js.native
  }
  object UnmarshalledEnvironmentResponse {
    
    @scala.inline
    def apply(): UnmarshalledEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEnvironmentResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledEnvironmentResponseMutableBuilder[Self <: UnmarshalledEnvironmentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: UnmarshalledEnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      @scala.inline
      def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
}
