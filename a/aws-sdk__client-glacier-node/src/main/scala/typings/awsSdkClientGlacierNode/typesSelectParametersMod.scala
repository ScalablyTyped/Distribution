package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.SQL
import typings.awsSdkClientGlacierNode.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientGlacierNode.typesInputSerializationMod.UnmarshalledInputSerialization
import typings.awsSdkClientGlacierNode.typesOutputSerializationMod.OutputSerialization
import typings.awsSdkClientGlacierNode.typesOutputSerializationMod.UnmarshalledOutputSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectParametersMod {
  
  trait SelectParameters extends StObject {
    
    /**
      * <p>The expression that is used to select the object.</p>
      */
    var Expression: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The type of the provided expression, for example <code>SQL</code>.</p>
      */
    var ExpressionType: js.UndefOr[SQL | String] = js.undefined
    
    /**
      * <p>Describes the serialization format of the object.</p>
      */
    var InputSerialization: js.UndefOr[typings.awsSdkClientGlacierNode.typesInputSerializationMod.InputSerialization] = js.undefined
    
    /**
      * <p>Describes how the results of the select job are serialized.</p>
      */
    var OutputSerialization: js.UndefOr[typings.awsSdkClientGlacierNode.typesOutputSerializationMod.OutputSerialization] = js.undefined
  }
  object SelectParameters {
    
    inline def apply(): SelectParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectParameters]
    }
    
    extension [Self <: SelectParameters](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionType(value: SQL | String): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
      
      inline def setExpressionTypeUndefined: Self = StObject.set(x, "ExpressionType", js.undefined)
      
      inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
      
      inline def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
      
      inline def setInputSerializationUndefined: Self = StObject.set(x, "InputSerialization", js.undefined)
      
      inline def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
      
      inline def setOutputSerializationUndefined: Self = StObject.set(x, "OutputSerialization", js.undefined)
    }
  }
  
  trait UnmarshalledSelectParameters
    extends StObject
       with SelectParameters {
    
    /**
      * <p>Describes the serialization format of the object.</p>
      */
    @JSName("InputSerialization")
    var InputSerialization_UnmarshalledSelectParameters: js.UndefOr[UnmarshalledInputSerialization] = js.undefined
    
    /**
      * <p>Describes how the results of the select job are serialized.</p>
      */
    @JSName("OutputSerialization")
    var OutputSerialization_UnmarshalledSelectParameters: js.UndefOr[UnmarshalledOutputSerialization] = js.undefined
  }
  object UnmarshalledSelectParameters {
    
    inline def apply(): UnmarshalledSelectParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSelectParameters]
    }
    
    extension [Self <: UnmarshalledSelectParameters](x: Self) {
      
      inline def setInputSerialization(value: UnmarshalledInputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
      
      inline def setInputSerializationUndefined: Self = StObject.set(x, "InputSerialization", js.undefined)
      
      inline def setOutputSerialization(value: UnmarshalledOutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
      
      inline def setOutputSerializationUndefined: Self = StObject.set(x, "OutputSerialization", js.undefined)
    }
  }
}
