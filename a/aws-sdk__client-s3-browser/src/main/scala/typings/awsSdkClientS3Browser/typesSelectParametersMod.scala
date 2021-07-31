package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typings.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Browser.typesInputSerializationMod.UnmarshalledInputSerialization
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.UnmarshalledOutputSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectParametersMod {
  
  trait SelectParameters extends StObject {
    
    /**
      * <p>The expression that is used to query the object.</p>
      */
    var Expression: String
    
    /**
      * <p>The type of the provided expression (e.g., SQL).</p>
      */
    var ExpressionType: SQL | String
    
    /**
      * <p>Describes the serialization format of the object.</p>
      */
    var InputSerialization: typings.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
    
    /**
      * <p>Describes how the results of the Select job are serialized.</p>
      */
    var OutputSerialization: typings.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
  }
  object SelectParameters {
    
    @scala.inline
    def apply(
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      OutputSerialization: OutputSerialization
    ): SelectParameters = {
      val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectParameters]
    }
    
    @scala.inline
    implicit class SelectParametersMutableBuilder[Self <: SelectParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionType(value: SQL | String): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledSelectParameters
    extends StObject
       with SelectParameters {
    
    /**
      * <p>Describes the serialization format of the object.</p>
      */
    @JSName("InputSerialization")
    var InputSerialization_UnmarshalledSelectParameters: UnmarshalledInputSerialization
    
    /**
      * <p>Describes how the results of the Select job are serialized.</p>
      */
    @JSName("OutputSerialization")
    var OutputSerialization_UnmarshalledSelectParameters: UnmarshalledOutputSerialization
  }
  object UnmarshalledSelectParameters {
    
    @scala.inline
    def apply(
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: UnmarshalledInputSerialization,
      OutputSerialization: UnmarshalledOutputSerialization
    ): UnmarshalledSelectParameters = {
      val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSelectParameters]
    }
    
    @scala.inline
    implicit class UnmarshalledSelectParametersMutableBuilder[Self <: UnmarshalledSelectParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputSerialization(value: UnmarshalledInputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSerialization(value: UnmarshalledOutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    }
  }
}
