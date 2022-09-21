package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.EnvironmentError
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.UnmarshalledEnvironmentError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvironmentResponseMod {
  
  trait EnvironmentResponse extends StObject {
    
    /**
      * <p>Error messages for environment variables that could not be applied.</p>
      */
    var Error: js.UndefOr[EnvironmentError] = js.undefined
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    var Variables: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  }
  object EnvironmentResponse {
    
    inline def apply(): EnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentResponse]
    }
    
    extension [Self <: EnvironmentResponse](x: Self) {
      
      inline def setError(value: EnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      inline def setVariables(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
  
  trait UnmarshalledEnvironmentResponse
    extends StObject
       with EnvironmentResponse {
    
    /**
      * <p>Error messages for environment variables that could not be applied.</p>
      */
    @JSName("Error")
    var Error_UnmarshalledEnvironmentResponse: js.UndefOr[UnmarshalledEnvironmentError] = js.undefined
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    @JSName("Variables")
    var Variables_UnmarshalledEnvironmentResponse: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object UnmarshalledEnvironmentResponse {
    
    inline def apply(): UnmarshalledEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEnvironmentResponse]
    }
    
    extension [Self <: UnmarshalledEnvironmentResponse](x: Self) {
      
      inline def setError(value: UnmarshalledEnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
}
