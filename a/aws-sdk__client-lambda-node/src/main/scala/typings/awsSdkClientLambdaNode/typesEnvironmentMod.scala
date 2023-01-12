package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvironmentMod {
  
  trait Environment extends StObject {
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    var Variables: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  }
  object Environment {
    
    inline def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      inline def setVariables(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
  
  trait UnmarshalledEnvironment
    extends StObject
       with Environment {
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    @JSName("Variables")
    var Variables_UnmarshalledEnvironment: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object UnmarshalledEnvironment {
    
    inline def apply(): UnmarshalledEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEnvironment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledEnvironment] (val x: Self) extends AnyVal {
      
      inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
}
