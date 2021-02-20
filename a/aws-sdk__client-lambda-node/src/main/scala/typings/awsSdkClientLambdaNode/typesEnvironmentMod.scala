package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvironmentMod {
  
  @js.native
  trait Environment extends StObject {
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    var Variables: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  }
  object Environment {
    
    @scala.inline
    def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVariables(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEnvironment extends Environment {
    
    /**
      * <p>Environment variable key-value pairs.</p>
      */
    @JSName("Variables")
    var Variables_UnmarshalledEnvironment: js.UndefOr[StringDictionary[String]] = js.native
  }
  object UnmarshalledEnvironment {
    
    @scala.inline
    def apply(): UnmarshalledEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEnvironment]
    }
    
    @scala.inline
    implicit class UnmarshalledEnvironmentMutableBuilder[Self <: UnmarshalledEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
    }
  }
}
